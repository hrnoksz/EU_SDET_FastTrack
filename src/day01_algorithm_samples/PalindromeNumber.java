package day01_algorithm_samples;

public class PalindromeNumber {

    public static void main(String[] args) {

        boolean palindrome = isPalindrome(121);
        System.out.println(palindrome);
    }

    public static boolean isPalindrome(int number) {


        int reversedNum = 0, remainder;

        // store the number to originalNum
        int originalNum = number;

        // get the reverse of originalNum
        // store it in variable
        while (number != 0) {
            remainder = number % 10;
            reversedNum = reversedNum * 10 + remainder;
            number /= 10;
        }
            // check if reversedNum and originalNum are equal
            if (originalNum == reversedNum) {
                return true;
            } else {
                return false;
            }

        }

    }



