package kevinchristian.Collection;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

public class SortedSetTest {
    @Test
    void testSortedSet() {
        SortedSet<Integer> numbers = new TreeSet<>(Comparator.reverseOrder());

        numbers.add(3);
        numbers.add(2);
        numbers.add(1);

        numbers.stream().forEach(System.out::println);
    }
}
