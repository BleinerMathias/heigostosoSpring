package br.ifsp.edu.heigostosospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "/index";
    }

    @GetMapping("/registrar")
    public String register(){
        return "/registrar.html";
    }

    @GetMapping("/login")
    public String login(){
        return "/login.html";
    }

    @GetMapping("/receitas")
    public String receitas(){
        return "/receitasCategoria.html";
    }

    @GetMapping("/receita")
    public String receita(){
        return "/visualizaReceita.html";
    }
}
