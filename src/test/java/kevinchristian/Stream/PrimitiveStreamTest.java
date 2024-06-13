package kevinchristian.Stream;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

import org.junit.jupiter.api.Test;

public class PrimitiveStreamTest {
    @Test
    void primitiveStreamTest() {
        IntStream intStream = IntStream.of(1, 2, 3);
        LongStream longStream = LongStream.of(1, 2, 3, 4);
        DoubleStream doubleStream = DoubleStream.of(1.1, 2.2, 3.3, 4.4);
    }
}
