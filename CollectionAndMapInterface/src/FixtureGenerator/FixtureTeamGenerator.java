package FixtureGenerator;

import java.util.ArrayList;
import java.util.List;

public class FixtureTeamGenerator {
    private List<Team> teams;
    private List<String> fixtures;

    public FixtureTeamGenerator(List<Team> teams) {
        this.teams = teams;
        this.fixtures = new ArrayList<>();
    }

    public void generateFixtures() {
        if (teams.size() % 2 != 0) {
            teams.add(new Team("Bay"));
        }

        int numRounds = teams.size() - 1;
        int numMatchesPerRound = teams.size() / 2;

        for (int round = 0; round < numRounds; round++) {
            StringBuilder roundFixture = new StringBuilder();

            for (int match = 0; match < numMatchesPerRound; match++) {
                Team team1 = teams.get((round + match) % teams.size());
                Team team2 = teams.get((round + teams.size() - match) % teams.size());

                roundFixture.append(team1.getName()).append(" vs ").append(team2.getName()).append(" ");
            }

            fixtures.add(roundFixture.toString());
        }
    }

    public List<String> getFixtures() {
        return fixtures;
    }
}
