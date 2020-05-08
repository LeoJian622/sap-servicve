package cn.com.wdi.scm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

/**
 * Swagger2 config
 *
 * @author liyongjian
 * @date 2020-04-29 11:10
 */

@Configuration
@EnableSwagger2
public class Swagger2Config{

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("cn.com.wdi.scm.controller"))
                .paths(PathSelectors.any())
                .build()
                .securitySchemes(security())
                ;
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("SCM - Restful Api")
                .description("SCM系统API文档")
                .version("1.0")
                .build();
    }

    private List<ApiKey> security() {
        return newArrayList(
                new ApiKey("session", "JSESSIONID", "header")
        );
    }

}
