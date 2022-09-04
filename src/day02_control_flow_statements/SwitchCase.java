package day02_control_flow_statements;

public class SwitchCase {

    public static void main(String[] args) {

        int number = 8;
        String result = "";
        switch (number){

            case 1:
                result = "Monday";
                break; // not mandatory, it is optional
            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Wednesday";
                break;
            case 4:
                result = "Thursday";
                break;
            case 5:
                result = "Friday";
                break;
            case 6:
                result = "Saturday";
                break;
            case 7:
                result = "Sunday";
                break;
            default: //optional
                System.out.println("Invalid number" + number);
                System.exit(0);
        }
        System.out.println("result = " + result);
    }
}
