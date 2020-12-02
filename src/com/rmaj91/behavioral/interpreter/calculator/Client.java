package com.rmaj91.behavioral.interpreter.calculator;

import com.rmaj91.behavioral.interpreter.calculator.expression.operators.AddExpression;
import com.rmaj91.behavioral.interpreter.calculator.expression.operators.MultiplyExpression;
import com.rmaj91.behavioral.interpreter.calculator.expression.operators.ValueExpression;

public class Client {

    public static void main(String[] args) {
        ValueExpression two = new ValueExpression(2);
        ValueExpression three = new ValueExpression(3);
        ValueExpression ten = new ValueExpression(10);

        MultiplyExpression expression = new MultiplyExpression(ten, new AddExpression(three, two));

        System.out.println(expression.evaluate());
    }
}
