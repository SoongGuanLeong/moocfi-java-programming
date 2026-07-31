
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("First name: ");
            String input1 = scanner.nextLine();
            if (input1.equals("")) {
                break;
            }
            System.out.println("Last name: ");
            String input2 = scanner.nextLine();
            System.out.println("Identification number: ");
            String input3 = scanner.nextLine();

            infoCollection.add(new PersonalInformation(input1, input2, input3));
        }
        System.out.println();

        for (PersonalInformation info: infoCollection) {
            System.out.println(info.getFirstName() + " " + info.getLastName());
        }

    }
}
