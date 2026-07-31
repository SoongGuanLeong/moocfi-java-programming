
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give points [0-100]:");
        int pts = Integer.valueOf(scan.nextLine());
        String grade = "";

        if (pts < 0) {
            grade = "impossible!";
        } else if (pts <= 49) {
            grade = "failed";
        } else if (pts <= 59) {
            grade = "1";
        } else if (pts <= 69) {
            grade = "2";
        } else if (pts <= 79) {
            grade = "3";
        } else if (pts <= 89) {
            grade = "4";
        } else if (pts <= 100) {
            grade = "5";
        } else {
            grade = "incredible!";
        }

        System.out.println("Grade: " + grade);
    }
}
