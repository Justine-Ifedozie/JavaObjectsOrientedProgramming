package main.PersonalPractice;

public class fizzBuzzClassic {
    public static void fizzBuzz(int number){
        for(int count = 1; count <= number; count++){
            if (count % 3 == 0 && count % 5 == 0) System.out.println(count + "FizzBuzz");
            else if (count % 3 == 0) System.out.println(count + "Fizz");
            else if (count % 5 == 0) System.out.println(count + "Buzz");
            else
                System.out.println(count);

        }
    }

    public static void main (String [] args){
        fizzBuzz(100);
    }
}
