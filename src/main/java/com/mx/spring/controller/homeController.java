
package com.mx.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class homeController {
    
    @RequestMapping("/home")
    public String home(Model model){
        
        
        model.addAttribute("Saludo","Hola mundo");
        return "/home/index";
        
    }
    
}
