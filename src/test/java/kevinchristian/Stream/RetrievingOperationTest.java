package kevinchristian.Stream;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;

public class RetrievingOperationTest {
    @Test
    void testRetrievingOperation() {
        List<String> names = List.of("Kevin", "Christian", "Budi", "Nugraha", "Joko");

        names.stream().limit(2).forEach(System.out::println);
        names.stream().skip(2).forEach(System.out::println);
        names.stream().takeWhile(name -> name.length() != 4).forEach(System.out::println);
        names.stream().dropWhile(name -> name.length() < 6).forEach(System.out::println);
    }

    @Test
    void testFind() {
        List<String> names = List.of("Kevin", "Christian", "Budi", "Nugraha", "Joko");

        Optional<String> any = names.stream().findAny();
        Optional<String> first = names.stream().findFirst();
    }
}
