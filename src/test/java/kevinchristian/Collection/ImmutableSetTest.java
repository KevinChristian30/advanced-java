package kevinchristian.Collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class ImmutableSetTest {
    @Test
    void testImmutableSet() {
        Collections.emptySet(); // Empty immutable set
        Collections.singleton(1); // Immutable set with one element
        Collections.unmodifiableSet(new HashSet<Integer>()); // Making an immutable set from a mutable set
        Set.of(1, 2, 3); // Immutable set variadic function
    }
}
