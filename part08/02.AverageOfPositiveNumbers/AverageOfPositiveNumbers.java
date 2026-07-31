
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = 0;
        double sum = 0;

        while (true) {
            double number = Double.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }
            
            if (number > 0) {
                sum += number;
                cnt++;
            }
        }

        if (cnt == 0) {
            System.out.println("Cannot calculate the average");
        }

        System.out.println(sum / cnt);
    }
}
