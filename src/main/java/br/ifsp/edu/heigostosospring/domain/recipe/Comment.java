package br.ifsp.edu.heigostosospring.domain.recipe;

import br.ifsp.edu.heigostosospring.domain.AbstractEntity;
import br.ifsp.edu.heigostosospring.domain.user.User;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "comments")
public class Comment extends AbstractEntity<Integer> {

    @Column(nullable = false)
    private String text;

    @Column(name="data", nullable = false, columnDefinition = "DATE")
    private LocalDate dateTime;

    @ManyToOne
    @JoinColumn(name = "comments_fk")
    private Recipe recipe;

    @OneToOne(cascade =  CascadeType.ALL)
    @JoinColumn(name = "user_id_commets_fk")
    private User user;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDate getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDate dateTime) {
        this.dateTime = dateTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }


}
