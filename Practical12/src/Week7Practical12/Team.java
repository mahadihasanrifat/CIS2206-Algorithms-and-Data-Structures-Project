package Week7Practical12;

// Class representing a team in a sports league
public class Team implements Comparable<Team>{

    private String teamName;        // Team name
    private int teamWins;           // Number of wins
    private int teamDraws;          // Number of draws
    private int teamLosses;         // Number of losses
    private Integer teamPoints;     // Number of points

    // Constructor to create a team with given name
    public Team(String teamName) {
        this.teamName = teamName;
        this.teamWins = 0;
        this.teamDraws = 0;
        this.teamLosses = 0;
        this.teamPoints = 0;
    }

    // Get the team name
    public String getTeamName() {
        return teamName;
    }

    // Get the number of points
    public int getTeamPoints() {
        return teamPoints;
    }

    // Increase the number of wins by 1 and add 3 points
    public void increaseTeamWin() {

        teamWins = teamWins + 1;
        teamPoints = teamPoints + 3;
    }

    // Increase the number of losses by 1
    public void increaseTeamLoss() {
        this.teamLosses = this.teamLosses + 1;
    }

    // Increase the number of draws by 1 and add 1 point
    public void increaseTeamDraws() {
        teamDraws = teamDraws + 1;
        teamPoints = teamPoints + 1;
    }

    // Return a string representation of the team
    @Override
    public String toString(){
        String output = "";
        output += "\tTeam Name: " + this.teamName + "\n";
        output += "\tTeam Wins: " + this.teamWins + "\n";
        output += "\tTeam Draw: " + this.teamDraws + "\n";
        output += "\tTeam Loss: " + this.teamLosses + "\n";
        output += "\tTeam Points: " + this.teamPoints + "\n";
        return output;
    }

    // Compare this team to another team based on number of points
    @Override
    public int compareTo(Team team) {
        return - this.teamPoints.compareTo(team.teamPoints);

    }
}


