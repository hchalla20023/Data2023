package Arrayss;

public class Singledimensions3 {

    public static void main(String[] args) {

        String mynames[] = {"Hari","rama","satya"};

        System.out.println(mynames.toString());


        for (int i =0; i<mynames.length/2; i++) {

            String  tempstr = mynames[i];
            mynames[i] = mynames[mynames.length-i-1];
            mynames[mynames.length-i-1]=tempstr;

        }
        System.out.println("Reverse the arrays string : ");

        for(int i =0; i<mynames.length;i++) {

            System.out.println(mynames[i]);
        }
    }
}
