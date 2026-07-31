
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = 0;
        int total = 0;

        while (true) {
            int num = Integer.valueOf(scanner.nextLine());

            if (num == 0) {
                break;
            }
            if (num < 0) {
                continue;
            }
            
            cnt = cnt + 1;
            total = total + num;
        }
        
        if (cnt == 0) {
            System.out.println("Cannot calculate the average");
        }
        System.out.println(total * 1.0 / cnt);
    }
}
