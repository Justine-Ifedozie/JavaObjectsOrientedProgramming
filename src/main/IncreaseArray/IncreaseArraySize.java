package main.IncreaseArray;

public class IncreaseArraySize {
    private int [] ages;
    private int numberOfAges;

    public IncreaseArraySize(){
        ages = new int[5];
        numberOfAges = 0;
    }

    public void addAge(int age){
        if(numberOfAges == ages.length) {
            System.out.println("Array full! Resizing to hold more ages");
            resizeArray();
        }
        ages[numberOfAges] = age;
        numberOfAges++;
        System.out.println("Added age: " + age + ". Current ages count:" + numberOfAges + " , Array capacity: " + ages.length);
    }

    private void resizeArray() {
        int newCapacity = ages.length * 2;
        int [] newAgesArray = new int[newCapacity];
        System.arraycopy(ages, 0, newAgesArray, 0, numberOfAges);
        ages = newAgesArray;
        System.out.println("Array resized! New capacity: " + ages.length);
    }

    public void displayAges(){
        for (int i =0; i < numberOfAges; i++){
            System.out.println(ages[i]);
        }
    }

    public static void main(String [] args){
        IncreaseArraySize student = new IncreaseArraySize();

        student.addAge(13);
        student.addAge(16);
        student.addAge(17);
        student.addAge(10);
        student.addAge(12);

        student.displayAges();

        student.addAge(26);
        student.addAge(36);
        student.addAge(43);
        student.addAge(34);
        student.addAge(56);

        student.displayAges();

        student.addAge(12);
        student.addAge(65);
        student.addAge(45);
        student.addAge(39);
        student.addAge(57);

        student.displayAges();
    }


}
