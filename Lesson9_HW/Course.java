package Lesson9_HW;

import java.util.Objects;

public class Course {
    private String nameCrs;

    public Course(String nameCrs) {
        this.nameCrs = nameCrs;
    }

    public String getNameCrs() {
        return nameCrs;
    }

    public void setNameCrs(String nameCrs) {
        this.nameCrs = nameCrs;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + nameCrs + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(nameCrs, course.nameCrs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameCrs);
    }
}
