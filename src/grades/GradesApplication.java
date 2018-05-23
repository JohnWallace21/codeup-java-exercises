package grades;

import java.util.HashMap;
import util.Input;

public class GradesApplication {

    public static Input input = new Input();

    public static void main(String[] args) {

        System.out.println("Welcome to the grades application!");

        // create a map of students where the key is their github username.
        HashMap<String, Student> students;

        // populate the students hashmap w/ premade students
        students = myStudents();

        // display only the student github usernames
        showStudentDetail(students);

        System.out.println("Thank you for using the grades application.");

    }

    public static void showStudentDetail(HashMap<String, Student> students) {

        String requestedUsername;

        do {
            showUsernames(students);
            System.out.println("Please input the username for the student to get their grades");
            requestedUsername = input.getString();

            if(students.containsKey(requestedUsername)) {
                Student student = students.get(requestedUsername);

                System.out.println(student.getName() + " has a grade of " + student.getGradeAverage());
                System.out.println();
            } else {
                System.out.println("404 - " + requestedUsername + " is not found.");
            }

        } while (input.yesNo("Do you want information on another student? Type y or yes for yes."));
    }


    public static HashMap<String, Student> myStudents() {
        HashMap<String, Student> students = new HashMap<>();

        Student student1 = new Student("Arnold");
        student1.addGrade(10);
        student1.addGrade(97);
        student1.addGrade(70);

        Student student2 = new Student("Jamaal");
        student2.addGrade(14);
        student2.addGrade(12);
        student2.addGrade(99);
        student2.addGrade(99);

        Student student3 = new Student("Tim");
        student3.addGrade(5);
        student3.addGrade(99);
        student3.addGrade(83);
        student3.addGrade(99);

        students.put("Arnold", student1);
        students.put("Jamaal", student2);
        students.put("Tim", student3);

        return students;

    }

    public static HashMap<String, Student> addStudent(HashMap<String, Student> students) {
        String username = input.getString("Please input the new student's github username: ");
        String name = input.getString("Input the student's full name? ");

        Student student = new Student(name);

        int grade;
        do {
            grade = input.getInt(1, 100, "Please input a grade: ");
            student.addGrade(grade);

        } while(input.yesNo("Do you want to add another grade? Y or yes to input a new grade."));

        students.put(username, student);

        return students;
    }


    public static void showUsernames(HashMap<String, Student> students) {
        for (String key : students.keySet() ) {
            System.out.print( key + "        ");
        }
        System.out.println();
    }
}

    GRANT ALL ON codeup_test_db.* TO 'codeup_test_user'@'localhost' WITH GRANT OPTION;

