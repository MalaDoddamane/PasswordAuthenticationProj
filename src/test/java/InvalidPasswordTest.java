package test.java;

import static main.java.service.PassValidator.isValidPassword;
import static org.junit.Assert.*;

import main.java.exception.InvalidPasswordException;
import org.junit.Test;

public class InvalidPasswordTest {

    @Test
    public void charactersTest() {
        try{
            isValidPassword("Strong");
        }catch(InvalidPasswordException ex){
            System.out.println(ex.printMessage());
        }
    }

    @Test
    public void UpperLettersTest() {
        try{
            isValidPassword("strongpassword12");
        }catch(InvalidPasswordException ex){
            System.out.println(ex.printMessage());
        }
    }

    @Test
    public void digitsTest() {
        try{
            isValidPassword("StrongPassword");
        }catch(InvalidPasswordException ex){
            System.out.println(ex.printMessage());
        }
    }

}
