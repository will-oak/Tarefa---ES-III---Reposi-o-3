package Tarefa---ES-III---Reposi-o-3.login;

import Tarefa---ES-III---Reposi-o-3.user.User;

public class TokenLoginAdapter implements LoginAuthenticate{
    private final TokenLogin tokenLogin;

    public TokenLoginAdapter(TokenLogin tokenLogin) {
        this.tokenLogin = tokenLogin;
    }

    @Override
    public void authenticate(User user) {
        tokenLogin.authenticate(user);
    }
}
