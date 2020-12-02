package com.rmaj91.behavioral.interpreter;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Context {

    private static final Predicate<String> matchAnyString = s -> s.length() > 0;
    private static final Function<String, Stream<? extends String>> matchAllColumns = Stream::of;

    private static Map<String, List<Row>> tables = new HashMap<>();

    static {
        List<Row> list = new ArrayList<>();
        list.add(new Row("John", "Doe"));
        list.add(new Row("Jan", "Kowalski"));
        list.add(new Row("Dominic", "Doom"));
        tables.put("people", list);
    }

    private String table;
    private String column;
    private int colIndex = -1;
    private Predicate<String> whereFilter = matchAnyString;
    private Function<String, Stream<? extends String>> columnMapper = matchAllColumns;

    public List<String> search() {
        List<String> result = tables.entrySet()
                .stream()
                .filter(entry -> entry.getKey().equalsIgnoreCase(table))
                .flatMap(entry -> Stream.of(entry.getValue()))
                .flatMap(Collection::stream)
                .map(Row::toString)
                .flatMap(columnMapper)
                .filter(whereFilter)
                .collect(Collectors.toList());
        clear();
        return result;
    }

    private void setColumnMapper() {
        switch (column) {
            case "*":
                colIndex = -1;
                break;
            case "name":
                colIndex = 0;
                break;
            case "surname":
                colIndex = 1;
                break;
        }
        if (colIndex != -1) {
            columnMapper = s -> Stream.of(s.split(" ")[colIndex]);
        }
    }

    public void setTable(String table) {
        this.table = table;
    }

    public void setColumn(String column) {
        this.column = column;
        setColumnMapper();
    }

    public void setFilter(Predicate<String> filter) {
        whereFilter = filter;
    }

    private void clear() {
        column = "";
        columnMapper = matchAllColumns;
        whereFilter = matchAnyString;
    }
}
