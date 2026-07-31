public class Match {
    private String homeTeam;
    private String visitTeam;
    private int homePts;
    private int visitPts;

    public Match(String homeTeam, String visitTeam, int homePts, int visitPts) {
        this.homeTeam = homeTeam;
        this.visitTeam = visitTeam;
        this.homePts = homePts;
        this.visitPts = visitPts;
    }

    public String getHomeTeam() { return homeTeam; }
    public String getVisitTeam() { return visitTeam; }
    public int getHomePoints() { return homePts; }
    public int getVisitPoints() { return visitPts; }

    public boolean homeTeamWon() {
        return homePts > visitPts;
    }

    public boolean visitTeamWon() {
        return homePts < visitPts;
    }
}
