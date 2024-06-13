package kevinchristian.Stream;

import java.util.List;

import org.junit.jupiter.api.Test;

public class ParallelStream {
    @Test
    void testParallelStream() {
        List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).stream().parallel()
                .forEach(number -> System.out.println(Thread.currentThread().getName() + ": " + number));
    }
}
