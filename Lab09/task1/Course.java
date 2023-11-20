package Lab09.task1;

import java.util.List;

public class Course {
    String id;
    String title;
    String type;
    List<Student> students;
    String lecturer;
    public Course(String id, String title, String type, List<Student> students, String lecturer) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.students = students;
        this.lecturer = lecturer;
    }
    public static void main(String[] args) {

        List<Student> st1 = (List<Student>) new Student("200", "NguyenVanA", 2019);
        Course cs1 = new Course("100", "Cấu trúc dữ liệu", "TH", st1, "PhanDinhLong");

    }
}
