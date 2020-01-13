package Classroom_HomeWork;
import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] array = {1, 1, 1, 3, 5, 5, 8, 5};
        System.out.println("Array before reverse: " + Arrays.toString(array));
        for(int i = 0; i < array.length / 2; i = i + 1){
            int temp = array[i];
            array[i] = array[array.length -i -1];
            array[array.length -i -1] = temp;
        }
        System.out.println("Array after reverse: " + Arrays.toString(array));
    }
}
