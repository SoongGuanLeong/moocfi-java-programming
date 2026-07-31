import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokes;

    public JokeManager() {
        this.jokes = new ArrayList<String>();
    }

    public void addJoke(String joke) {
        this.jokes.add(joke);
    }

    public String drawJoke() {
        if (jokes.size() == 0) {
            return "Jokes are in short supply.";
        }
        Random rand = new Random();
        int index = rand.nextInt(jokes.size());
        return jokes.get(index);
    }

    public void printJokes() {
        for (String joke: jokes) {
            System.out.println(joke);
        }
    }
}
