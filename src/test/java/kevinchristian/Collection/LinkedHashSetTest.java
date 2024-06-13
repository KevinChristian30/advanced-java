package kevinchristian.Collection;

import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class LinkedHashSetTest {
    @Test
    void linkedHashSetTest() {
        Set<String> names = new LinkedHashSet<>();

        names.add("A");
        names.add("B");
        names.add("C");

        names.stream().forEach(System.out::println);
    }
}
