package kevinchristian.Stream;

import java.util.Comparator;
import java.util.List;

import org.junit.jupiter.api.Test;

public class AggregateTest {
    @Test
    void testAggregate() {
        List.of("Kevin", "Christian", "Budi").stream().max(Comparator.naturalOrder()).ifPresent(System.out::println);

        List.of("Kevin", "Christian", "Budi").stream().max(Comparator.reverseOrder()).ifPresent(System.out::println);

        System.out.println(List.of("Kevin", "Christian", "Budi").stream().count());
    }

    @Test
    void testSum() {
        int result = List.of(1, 2, 3, 4, 5).stream().reduce(0, (current, next) -> current + next);
        System.out.println(result);
    }
}
