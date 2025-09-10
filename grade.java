import java.util.*;

public class GradeTracker {
    static class Student {
        String name;
        int score;
        Student(String name, int score) {
            this.name = name;
            this.score = score;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        System.out.println("Enter number of students:");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.print("Enter name: ");
            String name = sc.next();
            System.out.print("Enter score: ");
            int score = sc.nextInt();
            students.add(new Student(name, score));
        }

        int sum = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for(Student s : students){
            sum += s.score;
            if(s.score > max) max = s.score;
            if(s.score < min) min = s.score;
        }

        double average = (double)sum / n;
        System.out.println("Summary Report:");
        for(Student s : students) {
            System.out.println(s.name + ": " + s.score);
        }
        System.out.printf("Average Score: %.2f\n", average);
        System.out.println("Highest Score: " + max);
        System.out.println("Lowest Score: " + min);
    }
}
