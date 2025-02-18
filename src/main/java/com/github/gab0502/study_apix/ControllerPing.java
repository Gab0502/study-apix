package com.github.gab0502.study_apix;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ping")
public class ControllerPing {

    @GetMapping
    public String ping(){
        return "pong";
    }

    // public String teste(){
    //     return "teste";
    // }
}
