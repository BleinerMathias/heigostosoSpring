package br.ifsp.edu.heigostosospring.controller;

import br.ifsp.edu.heigostosospring.domain.user.User;
import br.ifsp.edu.heigostosospring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/usuario")
public class usuarioController {

    @Autowired
    private UserService service;

    @GetMapping("/registrar")
    public String register(User user){
        return "/registrar.html";
    }


    @PostMapping("/salvar")
    public String salvar(User user){
        service.salvar(user);
        return "redirect:/usuario/login";
    }

    @GetMapping("/login")
    public String login(User user){
        return "/login";
    }

    @PostMapping("/efetuaLogin")
    public String makeLogin(User user, HttpSession session)
    {
        User validate = (User) service.validate(user.getEmail().toString(), user.getPassword().toString());
        if(validate != null){
            session.setAttribute("userLogged", validate);
            return "redirect:/receita/minhasReceitas";
        }
        return "/login.html";
    }


    @GetMapping("/logout")
    public String logout(HttpSession session){
        if(session.getAttribute("userLogged") != null)
            session.invalidate();
        return "/usuario/login";
    }

    @GetMapping("/dashboard")
    public String dashboard(){
        return "/menuUsuario.html";
    }



}
