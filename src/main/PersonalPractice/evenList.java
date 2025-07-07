package main.PersonalPractice;

public class evenList {
    public static void evenNumbers(int [] array){
        for(int count = 0; count <= array.length - 1; count++){
            if(array[count] % 2 == 0) System.out.println(array[count] + " Even number");
            else System.out.println(array[count]);
        }
    }

    public static void main(String[] args) {
        int [] array = {12,2,3,4,5,6,7,8,9,10};
        evenNumbers(array);
    }
}
