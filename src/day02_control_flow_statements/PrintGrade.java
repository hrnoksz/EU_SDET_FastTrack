package day02_control_flow_statements;

public class PrintGrade {

    public static void main(String[] args) {

        int score = 50;
        String result = "";

        if (score >= 0 || score <= 100){
            if(score >= 90){
                result = "A";
            }else if (score >= 80){
                result = "B";
            }else if (score >= 70){
                result = "C";
            }else if (score >= 60){
                result = "D";
            }else {
                result = "F";
            }
        }else{
            System.out.println("Invalid score " + score);
            System.exit(0);
        }
        System.out.println("result = " + result);


    }
}
