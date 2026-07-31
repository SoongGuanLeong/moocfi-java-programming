
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String fileName = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();

        ArrayList<Match> records = readRecordsFromFile(fileName);

        int games = 0;
        int win = 0;
        for (Match record: records) {
            if (record.getHomeTeam().equals(team) || record.getVisitTeam().equals(team)) {
                games++;
            }

            if ((record.getHomeTeam().equals(team) && record.getHomePoints() > record.getVisitPoints()) 
                || (record.getVisitTeam().equals(team) && record.getVisitPoints() > record.getHomePoints())) {
                win++;
            }
        }
        System.out.println("Games: " + games);
        System.out.println("Wins: " + win);
        System.out.println("Losses: " + (games - win));
    }

    public static ArrayList<Match> readRecordsFromFile(String file) {
        ArrayList<Match> matches = new ArrayList<>();

        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                
                String[] words = line.split(",");
                String homeTeam = words[0];
                String visitTeam = words[1];
                int homePts = Integer.valueOf(words[2]);
                int visitPts = Integer.valueOf(words[3]);

                matches.add(new Match(homeTeam, visitTeam, homePts, visitPts));
            }
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }

        return matches;
    }

}
