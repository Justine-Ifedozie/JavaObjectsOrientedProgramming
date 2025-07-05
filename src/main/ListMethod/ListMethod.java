package main.ListMethod;

import java.util.Arrays;

public class ListMethod {
    private String [] array;

    private boolean isEmpty = false;
    private int count;
    boolean elementMatch;

    public ListMethod(int size) {
        this.array = new String[size];
    }

    public Boolean add(String element) {
        if(count == array.length){
            resizeArray();
        }

        array[count++] = element;
        return true;
    }

    private void resizeArray() {
        int newLength = array.length * 2;
        String [] newArray = new String [newLength];
        System.arraycopy(array, 0, newArray, 0, count);
        array = newArray;
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public String remove(int index) {
        String element = array[index];
        for (int counter = index; counter < array.length -1; counter++){
            array[counter] = array[counter + 1];
            //System.out.println(Arrays.toString(array));
        }
        count--;
        return element;
    }

    public int getLength() {
        return array.length;
    }

    public boolean remove1(String element) {
        for (int count = 0; count < array.length; count++){
            if (element.equals(array[count])) {
                remove(count);
                elementMatch = true;
                break;
        }
            else elementMatch = false;
    }
        return elementMatch;
}

    public String get(int index) {
        int i;
        for(i = 0; i < array.length; i++){
            if (array[i].equals(array[index])){
                break;
            }
        }
        return array[i];
    }

    public String set(int index, String element) {
        String removed;
        removed = array[index];
        array[index] = element;
        return removed;
    }
}
