
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> pointsList;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.pointsList = new ArrayList<Integer>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.pointsList.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public double averageOfGrades() {
        if (this.grades.size() == 0) {
            return -1;
        }

        int cnt = 0;
        double sum = 0;
        for (int grade: this.grades) {
            sum += grade;
            cnt++;
        }
        return sum / cnt;
    }

    public double averageOfPoints() {
        if (this.pointsList.size() == 0) {
            return -1;
        }

        int cnt = 0;
        double sum = 0;
        for (int points: this.pointsList) {
            sum += points;
            cnt++;
        }
        return sum / cnt;
    }
}
