package com.jncp.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jncp")
@Slf4j
public class JncpController {

    @GetMapping("/checkHealth")
    public String checkHealth(){
        log.info("Request to check application health check.");
        return "UP";
    }
}
