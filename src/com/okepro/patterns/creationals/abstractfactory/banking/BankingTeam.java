package com.okepro.patterns.creationals.abstractfactory.banking;

import com.okepro.patterns.creationals.abstractfactory.Developer;
import com.okepro.patterns.creationals.abstractfactory.ProjectManager;
import com.okepro.patterns.creationals.abstractfactory.ProjectTeamFactory;
import com.okepro.patterns.creationals.abstractfactory.Tester;

public class BankingTeam implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankPM();
    }
}
