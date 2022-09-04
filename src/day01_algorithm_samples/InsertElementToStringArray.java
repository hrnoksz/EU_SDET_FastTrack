package day01_algorithm_samples;

import java.util.Arrays;

public class InsertElementToStringArray {

    public static void main(String[] args) {

       String [] arr = {"BMW", "Mercedes", "Audi"};

        String[] array = addValue(arr, 1, "Nissan");

        System.out.println(Arrays.toString(array));

    }

    public static String[] addValue(String[] array, int index, String element){

        if(index < 0 || index > array.length){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        String[] result = new String[array.length+1];
        result[index] = element;
        for (int i = 0, j=0; i < array.length; i++,j++) {
            if(i == index){
                j++;
            }
            result[j] = array[i];
        }
        return result;
    }
}
// inserts the given element to the given index of the array and returns the new array