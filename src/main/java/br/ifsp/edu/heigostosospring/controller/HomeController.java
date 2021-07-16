package br.ifsp.edu.heigostosospring.controller;

import br.ifsp.edu.heigostosospring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "/index";
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
