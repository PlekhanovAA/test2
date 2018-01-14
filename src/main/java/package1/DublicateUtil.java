package package1;

import java.util.*;

public class DublicateUtil {

    public static <T> Collection<T> findElementsWithoutDublicates(Collection<T> input) {
        Collection<T> result =  new HashSet<>();
        ArrayList<T> temp = new ArrayList<>(input);
        HashMap<T, Integer> map = new HashMap<>();
        for (T element : temp) {
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
