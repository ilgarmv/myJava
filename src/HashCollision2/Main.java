package HashCollision2;


import java.util.HashMap;
import java.util.Map;

public class Main {


    public static void main(String[] args) {
        Map<HashCheck, String> map = new HashMap<>();

        HashCheck k1 = new HashCheck(4, "First");
        HashCheck k2 = new HashCheck(2, "Second");

        HashCheck k3 = new HashCheck(4, "Third");

        System.out.println("Hashcode 1: " + k1.hashCode());
        System.out.println("Hashcode 2: " + k2.hashCode());
        System.out.println("Hashcode 3: " + k3.hashCode());

        map.put(k1, "Value1");
        map.put(k2, "Value2");
        map.put(k3, "Value3");

        System.out.println("Value 1: " + map.get(k1));
        System.out.println("Value 2: " + map.get(k2));
        System.out.println("Value 3: " + map.get(k3));
    }
}

