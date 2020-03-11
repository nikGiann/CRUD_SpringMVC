/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asterixnick.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Nikos
 */
@Controller 
@RequestMapping("/")
public class HomeController {
    
    @RequestMapping
    public String home(){
        return "home";
    }
    
}
