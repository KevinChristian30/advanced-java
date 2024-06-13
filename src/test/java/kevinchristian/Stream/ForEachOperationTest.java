package kevinchristian.Stream;

import java.util.List;

import org.junit.jupiter.api.Test;

public class ForEachOperationTest {
    @Test
    void forEachOperationTest() {
        List.of("Kevin", "Christian")
            .stream()
            .map(name -> name.toUpperCase())
            .peek(System.out::println)
            .forEach(System.out::println);
    }
}
