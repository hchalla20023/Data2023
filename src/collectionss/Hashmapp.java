package collectionss;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Hashmapp {

    public static void main(String[] args) {

        Hashtable<Integer, String> names = new Hashtable<Integer,String>();

        names.put(100, "Rama");
        names.put(101, "Satya");
        names.put(102, "Hari");

        for(Map.Entry m : names.entrySet()) {

            System.out.println(m.getKey() + " " + m.getValue());
        }


    }
}
