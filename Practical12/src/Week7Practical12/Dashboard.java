package Week7Practical12;

public class Dashboard {

    public static void main(String[] args) {

        // Create a new FootballLeague object with name "La Liga"
        FootballLeague footballLeague= new FootballLeague("La Liga");

        // Create new Team objects
        Team team1 = new Team("Barcelona");
        Team team2 = new Team("Real Madrid");
        Team team3 = new Team("Real Sociedad");
        Team team4 = new Team("Real Betis");
        Team team5 = new Team("Atletico Madrid");
        Team team6 = new Team("Levante");


        // Add teams to the FootballLeague object
        footballLeague.addFootballTeam(team1);
        footballLeague.addFootballTeam(team2);
        footballLeague.addFootballTeam(team3);
        footballLeague.addFootballTeam(team4);
        footballLeague.addFootballTeam(team5);
        footballLeague.addFootballTeam(team6);

        // Record wins for various teams
        footballLeague.winMatch(team2,team1);
        footballLeague.winMatch(team3,team6);
        footballLeague.winMatch(team4,team5);

        // Record draws for various teams
        footballLeague.draw(team3,team4);
        footballLeague.draw(team6,team1);
        footballLeague.draw(team2,team5);

        // Record wins for various teams
        footballLeague.winMatch(team6,team4);
        footballLeague.winMatch(team2,team3);
        footballLeague.winMatch(team1,team5);

        // Record draws for various teams
        footballLeague.draw(team4,team1);
        footballLeague.draw(team5,team6);
        footballLeague.draw(team4,team2);

        // Record wins for various teams
        footballLeague.winMatch(team4,team1);
        footballLeague.winMatch(team5,team3);
        footballLeague.winMatch(team2,team6);

        // Record draws for various teams
        footballLeague.draw(team5,team6);
        footballLeague.draw(team1,team2);
        footballLeague.draw(team4,team3);

        // Sort teams in descending order by points
        footballLeague.descendingOrderSorting();

        // Print the FootballLeague object
        System.out.println(footballLeague);

        // Show the teams that have been relegatedß
        footballLeague.showRelegatedTeams();
    }
}


