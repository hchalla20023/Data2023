package Polymorphismm;

public class mydetails {

    public void Hari(String fn, String ln) {

        System.out.println("method overloading1");
    }
    public void Hari(String fn, String ln, int dob) {
        System.out.println("method overloading2");
    }
    public static void main(String[] args) {


        mydetails mm = new mydetails();

        mm.Hari("Hari","Challa");
        mm.Hari("Hari","Challa", 1998);
    }
}
