package main.java.exception;

public class InvalidPasswordException extends Exception {

    int passwordConditionCount = 0;

    public InvalidPasswordException(int passwordConditionCount) {
        this.passwordConditionCount = passwordConditionCount;
    }

    public String printMessage() {
        switch (passwordConditionCount) {

            case 1:
                return ("Password length should be more than 8 characters");

            case 2:
                return ("Password should not ne null");

            case 3:
                return ("Password should contain at least one uppercase letter(A-Z)");

            case 4:
                return ("Password should contain at least one lowercase letter(a-z)");

            case 5:
                return ("Password should contain at least one digit(0-9)");

        }
        return ("");
    }
}
