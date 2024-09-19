package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Utils methods for steps
 */
public class ElementsSectionUtil {

    /**
     * Get data from cells in certain column
     *
     * @param table       cucumber-table from step in scenario
     * @param columnIndex index of column (starting from 0)
     * @return all fields from column
     */
    public static List<String> getValuesFromColumnCucumberTable(List<List<String>> table, int columnIndex) {
        List<String> fields = new ArrayList<>();
        table.forEach(value -> fields.add(value.get(columnIndex)));
        return fields;
    }

    /**
     * Make all data in list in lower case
     */
    public static List<String> makeLowerCase(List<String> values) {
        return values.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());
    }

    /**
     * Remove first line from cucumber-table. Common case: exclude table headers.
     *
     * @param table table from step in cucumber scenario
     * @return table without first line
     */
    public static List<List<String>> getValuesWithoutFirstLine(List<List<String>> table) {
        table.remove(0);
        return table;
    }
}
