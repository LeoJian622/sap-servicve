package cn.com.wdi.scm.converter;

import cn.com.wdi.scm.model.master.SapConfig;
import cn.com.wdi.scm.sap.api.config.CustomDestinationDataProvider;
import lombok.extern.slf4j.Slf4j;

import java.util.Properties;

/**
 * 将SAP配置对象转换为Properties对象
 *
 * @author ??????
 * @create 2020-03-19 15:06
 */

@Slf4j
public class SapConfig2PropertiesConverter {

    public static Properties convert(SapConfig sapConfig){
        if (null == sapConfig){
            log.error("SapConfig 为空不能转换");
            throw new NullPointerException();
        }
        Properties properties = new Properties();
        properties.setProperty(CustomDestinationDataProvider.JCO_ASHOST,sapConfig.getAshost());
        properties.setProperty(CustomDestinationDataProvider.JCO_SYSNR,sapConfig.getSysnr());
        properties.setProperty(CustomDestinationDataProvider.JCO_CLIENT,sapConfig.getClient());
        properties.setProperty(CustomDestinationDataProvider.JCO_USER,sapConfig.getUsername());
        properties.setProperty(CustomDestinationDataProvider.JCO_PASSWD,sapConfig.getPaswword());
        properties.setProperty(CustomDestinationDataProvider.JCO_PEAK_LIMIT,sapConfig.getPeakLimit());
        properties.setProperty(CustomDestinationDataProvider.JCO_POOL_CAPACITY,sapConfig.getPoolCapacity());
        properties.setProperty(CustomDestinationDataProvider.JCO_LANG,sapConfig.getLang());
        properties.setProperty(CustomDestinationDataProvider.JCO_SAPROUTER,sapConfig.getSapRouter());
        return properties;
    }
}
