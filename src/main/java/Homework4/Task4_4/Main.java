package Homework4.Task4_4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John", 1, 1);
        Student student2 = new Student("Olga", 2, 1);
        Student student3 = new Student("Vladimir", 2, 1);
        student1.setGrades(new HashMap<>() {{
            put("Programming", 5);
            put("History", 3);
            put("Mathematics", 4);
        }});
        student2.setGrades(new HashMap<>() {{
            put("Programming", 2);
            put("History", 5);
            put("Mathematics", 3);
        }});
        student3.setGrades(new HashMap<>() {{
            put("Programming", 3);
            put("History", 2);
            put("Mathematics", 5);
        }});

        List<Student> students = new ArrayList<>(3) {{
            add(student1);
            add(student2);
            add(student3);
        }};

        expelOrTransferToAHigherCourse(student1, students);
        System.out.println(student1);
        System.out.println("****************************");
        printStudents(students, 1);
    }

    private static void expelOrTransferToAHigherCourse(Student student, List<Student> students) {
        Map<String, Integer> grades = student.getGrades();
        int averageGrade = grades.values().stream().mapToInt(v -> v).sum() / grades.size();
        if (averageGrade < 3) students.remove(student);
        else student.setCourse(student.getCourse() + 1);
    }

    private static void printStudents(List<Student> students, int course) {
        students.stream()
                .filter(s -> s.getCourse() == course)
                .forEach(System.out::println);
    }
}
