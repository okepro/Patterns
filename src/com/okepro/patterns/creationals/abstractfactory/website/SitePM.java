package com.okepro.patterns.creationals.abstractfactory.website;

import com.okepro.patterns.creationals.abstractfactory.ProjectManager;

public class SitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Manage website...");
    }
}
