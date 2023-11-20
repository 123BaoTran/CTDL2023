package Lab09.task1;

import java.util.List;

public class Faculty {
    String name;
    String address;
    List<Course> courses;
    public Faculty(String name, String address, List<Course> courses) {
        this.name = name;
        this.address = address;
        this.courses = courses;
    }
    /*
     * Phương thức public Course getMaxPracticalCourse() 
     * trả về course thực hành có nhiều sinh viên đăng ký học nhất.
     */
    public Course getMaxPracticalCourse(){
        Course re = courses.get(0);
        for (int i=1; i < courses.size(); i++){
            if(!re.hasMoreStudentsThan(courses.get(i));
            re = courses.get(i);
        }
        return null;
    }
/*
 * Phương thức public Map<Integer>, List<Student>> groupStudentsByYear()
 *  để thống kê danh sách sinh viên theo năm vào học, 
 * với key là năm vào học và value là các sinh viên tương ứng.
 */
public Map<Integer>, List<Student>> groupStudentsByYear(){

}

 /*
  * Phương thức public Set<Course> filterCourses(String type) 
  trả về các course theo loại cho trước (type).
  Các course được sắp xếp giảm dần theo số lượng sinh viên đăng ký học.
  */
    public Set<Course> filterCourses(String type) {
        
    }
}
