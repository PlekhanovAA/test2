package package1;

import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;

public class DublicateUtil {

    public static <T> Collection<T> findElementsWithoutDublicates(Collection<T> input) {
        Map<T, Long> map2 = input.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        return map2.entrySet().stream().filter(map -> map.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toSet());
    }
}
