package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ElementsSectionUtil {

    public static List<String> getSecondColumnFromValues(List<List<String>> values) {
        List<String> fields = new ArrayList<>();
        values.forEach(value -> fields.add(value.get(1)));
        return fields;
    }

    public static List<String> makeLowerCase(List<String> values) {
        return values.stream()
                     .map(String::toLowerCase)
                     .collect(Collectors.toList());
    }
}
