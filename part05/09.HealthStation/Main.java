
public class Main {

    public static void main(String[] args) {
        // write experimental code here to check how your program functions
        HealthStation station = new HealthStation(); 
        Person p1 = new Person("Peter", 33, 175, 78); 
        Person p2 = new Person("Ethan", 0, 52, 4); 
        station.weigh(p1);
        station.weigh(p2);
        station.weigh(p2);
        station.weigh(p1);
        station.weigh(p1);
        System.out.println(station.weighings());
    }
}
