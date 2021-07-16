package br.ifsp.edu.heigostosospring.domain.dao;

import br.ifsp.edu.heigostosospring.domain.user.User;

import java.util.List;

public interface UserDAO {

    void save(User user);
    void update(User user);
    void delete(Integer id);

    User findById(Integer id);

    List<User> findAll();

    User validate(String email, String password);

}
