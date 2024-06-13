package kevinchristian.Stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class CreateStreamTest {
    @Test
    void testCreateEmptyOrSingleStream() {
        Stream<String> emptyStream = Stream.empty();
        Stream<String> oneStream = Stream.of("Kevin");
        Stream<String> nullableStream = Stream.ofNullable(null);
    }

    @Test
    void testCreateStreamFromArray() {
        Stream<String> arrayStream = Stream.of("Kevin", "Kevin Christan");
        arrayStream.forEach(data -> {
            System.out.println(data);
        });

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        integerStream.forEach(data -> {
            System.out.println(data);
        });

        String[] array = new String[] {
                "Kevin", "Christian"
        };
        Stream<String> fromArray = Arrays.stream(array);
    }

    @Test
    void testCreateStreamFromCollection() {
        Collection<String> collection = List.of("Kevin", "Christian");
        Stream<String> stream = collection.stream();
    }

    @Test
    void testCreateInfiniteStream() {
        Stream<String> stream = Stream.generate(() -> "Kevin Christian");
        // stream.forEach(System.out::println); Dont run this
        
        Stream<Integer> iterate = Stream.iterate(1, value -> value + 1);
        // iterate.forEach(System.out::println); Dont run this
    }
}
