package com.haliri.israj.javaspringbootoauth2server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Created by israjhaliri on 9/19/17.
 */

@RestController
@RequestMapping("/rest/hello")
public class HelloResource {

    @GetMapping
    public String hello(){
        return "hello world";
    }

    @GetMapping("/principal")
    public Principal user(Principal principal){
        return  principal;
    }
}
