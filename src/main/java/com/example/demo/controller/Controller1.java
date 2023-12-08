package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;

@RestController
@RequestMapping("/test")
public class Controller1 {

    @RequestMapping(value = "/t01", method = RequestMethod.POST)
    public String t01p(@RequestBody Apple aa) {
        System.err.println("zz:" + aa.getReasonItem());
        return "21321";
    }

    @RequestMapping(value = "/t01", method = RequestMethod.GET)
    public String t01g() {
        System.err.println("zz555");
        return "321321";
    }
}

@Data
class Apple {
    String reasonItem;
}