package com.okepro.patterns.creationals.abstractfactory.website;

import com.okepro.patterns.creationals.abstractfactory.Developer;
import com.okepro.patterns.creationals.abstractfactory.ProjectManager;
import com.okepro.patterns.creationals.abstractfactory.ProjectTeamFactory;
import com.okepro.patterns.creationals.abstractfactory.Tester;

public class WebSiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new SeleniumTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new SitePM();
    }
}
