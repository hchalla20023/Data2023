package Arrayss;

public class Multdimensions {

    public static void main(String[] args) {

        String mynames[][] = new String[2][2];

        mynames[0][0] = "Hari";
        mynames[0][1] = "rama";
        mynames[1][0] = "satya";
        mynames[1][1] = "sandeep";

        for (int i =0; i<mynames.length; i++) {

           for(int j=0; j<mynames.length; j++) {

               System.out.println(mynames[i][j]);
           }
        }

    }
}
