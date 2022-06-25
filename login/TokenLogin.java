package Tarefa---ES-III---Reposi-o-3.login;

import Tarefa---ES-III---Reposi-o-3.user.User;

public class TokenLogin {
    public void authenticate(User user) {
        System.out.println("Usuário autenticado com o token " + user.getToken());
    }
}
