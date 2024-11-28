package d.collection;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class MapSample {
    public static void main(String[] args) {
        MapSample sample = new MapSample();
        sample.checkHashMap();

    }
    public void checkHashMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "a");
        map.put("B", "b");
        map.put("C", "c");
        Collection<String> values = map.values();
        for (String tempValue:values)
            System.out.println(tempValue);
    }
}
