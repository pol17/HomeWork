package Classroom_HomeWork;

public class ArrayDuplicates {
    public static void main(String[] args) {

        //initialize array
        int[] array = {1, 1, 1, 3, 5, 5, 8, 5};
        System.out.println("Duplicate elements in given array: ");

        //search for duplicate elements
        for (int i = 0; i < array.length; i = i +1) {
            for (int j = i + 1; j < array.length; j = j +1) {
                if (array[i] == (array[j])) {
                    System.out.println(array[j]);
                }
            }
        }
    }
}
