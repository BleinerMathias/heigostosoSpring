package br.ifsp.edu.heigostosospring.service;

import br.ifsp.edu.heigostosospring.domain.user.User;

import java.util.List;

public interface UserService {

    void salvar(User user);

    void editar(User user);

    void excluir(Integer id);

    User buscarPorId(Integer id);

    List<User> buscarTodos();


}
