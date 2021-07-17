package br.ifsp.edu.heigostosospring.controller;

import br.ifsp.edu.heigostosospring.domain.recipe.Comment;
import br.ifsp.edu.heigostosospring.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/comentarios")
public class commentController {

    @Autowired
    private CommentService commentService;

    @PostMapping("/salvar")
    public String salvar(Comment comment, HttpSession session){

        if(comment != null) {
            if (session.getAttribute("userLogged") != null) {
                commentService.salvar(comment);
                return "redirect:/receita/view/"+ comment.getRecipe().getId();
            } else {
                return "redirect:/usuario/login";
            }
        }
        return "redirect:/usuario/login";
    }
}
