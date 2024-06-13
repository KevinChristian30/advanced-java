package kevinchristian.Stream;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class LazyEvaluationTest {
    @Test
    void testIntermediateOperation() {
        List<String> names = List.of("Kevin", "Christian");
        Stream<String> upper = names.stream().map(name -> {
            System.out.println(name);
            return name.toUpperCase();
        });

        upper.forEach(System.out::println);
    }
}
