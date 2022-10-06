package com.okepro.patterns.creationals.abstractfactory.banking;

import com.okepro.patterns.creationals.abstractfactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Write Java code...");
    }
}
