package br.ifsp.edu.heigostosospring.domain.recipe;

import br.ifsp.edu.heigostosospring.domain.AbstractEntity;
import br.ifsp.edu.heigostosospring.domain.user.User;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "recipe")
public class Recipe extends AbstractEntity<Integer> {

    @Column(name = "name", nullable = false, length = 60)
    private String name;

    @Column(name = "portions", nullable = false)
    private Integer portions;

    @Column(nullable = false)
    private Integer cookingTime;

    @Column(nullable = false)
    private String image;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_fk")
    private User user;

    @OneToMany(mappedBy = "recipe")
    private List<Ingredients> ingredientsList;

    @OneToMany(mappedBy = "recipe")
    private List<Instructions> instructionsList;

    @Enumerated(EnumType.STRING)
    private Category category;

    @OneToMany(mappedBy = "recipe")
    private List<Comment> commentsList;

    /*
    @OneToMany(mappedBy = "ratings")
    private List<Rating> ratingList;
*/
    public Recipe() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPortions() {
        return portions;
    }

    public void setPortions(Integer portions) {
        this.portions = portions;
    }

    public Integer getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(Integer cookingTime) {
        this.cookingTime = cookingTime;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<Ingredients> getIngredientsList() {
        return ingredientsList;
    }

    public void setIngredientsList(List<Ingredients> ingredientsList) {
        this.ingredientsList = ingredientsList;
    }

    public List<Instructions> getInstructionsList() {
        return instructionsList;
    }

    public void setInstructionsList(List<Instructions> instructionsList) {
        this.instructionsList = instructionsList;
    }

    public List<Comment> getCommentsList() {
        return commentsList;
    }

    public void setCommentsList(List<Comment> commentsList) {
        this.commentsList = commentsList;
    }
/*
    public List<Rating> getRatingList() {
        return ratingList;
    }

    public void setRatingList(List<Rating> ratingList) {
        this.ratingList = ratingList;
    }

*/

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Comment> getComments() {
        return commentsList;
    }

    public void setComments(List<Comment> commentsList) {
        this.commentsList = commentsList;
    }


}
