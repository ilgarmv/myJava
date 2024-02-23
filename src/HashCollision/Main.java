package HashCollision;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(4, "Four");
        map.put(14, "Four");
        
        System.out.println("Hash code of \"" + map.get(4) + "\": " + map.get(4).hashCode());
        System.out.println("Hash code of \"" + map.get(14) + "\": " + map.get(14).hashCode());


    }
}
