package package1;

import java.util.*;

public class DublicateUtil {

    public static <T> Collection<T> findElementsWithoutDublicates(Collection<T> input) {
        HashSet<T> result =  new HashSet<>();
        Iterator<T> i = input.iterator();
        HashMap<T, Integer> map = new HashMap<>();
        while (i.hasNext()) {
            T element = i.next();
            if (map.get(element) == null) {
                map.put(element, 1);
            } else {
                map.put(element, 2);
            }
        }

        for (Map.Entry<T, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                result.add(entry.getKey());
            }
        }
        return result;
    }
}
