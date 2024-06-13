package kevinchristian.Stream;

import java.util.List;

import org.junit.jupiter.api.Test;

public class StreamPipeline {
    @Test
    void testStreamMap() {
        List<String> names = List.of("Kevin", "Christian", "ASD");
        List<String> upperCasedNames = names.stream().map(name -> name.toUpperCase())
            .map(name -> "Mr. " + name).toList();
        upperCasedNames.forEach(System.out::println);
    }
}
