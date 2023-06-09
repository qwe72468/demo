package com.example.api.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@Slf4j
@RestController
public class DemoController {


    @GetMapping(value = "/index")
    public Integer demoMethod() {

        log.info("DemoController demoMethod, " + new Date().getTime());
        return 324;
    }

}
