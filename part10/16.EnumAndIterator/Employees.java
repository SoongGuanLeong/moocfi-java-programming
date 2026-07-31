import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Employees {
    private List<Person> people;

    public Employees() {
        this.people = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        this.people.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        this.people.addAll(peopleToAdd);
    }

    public void print() {
        Iterator<Person> iterator = this.people.iterator();

        while (iterator.hasNext()) {
            Person nextInLine = iterator.next();
            System.out.println(nextInLine);
        }
    }

    public void print(Education education) {
        Iterator<Person> iterator = this.people.iterator();

        while (iterator.hasNext()) {
            Person nextInLine = iterator.next();
            if (nextInLine.getEducation().equals(education)) {
                System.out.println(nextInLine);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterator = this.people.iterator();

        while (iterator.hasNext()) {
            Person nextInLine = iterator.next();
            if (nextInLine.getEducation().equals(education)) {
                iterator.remove();
            }
        }
    }
}
