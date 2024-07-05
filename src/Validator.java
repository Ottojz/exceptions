import exception.WrongLoginException;
import exception.WrongPasswordException;

import java.util.regex.Pattern;

public class Validator {

/*
*   //Посмотрел разбор, понял, что можно через паттерны решить задачу.
*   private static final Pattern LOGIN_PATTERN = Pattern.compile("[a-zA-Z0-9_]{1,20}");
*   private static final Pattern PASSWORD_PATTERN = Pattern.compile("[a-zA-Z0-9_]{1,20}");
*/
    public static void validate(String login, String password, String confirmPassword) {
        for (int i = 0; i < login.length(); i++) {
            if ((!Character.isLetterOrDigit(login.charAt(i)) && login.charAt(i) != '_') || login.length() > 20) {
                throw new WrongLoginException("Логин не соответствует формату");
            }
        }

        for (int i = 0; i < password.length(); i++) {
            if ((!Character.isLetterOrDigit(password.charAt(i)) && password.charAt(i) != '_') || password.length() > 20) {
                throw new WrongPasswordException("Пароль не соответствует формату");
            }
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароль не совпадает");
        }


/*
*   //Само решение через паттерны
*       if (!LOGIN_PATTERN.matcher(login).matches()) {
*           throw new WrongLoginException ("Логин не соответствует формату");
*       }
*
*       if (!PASSWORD_PATTERN.matcher(password).matches()) {
*            throw new WrongPasswordException ("Пароль не соответствует формату");
*       }
*
*       if (!password.equals(confirmPassword)) {
*            throw new WrongPasswordException ("Пароль не совпадает");
*       }
*/

    }
}
