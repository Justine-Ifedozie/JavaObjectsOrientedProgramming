package main.ListPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ListPractice {

    public static int [] resizeArray(int [] originalArray){
        int newSize = originalArray.length * 2;
        int [] newArray = new int [newSize];

        for(int count = 0; count < originalArray.length; count++){
            newArray[count] = originalArray[count];
        }
        return newArray;
    }

    public static void main (String [] args){

//        ArrayList <Integer> list = new ArrayList <Integer>();
//
//        list.add(2);
//        list.add(2,32);

        String [] array = {"Ade", "Tope", "Mary", "Anabelle"};
        int index = 1;





//        for(int i = index; i < array.length - 1; i++){
//            array[i] = array[i + 1];
//        }
//        System.out.print(Arrays.toString(array));


    }
}
