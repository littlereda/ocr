package com.example.demo.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;

/**
 * @author hbc
 * @version 1.0
 * @description 描述
 * @date 2023/4/23 11:13
 */
@SpringBootTest
class OrcServiceTest {

    @Autowired
    private OrcService orcService;

    @Test
    void test(){
        File temp = new File("C:\\Users\\csht\\Desktop\\images\\22.jpg");
        String code = orcService.orc(temp.getAbsolutePath());
        System.out.println(code);
    }
}
