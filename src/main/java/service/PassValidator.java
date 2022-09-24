package main.java.service;

import main.java.exception.InvalidPasswordException;

public class PassValidator {

    public static String isValidPassword(String password) throws InvalidPasswordException{

        int totalCount =0;
        //For length less than 8 Characters
        if((password.length() >= 0) && (password.length() <=8) ){
            throw new InvalidPasswordException(1);
        }else{
            totalCount= totalCount +1;
        }
        //For null password
        if (password.equals("") || password==null) {
            throw new InvalidPasswordException(2);
        }else{
            totalCount= totalCount +1;
        }
        //For password for at least one digit
        if (true) {
            int count = 0;
            for (int i = 0; i <= 9; i++) {
                String str1 = Integer.toString(i);
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                throw new InvalidPasswordException(5);
            }
        }else{
            totalCount= totalCount +1;
        }

        // for special characters
        if (!(password.contains("@") || password.contains("#")
                || password.contains("!") || password.contains("~")
                || password.contains("$") || password.contains("%")
                || password.contains("^") || password.contains("&")
                || password.contains("*") || password.contains("(")
                || password.contains(")") || password.contains("-")
                || password.contains("+") || password.contains("/")
                || password.contains(":") || password.contains(".")
                || password.contains(", ") || password.contains("<")
                || password.contains(">") || password.contains("?")
                || password.contains("|"))) {
            throw new InvalidPasswordException(4);
        }else{
            totalCount= totalCount +1;
        }
        //For Password containing Uppercase characters
        if (true) {
            int count = 0;
            for (int i = 65; i <= 90; i++) {
                char c = (char)i;
                String str1 = Character.toString(c);
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                throw new InvalidPasswordException(5);
            }
        }else{
            totalCount= totalCount +1;
        }
        //For Password containing Uppercase characters
        if (true) {
            int count = 0;
            for (int i = 90; i <= 122; i++) {
                char c = (char)i;
                String str1 = Character.toString(c);
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                totalCount= totalCount +1;
                throw new InvalidPasswordException(6);
            }
        }else{
            totalCount= totalCount +1;
        }

        if(totalCount >= 3){
            return "Valid Password";
        }else{
            return "Invalid Password";
        }
    }
}
