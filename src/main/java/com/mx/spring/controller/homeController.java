package com.mx.spring.controller;

import com.mx.spring.entities.Medico;
import com.mx.spring.service.MedicoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {

    @Autowired
    private MedicoService medicoService;

    @RequestMapping("/home")
    public String home(Model model) {
        List<Medico> medicos = medicoService.getAll();
        model.addAttribute("Saludo", "Hola mundo!!!!!!!!!!");
        model.addAttribute("medicos",medicos);
        return "/home/index";

    }

}
