package Arrayss;

public class Singledimensions {

    public static void main(String[] args) {

        String mynames[] = new String[5];

        mynames[0] = "Hari";
        mynames[1] = "rama";
        mynames[2] = "satya";
        mynames[3] = "sandeep";
        mynames[4] = "rajesh";
        mynames[5] = "challa";


        System.out.println(mynames[0]);

        System.out.println(mynames.length);

        for (int i =0; i<mynames.length; i++) {

            System.out.println(mynames[i]);

        }

    }
}
