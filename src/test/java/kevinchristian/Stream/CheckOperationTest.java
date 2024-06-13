package kevinchristian.Stream;

import java.util.List;

import org.junit.jupiter.api.Test;

public class CheckOperationTest {
    @Test
    void checkAnyMatch() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8);

        boolean match = numbers.stream().anyMatch(number -> number > 3);
        System.out.println(match);
    }

    @Test
    void checkAllMatch() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8);

        boolean match = numbers.stream().allMatch(number -> number > 3);
        System.out.println(match);
    }

    @Test
    void checkNoneMatch() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8);

        boolean match = numbers.stream().noneMatch(number -> number > 3);
        System.out.println(match);
    }
}
