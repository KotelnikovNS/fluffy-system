package Lesson9_HW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Иванов",
                Arrays.asList(new Course("111"))));

        students.add(new Student("Петров",
                Arrays.asList(new Course("222"), new Course("333"))));

        students.add(new Student("Сидоров",
                Arrays.asList(new Course("444"), new Course("555"), new Course("666"))));

        students.add(new Student("Кузьмич",
                Arrays.asList(new Course("777"), new Course("888"), new Course("999"), new Course("111"))));


        System.out.println(students.stream()
                .map(s -> s.getCourses())
                .flatMap(f -> f.stream())
                .collect(Collectors.toSet()));

        System.out.println(students.stream()
                .sorted((s1, s2) -> s2.getCourses().size() - s1.getCourses().size())
                .limit(2)
                .collect(Collectors.toList()));

        Course course = new Course("Testing");
        System.out.println(students.stream()
                .filter(s -> s.getCourses().contains(course))
                .collect(Collectors.toList()));
    }
}
