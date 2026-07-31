
public class HealthStation {
    private int cnt;

    public HealthStation(int cnt) {
        this.cnt = cnt;
    }

    public HealthStation() {
        this(0);
    }

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        this.cnt++;
        return person.getWeight();
    }

    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }

    public int weighings() {
        return this.cnt;
    }

}
