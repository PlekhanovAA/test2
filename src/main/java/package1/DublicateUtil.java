package package1;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.stream.Collectors;

public class DublicateUtil {

    public static <T> Collection<T> findElementsWithoutDublicates(Collection<T> input) {
        HashSet<T> result =  new HashSet<>();
        Map<T, Long> map2 = input.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        for (Map.Entry<T, Long> entry : map2.entrySet()) {
            if (entry.getValue() == 1) {
                result.add(entry.getKey());
            }
        }
        return result;
    }
}
