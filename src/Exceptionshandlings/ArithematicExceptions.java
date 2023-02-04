package Exceptionshandlings;

public class ArithematicExceptions {

    public static void main(String[] args) {

       try {
           int a = 10, b =5, c;
           c = a/b;
           System.out.println(c);

      }catch (Exception e) {

          System.out.println(e);

       }

    }
}
