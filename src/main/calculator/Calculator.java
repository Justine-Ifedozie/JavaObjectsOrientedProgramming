package main.calculator;

public class Calculator {

    public static int addTwoNumbers(int a, int b) {
        return a + b;
    }

    public static String registerUserInput(String name, String password, String email){
        if(name.isEmpty() || password.isEmpty() || email.isEmpty()){
            return "Invalid details";
        }
        return "Registration successful";
    }

    public static int twoNumbersSubtraction(int firstNumber, int secondNumber){
        int temp;
        int result;
        if (firstNumber < secondNumber){
            temp = firstNumber;
            firstNumber = secondNumber;
            secondNumber = temp;
            result = firstNumber - secondNumber;
            return result;
        }
        else{
            result = firstNumber - secondNumber;
        }
        return result;
    }


    }


