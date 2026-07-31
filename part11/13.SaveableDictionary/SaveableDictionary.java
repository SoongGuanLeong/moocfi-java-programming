package dictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.PrintWriter;

public class SaveableDictionary {
    private HashMap<String,String> hmap;
    private String file;
    
    public SaveableDictionary() {
        this.hmap = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this.hmap = new HashMap<>();
        this.file = file;
    }

    public void add(String words, String translation) {
        if (!this.hmap.containsKey(words) && !this.hmap.containsValue(translation)) {
            this.hmap.put(words, translation);
            this.hmap.put(translation, words);
        }
    }

    public String translate(String word) {
        if (!this.hmap.containsKey(word)) {
            return null;
        }
        return this.hmap.get(word);
    }

    public void delete(String word) {
        if (this.hmap.containsKey(word)) {
            String translation = this.hmap.get(word);

            this.hmap.remove(word);
            this.hmap.remove(translation);
        }
    }

    public boolean load() {
        try (Scanner scanner = new Scanner(Paths.get(this.file))) {
            while (scanner.hasNextLine()) {
                String[] words = scanner.nextLine().split(":");
                this.add(words[0], words[1]);
            }
            return true;
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
            return false;
        }
    }

    public boolean save() {
        try (PrintWriter writer = new PrintWriter(this.file);) {
            HashSet<String> alreadySaved = new HashSet<>();

            for (String word: this.hmap.keySet()) {
                String translation = this.hmap.get(word);

                if (!alreadySaved.contains(word) && !alreadySaved.contains(translation)) {
                    writer.println(word + ":" + translation);

                    alreadySaved.add(word);
                    alreadySaved.add(translation);
                }
            }
            return true;
        } catch (Exception e) {
            System.out.println("Error writing file: " + e.getMessage());
            return false;
        }
    }
}
