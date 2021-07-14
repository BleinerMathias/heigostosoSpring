package br.ifsp.edu.heigostosospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/user")
public class usuarioController {

    @GetMapping("/dashboard")
    public String dashboard(){
        return "/menuUsuario.html";
    }

    @GetMapping("/minhasReceitas")
    public String listarReceitas(){
        return "/receitasUsuario.html";
    }

}
