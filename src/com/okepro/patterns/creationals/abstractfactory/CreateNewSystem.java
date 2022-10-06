package com.okepro.patterns.creationals.abstractfactory;

import com.okepro.patterns.creationals.abstractfactory.banking.BankingTeam;
import com.okepro.patterns.creationals.abstractfactory.website.WebSiteTeamFactory;

public class CreateNewSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeam();
        Developer javaDeveloper = projectTeamFactory.getDeveloper();
        Tester qaTester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        javaDeveloper.writeCode();
        qaTester.testCode();
        projectManager.manageProject();

        ProjectTeamFactory webSiteTeamFactory = new WebSiteTeamFactory();
        Developer phpDeveloper = webSiteTeamFactory.getDeveloper();
        Tester seleniumTester = webSiteTeamFactory.getTester();
        ProjectManager webSiteTeamFactoryProjectManager = webSiteTeamFactory.getProjectManager();

        phpDeveloper.writeCode();
        seleniumTester.testCode();
        webSiteTeamFactoryProjectManager.manageProject();
    }
}
