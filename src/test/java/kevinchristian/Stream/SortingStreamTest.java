package kevinchristian.Stream;

import java.util.Comparator;
import java.util.List;

import org.junit.jupiter.api.Test;

public class SortingStreamTest {
    @Test
    void testSorting() {
        List<String> names = List.of("Kevin", "Christian", "Budi");

        List<String> sorted = names.stream().sorted(Comparator.reverseOrder()).toList();
        sorted.forEach(System.out::println);
    }
}
