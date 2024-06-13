package kevinchristian.Stream;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class StreamOperations {
    @Test
    void testStreamMap() {
        List<String> names = List.of("Kevin", "Christian", "ASD");
        Stream<String> streamOfNames = names.stream();
        Stream<String> streamUpper = streamOfNames.map(name -> name.toUpperCase());
        streamUpper.forEach(System.out::println);

        List<String> upperCasedNames = names.stream().map(name -> name.toUpperCase()).toList();
        upperCasedNames.forEach(System.out::println);
    }
}
