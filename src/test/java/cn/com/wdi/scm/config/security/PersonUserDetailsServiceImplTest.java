package cn.com.wdi.scm.config.security;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class PersonUserDetailsServiceImplTest {

    @Autowired
    PersonUserDetailsServiceImpl personUserDetailsService;

    @Test
    void loadUserByUsername() {
        System.out.println(personUserDetailsService.loadUserByUsername("test"));
    }
}