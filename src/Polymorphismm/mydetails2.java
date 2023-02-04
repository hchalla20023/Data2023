package Polymorphismm;

public class mydetails2 {

    public void Hari() {

        System.out.println("parent class method");
    }

    static class testdetails extends mydetails2 {

        public void Hari() {

            System.out.println("sub class method");
        }
    }
    public static void main(String[] args) {

        testdetails t = new testdetails();
        t.Hari();

    }
}
