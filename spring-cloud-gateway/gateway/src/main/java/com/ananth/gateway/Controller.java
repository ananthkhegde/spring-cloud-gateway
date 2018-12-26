package com.ananth.gateway;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/fallback")
    public ResponseEntity<Response> fallBack() {
        Response response = new Response();
        response.setStatus(HttpStatus.GATEWAY_TIMEOUT.value());
        response.setMessage("Server is busy.Please try after some time");
        return new ResponseEntity<>(response, HttpStatus.GATEWAY_TIMEOUT);
    }
}