package kevinchristian.Stream;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class CreateStreamBuilderTest {
    @Test
    void testCreateStreamBuilder() {
        Stream.Builder<String> builder = Stream.builder();
        builder.add("Kevin").add("Christian");

        Stream<String> stream = builder.build();
        stream.forEach(System.out::println);
    }
}
