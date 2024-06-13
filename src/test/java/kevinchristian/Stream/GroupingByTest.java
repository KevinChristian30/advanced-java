package kevinchristian.Stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

public class GroupingByTest {
    @Test
    void testGroupingBy() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Map<String, List<Integer>> collect = numbers
            .stream()
            .collect(Collectors.groupingBy(number -> number > 5 ? "BIG" : "SMALL"));

        System.out.println(collect);
    }

    @Test
    void testPartitioningBy() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Map<Boolean, List<Integer>> isGreaterThanFiveMap = numbers.stream().collect(Collectors.partitioningBy(number -> number > 5));

        System.out.println(isGreaterThanFiveMap);
    }
}
