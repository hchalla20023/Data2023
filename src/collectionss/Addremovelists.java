package collectionss;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Addremovelists {

    public static void main(String[] args) {

        List<String> mynames = new ArrayList<String>();

        mynames.add("Rama");
        mynames.add("Satya");

        System.out.println(mynames);

        mynames.add("rajesh");

        System.out.println(mynames);

        mynames.add(0, "Hari");

        System.out.println(mynames);

        mynames.remove("Hari");

        System.out.println(mynames);


        List<String> mynames1 = new ArrayList<String>();

        mynames.add("Krishna");

        mynames1.addAll(mynames);

        System.out.println(mynames1);

    }

}
