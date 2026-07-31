public class Person implements Comparable<Person>{
    private String country;
    private int year;
    private String gender;
    private double pct;

    public Person(String country, int year, String gender, double pct) {
        this.country = country.trim();
        this.year = year;
        this.gender = formatGender(formatString(gender));
        this.pct = pct;
    }

    public Person(String[] parts) {
        this.country = parts[3].trim();
        this.year = Integer.valueOf(parts[4]);
        this.gender = formatGender(formatString(parts[2]));
        this.pct = Double.valueOf(parts[5]);
    }

    public String getCountry() {
        return this.country;
    }

    public int getYear() {
        return this.year;
    }

    public String getGender() {
        return this.gender;
    }

    public double getPct() {
        return this.pct;
    }

    @Override
    public String toString() {
        return this.country + " (" + this.year + "), " + this.gender + ", " + this.pct;
    }

    @Override
    public int compareTo(Person person) {
        return Double.compare(this.pct, person.pct);
    }

    private String formatString(String input) {
        if (input == null) {
            return "";
        }
        return input.toLowerCase().trim();
    }

    private String formatGender(String input) {
        return input.split(" ")[0];
    }
}
