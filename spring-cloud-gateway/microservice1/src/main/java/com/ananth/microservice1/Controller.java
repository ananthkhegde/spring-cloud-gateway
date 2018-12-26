package com.ananth.microservice1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    @ResponseBody
    public String hello(){
        return "Welcome to Microservice 1";
    }
}