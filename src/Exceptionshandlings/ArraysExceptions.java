package Exceptionshandlings;

public class ArraysExceptions {

    public static void main(String[] args) {

        try {

            int mynum[] = {1, 2, 3};// array is the index based id

            System.out.println(mynum[2]);
            System.exit(0);
        }catch (ArithmeticException e) {

            System.out.println(e);

        }catch (StringIndexOutOfBoundsException E) {
            System.out.println(E);
        }
     finally {
            System.out.println("Always executed");
        }
    }
}