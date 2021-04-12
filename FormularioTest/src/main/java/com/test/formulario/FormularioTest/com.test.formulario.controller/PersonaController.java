package com.test.formulario.FormularioTest.com.test.formulario.controller;

import com.test.formulario.FormularioTest.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonaController {
    @Autowired
    private IPersonaService service;

    @GetMapping("/listar")
    public String listar(Model model){
        service.listar();
        model.addAttribute("personas", service.listar());
        return "index";
    }
}
