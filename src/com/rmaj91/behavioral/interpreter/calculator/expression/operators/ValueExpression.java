package com.rmaj91.behavioral.interpreter.calculator.expression.operators;

import com.rmaj91.behavioral.interpreter.calculator.expression.Expression;

public class ValueExpression implements Expression {

    private double value;

    public ValueExpression(double value) {
        this.value = value;
    }

    @Override
    public double evaluate() {
        return value;
    }
}
