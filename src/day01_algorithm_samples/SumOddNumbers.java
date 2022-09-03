package day01_algorithm_samples;

public class SumOddNumbers {

    public static void main(String[] args) {

        int sum = sumOddNumbers(10);
        System.out.println(sum);
    }

    public static int sumOddNumbers(int num){

        int sum = 0;
        for (int i = 0; i <= num; i++) {
            if(i % 2 == 1){
                sum += i;
            }
        }
        return sum;
    }
    //write a method that return sum of odd numbers
}
