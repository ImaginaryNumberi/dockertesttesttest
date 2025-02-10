package com.bdh.dockertest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DockertestApplicationTests {
    MainService mainService = new MainService();

    @Test
    void contextLoads() {
        int a = 1;
        int b = 5;
        assertEquals(3, mainService.sum(1,2));
    }

}
