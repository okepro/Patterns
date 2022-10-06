package com.okepro.patterns.creationals.abstractfactory.banking;

import com.okepro.patterns.creationals.abstractfactory.ProjectManager;

public class BankPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Manage bank project...");
    }
}
