package Javakeywords;

public class Thiskeywords {

    String myname;

    void test(String mynewname) {

        System.out.println(mynewname);
       this.myname = mynewname;
    }

    public static void main(String[] args) {

        Thiskeywords t = new Thiskeywords();

        t.test("hari");
    }
}
