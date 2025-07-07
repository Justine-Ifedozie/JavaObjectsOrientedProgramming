package main.Queues;

public class Queues {

    private int [] array;
    private int count;

    public Queues(){
        array = new int[5];
    }

    public boolean isEmpty() {
        return count == 0;

    }

    public boolean add(int element) {
        array[count] = element;
        count++;
        return true;
    }

    public int remove() {
        int removedElement = array[0];
        for (int counter = 0; counter < array.length -1; counter++){
            array[counter] = array[counter + 1];
        }
        count--;
        return removedElement;
    }

    public boolean offer(int element) {
        if (array.length > count) {
            array[count] = element;
            count++;
            return true;
        } else {
            return false;
        }
    }
}
