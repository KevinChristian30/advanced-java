package kevinchristian.Stream;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

public class CollectorsTest {
    @Test
    void testCollectors() {
        List<String> names = List.of("Kevin", "Christian", "Kevin");

        List<String> names2 = names
                .stream()
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());
        names2.forEach(System.out::println);

        Set<String> names3 = names
                .stream()
                .map(name -> name.toUpperCase())
                .collect(Collectors.toSet());
        names3.forEach(System.out::println);
    }

    @Test
    void testMap() {
        List<String> names = List.of("Kevin", "Christian");

        Map<String, Integer> nameAndLength = names.stream().collect(Collectors.toMap(name -> name, name -> name.length()));

        nameAndLength.forEach((k, v) -> {
            System.out.println(String.format("Key: %s, Value: %d", k, v));
        });
    }
}
