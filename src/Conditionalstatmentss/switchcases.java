package Conditionalstatmentss;

public class switchcases {

    public  static String myrequirement =  "Light";;

    public static void main(String[] args) {


        switch (myrequirement) {

            case "Light" :
                System.out.println("Switched on Light");

            case "Bulb" :
                System.out.println("Switched on Bulb");
                break;
            default:
                System.out.println("No requirement executed");
                break;

        }
    }
}
