import exception.WrongLoginException;
import exception.WrongPasswordException;

public class Main {
    public static void main(String[] args) {

        String login = "login123_";
        String password = "password123_";
        String confirmPassword = "password123_";

        try {
            Validator.validate(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException exception) {
            exception.printStackTrace();
        }
    }
}