package utils;

import java.util.ArrayList;
import java.util.List;

public class TextBoxPageUtil {

    public static List<String> getSecondColumnFromValues(List<List<String>> values) {
        List<String> fields = new ArrayList<>();
        values.forEach(value -> fields.add(value.get(1)));
        return fields;
    }
}
