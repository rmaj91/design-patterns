package com.rmaj91.behavioral.templateMethod;

public abstract class Algorithm {

    final void doSthVeryComplicated() {
        step1();
        step2();
        step3();
        step4();
    }

    private void step4() {
        System.out.println("final 4 abstract step");
    }

    protected abstract void step3();

    private void step2() {
        System.out.println("abstract step nr 2");
    }

    protected abstract void step1();
}
