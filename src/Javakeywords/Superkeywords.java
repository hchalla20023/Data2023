package Javakeywords;

public class Superkeywords {

    String myname = "Hari";

    public void testmethod() {

        System.out.println("main class method");
    }
    static class testsuper extends Superkeywords {
        String myname = "Hari1223";
        public void test21() {

            System.out.println("This is super keyword method " + super.myname);
           super.testmethod();

        }
    }
    public static void main(String[] args) {


    }
}
