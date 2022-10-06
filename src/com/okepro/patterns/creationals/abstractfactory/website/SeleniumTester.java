package com.okepro.patterns.creationals.abstractfactory.website;

import com.okepro.patterns.creationals.abstractfactory.Tester;

public class SeleniumTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Testing PHP code...");
    }
}
