import java.util.ArrayList;

public class Course {
    private String name;
    private String coursetype;
    private int grade;
    private ArrayList<Student> listStudent;
    public int numberOfStudent;

    public Course(String cname, String ctype, int cgrade) {
        name = cname;
        coursetype = ctype;
        listStudent = new ArrayList<>();
        grade = cgrade;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoursetype(){
        return coursetype;
    }
    public void setCoursetype(String type){
        coursetype = type;
    }


    public int size(){
        numberOfStudent = listStudent.size();
        return numberOfStudent;
    }

    public void addStudent(Student student) {
        if(numberOfStudent >= 20){
            System.out.println("Class is Full");
        }
        else {
            listStudent.add(student);
        }

    }
}

