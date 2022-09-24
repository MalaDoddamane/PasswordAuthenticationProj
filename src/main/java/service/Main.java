package main.java.service;

import main.java.exception.InvalidPasswordException;

import static main.java.service.PassValidator.isValidPassword;

public class Main {
    public static void main(String[] args) {

        try{
            isValidPassword("Strong");
        }catch(InvalidPasswordException ex){
            System.out.println(ex.printMessage());
        }
    }
}