package Amdocs_Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Print_Student_Grade_Ouest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int student_id = scanner.nextInt();
        String student_name = scanner.next();

        int subjectsCount = scanner.nextInt();

        List<Grade> grades = new ArrayList<>();
        for (int i = 0; i < subjectsCount; i++) {
            String subject_name = scanner.next();
            char grade = scanner.next().charAt(0);
            grades.add(new Grade(subject_name, grade));
        }

        Student student = new Student(student_id, student_name, grades);
        student.display();
    }

    public static class Grade {
        public String subject_name;
        public char grade;

        public Grade(String subject, char g) {
            subject_name = subject;
            grade = g;
        }
    }

    public static class Student {
        public int student_id;
        public String student_name;
        public List<Grade> grades;

        public Student(int id, String name, List<Grade> g) {
            student_id = id;
            student_name = name;
            grades = g;
        }

        public void display() {
            System.out.println(student_id + " " + student_name);
            for (Grade grade : grades) {
                System.out.println(grade.subject_name + " " + grade.grade);
            }
        }
    }

}
