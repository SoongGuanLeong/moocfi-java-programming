import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> dictionary;
    
    public Abbreviations() {
        this.dictionary = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        this.dictionary.put(formatString(abbreviation), formatString(explanation));
    }

    public boolean hasAbbreviation(String abbreviation) {
        return this.dictionary.containsKey(formatString(abbreviation));
    }

    public String findExplanationFor(String abbreviation) {
        return this.dictionary.get(formatString(abbreviation));
    }

    public static String formatString(String string) {
        if (string.equals(null)) {
            return "";
        }
        return string.toLowerCase().trim();
    }
}
