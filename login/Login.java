package Tarefa---ES-III---Reposi-o-3.login;

import Tarefa---ES-III---Reposi-o-3.user.User;

public class Login {
    public void authenticate(User user) {
        System.out.println("Usuário " + user.getLogin() + " autenticado com login e senha");
    }
}
