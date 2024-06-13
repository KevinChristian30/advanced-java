package kevinchristian.Stream;

import java.util.List;

import org.junit.jupiter.api.Test;

public class FilterTest {
    @Test
    void testFilter() {
        List<String> names = List.of("Kevin", "Christian");
        List<String> filteredNames = names.stream().filter(name -> name.length() > 6).toList();

        filteredNames.forEach(System.out::println);
    }
}
