package interfaceee;


interface Test1 {

   public void test2022();
 public static String name = "Hari";
}

interface Test2 {

    public void test2021();
    public static String name = "Rama";
}


public class Testinterface implements Test1,Test2 {

    public void test2021() {
        System.out.println("interface sub class method1");

}

    public void test2022() {
        System.out.println("interface sub class method2");

    }

    public static void main(String[] args) {

        Testinterface tt = new Testinterface();

        tt.test2021();
        tt.test2022();

    }
}
