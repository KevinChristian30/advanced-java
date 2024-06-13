package kevinchristian.Collection;

import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ImmutableListTest {
    @Test
    void immutableListTest() {
        List<Integer> numbers = List.of(1, 2, 3);
        List<Integer> unmodifiableList = Collections.unmodifiableList(numbers);

        // Making immutable list
        Collections.emptyList(); // Empty Immutable List
        Collections.singletonList(1); // Immutable List with one element
        Collections.unmodifiableList(numbers); // Immutable list from another list
        List.of(1, 2, 3);  // Immutable list variadic function
    }
}
