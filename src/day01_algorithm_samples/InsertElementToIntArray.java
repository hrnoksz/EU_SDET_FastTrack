package day01_algorithm_samples;

import java.util.Arrays;

public class InsertElementToIntArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int[] numbers = insertElement(arr, 2, 11);

        System.out.println(Arrays.toString(numbers));

    }

    public static int[] insertElement(int[] array, int index, int element){

       if(index < 0 || index > array.length){
           System.err.println("Invalid index: " + index);
           System.exit(0);
       }
       int[] result = new int[array.length + 1];
       result[index] = element;
        for (int i = 0, j = 0; i < array.length; i++, j++) {
            if(i == index){
                j++;
            }
            result[j] = array[i];
        }
        return result;
    }
}
