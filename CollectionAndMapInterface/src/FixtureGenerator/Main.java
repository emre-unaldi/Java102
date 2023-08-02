package FixtureGenerator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Team> teams = new ArrayList<>();

        teams.add(new Team("Galatasaray"));
        teams.add(new Team("Bursaspor"));
        teams.add(new Team("Fenerbahçe"));
        teams.add(new Team("Beşiktaş"));
        teams.add(new Team("Başakşehir"));
        teams.add(new Team("Trabzonspor"));

        FixtureTeamGenerator fixtureTeamGenerator = new FixtureTeamGenerator(teams);
        fixtureTeamGenerator.generateFixtures();

        int roundNum = 1;
        for (String roundFixture : fixtureTeamGenerator.getFixtures()) {
            System.out.println("Round " + roundNum);
            System.out.println(roundFixture);
            roundNum++;
        }
    }
}
