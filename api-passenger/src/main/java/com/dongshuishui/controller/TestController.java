package com.dongshuishui.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author：东水水
 * @createTime：2023/11/8 -15:28
 * @describe: com.dongshuishui.controller
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "test api passenger";
    }
}
