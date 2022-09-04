package day02_control_flow_statements;

public class FindMaxNumber {

    public static void main(String[] args) {

        System.out.println("findMaxNumber= " + findMaxNumber(1, 11, 33));

    }

    public static int findMaxNumber(int a, int b, int c){

        if(a >= b && a >= c){
            return a;
        }
        if(b >= a && b >= c){
            return b;
        }
        return c;
    }
}
