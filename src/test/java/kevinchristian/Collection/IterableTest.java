package kevinchristian.Collection;

import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.Test;

public class IterableTest {
    @Test
    void iterableTest() {
        Iterable<String> names = List.of("Kevin", "Christian");

        for (var name : names) {
            System.out.println(name);
        }

        Iterator<String> itertor = names.iterator();
        while (itertor.hasNext()) {
            String name = itertor.next();
            System.out.println(name);
        }

        names.forEach(System.out::println);        
    }
}
