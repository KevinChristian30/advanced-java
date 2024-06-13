package kevinchristian.Collection;

import java.util.EnumSet;

import org.junit.jupiter.api.Test;

public class EnumSetTest {
    private static enum Gender {
        MALE, FEMALE
    }
    
    @Test
    void testEnumSet() {
        EnumSet<Gender> genders = EnumSet.allOf(Gender.class);

        genders.stream().forEach(System.out::println);
    }
}
