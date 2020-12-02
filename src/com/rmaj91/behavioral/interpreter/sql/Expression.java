package com.rmaj91.behavioral.interpreter.sql;

import java.util.List;

public interface Expression {

    List<String> interpret(Context context);
}
