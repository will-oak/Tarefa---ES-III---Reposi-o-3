package Tarefa---ES-III---Reposi-o-3.login;

import Tarefa---ES-III---Reposi-o-3.user.User;

public class GoogleLoginAdapter implements LoginAuthenticate{
    private final GoogleLogin googleLogin;

    public GoogleLoginAdapter(GoogleLogin googleLogin) {
        this.googleLogin = googleLogin;
    }

    @Override
    public void authenticate(User user) {
        googleLogin.authenticate(user);
    }
}
