package package1;

import java.util.*;

public class DublicateUtil {

    public static <T> Collection<T> findElementsWithoutDublicates(Collection<T> input) {
        Collection<T> result =  new HashSet<>();
        HashMap<T, Integer> map = new HashMap<>();
        for (int i = 0; i < input.size(); i++) {
            if (map.get(input.toArray()[i]) == null) {
                map.put((T)input.toArray()[i], 1);
            } else {
                map.put((T)input.toArray()[i], 2);
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
