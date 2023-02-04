package Inheritanceclass;

public class Singleineritancee { // father

    String myname = "hari";
    int age = 25;

    public void deatils() {

        System.out.println("My details..");
    }

    static class getdetails extends Singleineritancee {


    }

    public static void main(String[] args) {

        getdetails dd = new getdetails();

        dd.deatils();

        System.out.println(dd.age);
        System.out.println(dd.myname);
    }
}
