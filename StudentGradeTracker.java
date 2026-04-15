import java.util.*;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> marks = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.print("Enter marks of student " + (i+1) + ": ");
            marks.add(sc.nextInt());
        }

        int sum = 0, max = marks.get(0), min = marks.get(0);

        for(int m : marks) {
            sum += m;
            if(m > max) max = m;
            if(m < min) min = m;
        }

        double avg = (double)sum / n;

        System.out.println("Average: " + avg);
        System.out.println("Highest: " + max);
        System.out.println("Lowest: " + min);
    }
}