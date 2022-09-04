package day02_control_flow_statements;

import java.util.Scanner;

public class CheckLetter {

    public static void main(String[] args) {

        checkLetter();

    }
    public static void checkLetter(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input: ");
        String input = scanner.next().toLowerCase();


        while (input.length() > 1){
            System.out.println("ERROR, please provide one char!!!");
            input = scanner.next().toLowerCase();
        }
        boolean letter = input.charAt(0) >= 'a' && input.charAt(0) <= 'z';
        boolean vowel = input.equals("a") || input.equals("i") || input.equals("o")
                || input.equals("u") || input.equals("e");

        if(!letter){
            System.out.println("Not a LETTER!!!");

        }else if (vowel){
            System.out.println("Input is vowel");

        }else{
            System.out.println("Input is consonant");

        }

    }

}
