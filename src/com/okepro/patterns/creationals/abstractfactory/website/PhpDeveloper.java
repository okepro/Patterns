package com.okepro.patterns.creationals.abstractfactory.website;

import com.okepro.patterns.creationals.abstractfactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Writing PHP code...");
    }
}
