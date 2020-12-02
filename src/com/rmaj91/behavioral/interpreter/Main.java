package com.rmaj91.behavioral.interpreter;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Expression query1 = new Select(
                "name",
                new From("people"));
        Context context1 = new Context();
        List<String> result1 = query1.interpret(context1);
        System.out.println(result1);

        Expression query2 = new Select(
                "*",
                new From("people"));
        Context context2 = new Context();
        List<String> result2 = query2.interpret(context2);
        System.out.println(result2);

        Expression query3 = new Select(
                "name",
                new From("people",
                new Where(name -> name.toLowerCase().startsWith("d"))));
        Context context3 = new Context();
        List<String> result3 = query3.interpret(context3);
        System.out.println(result3);

    }
}
