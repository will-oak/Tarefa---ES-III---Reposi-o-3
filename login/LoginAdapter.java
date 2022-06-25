package Tarefa---ES-III---Reposi-o-3.login;

import Tarefa---ES-III---Reposi-o-3.user.User;

public class LoginAdapter implements LoginAuthenticate {

    private final Login login;

    public LoginAdapter(Login login) {
        this.login = login;
    }

    @Override
    public void authenticate(User user) {
        login.authenticate(user);
    }
}
