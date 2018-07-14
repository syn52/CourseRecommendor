import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

    private List<Course> courses;

    public Student(String sname, int sid) {
        name = sname;
        studentId = sid;
        courses = new ArrayList<>();
    }
        @Override
        String getName() {
            return name;
        }

        @Override
        void setName(String name) {
            this.name = name;

        }

        @Override
        int getStudentID() {
            return studentId;
        }

        @Override
        void setSudentID(int id) {
            studentId = id;
        }

        public void addCourse(Course course) {
            courses.add(course);
        }

        public void deleteCourse(Course course) {
            courses.remove(course);
        }

    }

