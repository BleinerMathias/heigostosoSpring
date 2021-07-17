package br.ifsp.edu.heigostosospring.controller;

import br.ifsp.edu.heigostosospring.domain.recipe.Comment;
import br.ifsp.edu.heigostosospring.domain.recipe.Ingredients;
import br.ifsp.edu.heigostosospring.domain.recipe.Instructions;
import br.ifsp.edu.heigostosospring.domain.recipe.Recipe;
import br.ifsp.edu.heigostosospring.domain.user.User;
import br.ifsp.edu.heigostosospring.service.*;
import org.aspectj.apache.bcel.generic.Instruction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.time.LocalDate;

@Controller
@RequestMapping("/receita")
public class RecipeController {

    @Autowired
    private RecipeService service;

    @Autowired
    private IngredientService ingredientService;

    @Autowired
    private InstructionsService instructionsService;

    @Autowired
    private UserService userService;

    @Autowired
    private CommentService commentService;

    private Recipe recipe;


    @GetMapping("/nova")
    public String newRecipe(Recipe recipe, HttpSession session){
        User user = (User) session.getAttribute("userLogged");
        recipe.setUser(user);
        return "/criaReceita.html";
    }

    @GetMapping("/editar/{id}")
    public String editRecipe(@PathVariable("id") Integer id, ModelMap model, Ingredients ingredient, Instructions instructions){
        recipe = service.buscarPorId(id);
        ingredient.setRecipe(service.buscarPorId(id));
        instructions.setRecipe(service.buscarPorId(id));

        model.addAttribute("dataRecipe",recipe);
        model.addAttribute("Ingredients", ingredientService.buscarPorReceita(id));
        model.addAttribute("Instructions", instructionsService.buscarPorReceita(id));
        return "/populaReceita.html";
    }

    @PostMapping("/addIngrediente")
    public String addIngredient(Ingredients ingredients){
        ingredientService.salvar(ingredients);
        return "redirect:/receita/editar/" + ingredients.getRecipe().getId();
    }

    @PostMapping("/addModo")
    public String addDIY(Instructions instructions){
        //instructions.setRecipe(recipe);
        instructionsService.salvar(instructions);
        return "redirect:/receita/editar/" + instructions.getRecipe().getId();
    }

    @PostMapping("/salvar")
    public String saveNewRecipe(Recipe recipe){
        service.salvar(recipe);
        return "redirect:/receita/minhasReceitas";
    }

    @GetMapping("/minhasReceitas")
    public String listarReceitas(ModelMap map, HttpSession session){
        User user = (User) session.getAttribute("userLogged");
        map.addAttribute("recipes",service.findByUser(user.getId()));
        return "/minhasReceitas.html";
    }

    @GetMapping("/view/{id}")
    public String viewRecipe(@PathVariable("id") Integer id, ModelMap map, HttpSession session, Comment comment){
        User user = (User) session.getAttribute("userLogged");
        comment.setUser(user);
        comment.setRecipe(service.buscarPorId(id));
        comment.setDateTime(LocalDate.now());

        map.addAttribute("recipe",service.buscarPorId(id));
        map.addAttribute("user",user);
        map.addAttribute("commentsUsers",commentService.findByRecipe(service.buscarPorId(id).getId()));
        return "/visualizaReceita.html";
    }




}
