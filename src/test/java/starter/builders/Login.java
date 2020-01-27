package starter.builders;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.ui.login.LoginForm;

public class Login implements Task {

    private String username;
    private String password;
    private boolean rememberMe;

    public Login(String username, String password, boolean rememberMe) {
        this.username = username;
        this.password = password;
        this.rememberMe = rememberMe;
    }

    public static LoginWith with() {
        return new LoginWith();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(username).into(LoginForm.USERNAME_FIELD),
                Enter.theValue(password).into(LoginForm.PASSWORD_FIELD)
        );

        if (rememberMe)
            actor.attemptsTo(
                    Click.on(LoginForm.REMEMBER_ME)
            );

        actor.attemptsTo(
                Click.on(LoginForm.LOGIN_BUTTON)
        );

    }

    public static class LoginWith {

        private String username;
        private String password;

        public LoginWith username(String username) {
            this.username = username;
            return this;
        }

        public LoginWith and() {
            return this;
        }

        public LoginWith password(String password) {
            this.password = password;
            return this;
        }

        public LoginWith emptyPassword() {
            this.password = "";
            return this;
        }

        public LoginWith emptyUsername() {
            this.username = "";
            return this;
        }

        public Performable rememberMe() {
            return new Login(username, password, true);
        }

        public Performable noRememberMe() {
            return new Login(username, password, false);
        }
    }
}
