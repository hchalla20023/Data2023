package collectionss;

import java.util.*;

public class Sett {

    public static void main(String[] args) {

        Set<String> mynames = new HashSet<String>();

        mynames.add("C");
        mynames.add("D");
        mynames.add("A");
        mynames.add("B");
        mynames.add("1");

        Iterator itr = mynames.iterator();

        while (itr.hasNext()) {

            System.out.println(itr.next());
        }
    }
}
