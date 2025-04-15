package com.springbootdockerjenkins.springbootdockerjenkinsdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class DockerController {

    @GetMapping("/response")
    public String getResponse(){
        return "Hii this is docker jenkins example";
    }
}
