
import java.util.Scanner;

public class CourseRecommender {

    public static void main(String[] args) {

        Course course1 = new Course("Math 10", "Math", 10);
        Course course2 = new Course("Pre-Calculus 11", "Math", 11);
        Course course3 = new Course("Pre-Calculus 12", "Math", 12);
        Course course4 = new Course("Calculus 12", "Math", 12);
        Course course5 = new Course("Science 10", "Science", 10);
        Course course6 = new Course("Biology 11", "Science", 11);
        Course course7 = new Course("Biology 12", "Science", 12);
        Course course8 = new Course("Physics 11", "Science", 11);
        Course course9 = new Course("Physics 12", "Science", 12);
        Course course10 = new Course("Chemistry 11", "Science", 11);
        Course course11 = new Course("Chemistry 12", "Science", 12);
        Course course12 = new Course("English 10", "Language", 10);
        Course course13 = new Course("English 11", "Language", 11);
        Course course14 = new Course("English 12", "Language", 12);

        //System.out.print(course1.getName());
        Scanner sc = new Scanner(System.in);


        System.out.println("Please enter your name:  ");
        String name = sc.nextLine();


        System.out.println("Please enter your student Id in the form: ");
        int stdId = sc.nextInt();


        while(!sc.nextLine().equals("exit")) {
            printHelper();
            String input = sc.nextLine();
            if (input.equals("math")) {
                System.out.println(course1.getName());
                System.out.println(course2.getName());
                System.out.println(course3.getName());
                System.out.println(course4.getName());
                System.out.println("To go back type back.");


            }

            if (input.equals("science")) {
                System.out.println(course5.getName());
                System.out.println(course6.getName());
                System.out.println(course7.getName());
                System.out.println(course8.getName());
                System.out.println(course9.getName());
                System.out.println(course10.getName());
                System.out.println(course11.getName());
                System.out.println("To go back type back.");

            }

            if (input.equals("language")) {
                System.out.println(course12.getName());
                System.out.println(course13.getName());
                System.out.println(course14.getName());
                System.out.println("To go back type back.");

            }
         }

    }


    private static void printHelper() {
        System.out.println("To see the courses offered type in one of the following: ");
        System.out.println("For Math courses type math");
        System.out.println("For Science courses type science");
        System.out.println("For Language courses type language");

    }


}