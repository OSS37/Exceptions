import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

public class InputData {
    private String login;
    private String password;
    private String confirmPassword;

    public InputData(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public boolean checkLogin() {
        if (login.length() > 20) {
            throw new WrongLoginException("Логин не может быть длиннее 20 символов");
        }
        if (!login.matches("\\w+")) {
            System.out.println("Логин содержит некорректные символы");
            return false;
        }
        return true;
    }

    public boolean checkPassword() {
        if (password.length() >= 20) {

            throw new WrongPasswordException("Пароль не может быть длиннее 20 символов");
        }
        if (!password.matches("\\w+")) {
            System.out.println("Пароль содержит некорректные символы");
            return false;
        }
        return true;
    }

    public boolean checkInputData() {
        try {
            if (!this.checkLogin() || !this.checkPassword()) {
                return false;
            }
            this.checkConfirmPassword();
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }


    public void checkConfirmPassword() {
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }
}
