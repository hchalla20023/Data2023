package Conditionalstatmentss;

public class ifconditionsss {

    public static void main(String[] args) {

        int age1 = 25;
        int age2 = 25;

        if(age1==25&& age2 ==25) {

            if(age1==24) {

                System.out.println("block1 is executed");
            }else {

                System.out.println("1st block is not executed");
            }

            System.out.println("2nd block2 is executed");


        } else {

            System.out.println("2nd block is not executed");
        }
    }
}
