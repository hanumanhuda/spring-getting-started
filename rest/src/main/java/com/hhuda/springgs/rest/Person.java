package com.hhuda.springgs.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/person/")
public class Person {
    @RequestMapping("name")
    public String getName(){
        return "hanuman";
    }
}
