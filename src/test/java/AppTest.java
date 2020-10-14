import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    List<Integer> integerList = Arrays.asList(2, 4, null);
    List<Integer> secondList = Arrays.asList(5, 8, 2, null, 7, null);
    List<List<?>> resultList = Arrays.asList(integerList, secondList);
    App app = new App();

    @Test
    void shouldFlattenArray() {
        List<?> result = app.flattenList(resultList);
        List<Integer> expected = Arrays.asList(2,4,5,8,2,7);
        assertEquals(expected, result);
    }
}