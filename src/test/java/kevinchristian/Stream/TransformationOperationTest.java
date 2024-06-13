package kevinchristian.Stream;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class TransformationOperationTest {
    @Test
    void testMap() {
        List.of("Kevin", "Christian")
            .stream()
            .map(name -> name.toUpperCase())
            .map(name -> name.length())
            .forEach(System.out::println);
    }

    @Test
    void testFlatMap() {
        List.of("Kevin", "Christian")
            .stream()
            .map(name -> name.toUpperCase())
            .flatMap(upper -> Stream.of(upper, upper.length()))
            .forEach(length -> System.out.println(length));
    }
}
