package Week7Practical12;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class FootballLeague {

    // field to store the name of the football league
    private String footballLeague;
    // list to store the football teams in the league
    List<Team> footballTeamList=new LinkedList();

    // constructor to create a football league with a given name
    public FootballLeague(String footballLeague) {
        this.footballLeague = footballLeague;
    }

    // method to sort the football team list in descending order based on points
    public void descendingOrderSorting(){
        Collections.sort(footballTeamList, new Comparator<Team>() {
            @Override
            public int compare(Team team1, Team team2) {
                return - (team1.getTeamPoints() - team2.getTeamPoints());
            }
        });
    }

    // overridden toString method to return a string representation of the football league
    public String toString() {
        String printScreen = "";
        printScreen += "FootballLeague: " + this.footballLeague + "\n";
        Integer teamPosition = 1;
        for (Team team : this.footballTeamList) {
            printScreen += "\nRanking " + teamPosition.toString() + "\n";
            printScreen += team;
            teamPosition += 1;
        }
        return printScreen;
    }

    // method to add a football team to the league
    public void addFootballTeam(Team teamToAdd) {
        this.footballTeamList.add(teamToAdd);
    }

    // method to remove a football team from the league
    public void removeFootballTeam(Team teamToRemove){
        this.footballTeamList.remove(teamToRemove);
    }

    // method to update the points of the winning and losing teams when a match is played
    public void winMatch(Team winningTeam, Team losingTeam) {
        for (int i = 0; i < this.footballTeamList.size(); i++) {
            if (footballTeamList.get(i).getTeamName().compareTo(winningTeam.getTeamName()) == 0) {
                winningTeam.increaseTeamWin();
            }
            if (this.footballTeamList.get(i).getTeamName().compareTo(losingTeam.getTeamName()) == 0) {
                losingTeam.increaseTeamLoss();
            }
        }
    }

    // method to update the points of the teams when a match is drawn
    public void draw(Team one, Team two) {
        for (int i = 0; i < this.footballTeamList.size(); i++) {
            if (footballTeamList.get(i).getTeamName().compareTo(one.getTeamName()) == 0) {
                one.increaseTeamDraws();;
            }
            if (this.footballTeamList.get(i).getTeamName().compareTo(two.getTeamName()) == 0) {
                two.increaseTeamDraws();
            }
        }
    }

    // method to show the teams that will be relegated based on their points
    public void showRelegatedTeams() {
        descendingOrderSorting();
        int numRelegatedTeams = 3;
        System.out.println("Relegated Teams: ");
        for (int i = footballTeamList.size() - 1; i >= footballTeamList.size() - numRelegatedTeams; i--) {
            System.out.println(footballTeamList.get(i).getTeamName());
        }
    }
}
