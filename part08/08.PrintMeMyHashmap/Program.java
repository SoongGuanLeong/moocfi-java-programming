
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
    }

    public static void printKeys(HashMap<String,String> hashmap) {
        for (String key: hashmap.keySet()) {
            System.out.println(key);
        }
    }

    public static void printKeysWhere(HashMap<String,String> hashmap, String text) {
        for (String key: hashmap.keySet()) {
            if (key.contains(formatString(text))) {
                System.out.println(key);
            }
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text) {
        for (String key: hashmap.keySet()) {
            if (key.contains(formatString(text))) {
                System.out.println(hashmap.get(key));
            }
        }
    }

    public static String formatString(String string) {
        if (string.equals(null)) {
            return "";
        }
        return string.toLowerCase().trim();
    }
}
