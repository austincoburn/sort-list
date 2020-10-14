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
    void shouldFlattenIntegerArray() {
        List<?> result = app.flattenList(resultList);
        List<Integer> expected = Arrays.asList(2,4,5,8,2,7);
        assertEquals(expected, result);
    }

    @Test
    void shouldFlattenStringArray() {
        List<String> stringList1 = Arrays.asList("Hello","My", null, "name", "is");
        List<String> stringList2 = Arrays.asList(null, "Alec", null, "and", "my name", null, "is", "Austin");
        List<List<?>> resultList = Arrays.asList(stringList1, stringList2);

        List<?> result = app.flattenList(resultList);
        List<String> expected = Arrays.asList("Hello","My", "name", "is", "Alec","and","my name","is","Austin");
        assertEquals(expected, result);
    }

    @Test
    void nullListShouldHaveSizeOfZero() {
        List<String> nullList1 = Arrays.asList(null, null, null);
        List<String> nullList2 = Arrays.asList(null, null, null, null);
        List<List<?>> resultList = Arrays.asList(nullList1, nullList2);
        List<?> result = app.flattenList(resultList);
        assertEquals(0, result.size());
    }



}