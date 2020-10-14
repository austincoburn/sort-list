import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
    
    }

    private static List<?> flattenList(List<List<?>> list) {
        List<?> result = list.stream().flatMap(Collection::stream).filter(Objects::nonNull).collect(Collectors.toList());
        return result;
    }


}
