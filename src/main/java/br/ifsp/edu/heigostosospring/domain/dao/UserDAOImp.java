package br.ifsp.edu.heigostosospring.domain.dao;

import br.ifsp.edu.heigostosospring.domain.user.User;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class UserDAOImp extends AbstractDAO<User, Integer> implements UserDAO {
    @Override
    public User validate(String email, String password) {
        String jpql = new StringBuilder("SELECT u from User u ")
                .append("WHERE email = ?1 and password = ?2")
                .toString();

        List<User> users = createQuery(jpql,email,password);

        if(users.size() == 1)
            return users.get(0);
        return null;
    }
}
