package com.haliri.israj.javaspringbootoauth2client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Map;

/**
 * Created by israjhaliri on 11/12/17.
 */

@RestController
public class ApiController {

    @RequestMapping(value = "/api/users/principal", method = RequestMethod.GET)
    public String getPrincipal(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return "name : "+ authentication.getName()+ "\nauthorities : "+ authentication.getAuthorities();
    }
}
