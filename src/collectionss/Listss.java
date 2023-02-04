package collectionss;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Listss {

    public static void main(String[] args) {

        List<String> mynames = new ArrayList<String>();

        mynames.add("Rama");
        mynames.add("Satya");
        mynames.add("Hari");
        mynames.add("Hari");
        mynames.add(null);

        Iterator itr = mynames.iterator();

        while (itr.hasNext()) {

            System.out.println(itr.next());
        }
    }
}
