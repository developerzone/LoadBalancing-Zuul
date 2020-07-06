package com.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.core.env.Environment;

@RestController
@RequestMapping("/healthcheck")
public class MyAppController
{
    @Autowired
    private Environment env;

    @GetMapping()
    public ResponseEntity<String> healthCheck() {
        return new ResponseEntity<String>("My App is up and running fine at port : "+env.getProperty("local.server.port"), new HttpHeaders(), HttpStatus.OK);
    }
}