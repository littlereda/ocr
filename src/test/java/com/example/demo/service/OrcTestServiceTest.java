package com.example.demo.service;

import org.bytedeco.javacpp.opencv_core;
import org.bytedeco.javacpp.opencv_imgcodecs;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author hbc
 * @version 1.0
 * @description 描述
 * @date 2023/4/24 15:22
 */
@SpringBootTest
public class OrcTestServiceTest {

    @Autowired
    private OrcTestService orcTestService;

    @Test
    void test() throws Exception {
        opencv_core.Mat mat= opencv_imgcodecs.imread("C:\\Users\\csht\\Desktop\\images\\14.jpg");
        orcTestService.cardUp(mat);
    }
}
