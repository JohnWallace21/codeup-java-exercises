package grades;

import java.util.ArrayList;

public  class Student {

    private String name;
    private ArrayList<Integer> grades;
    public static void main(String[] args) {

        Student arnold = new Student("Arnold");
        arnold.addGrade(50);
        arnold.addGrade(60);
        arnold.addGrade(70);
        arnold.addGrade(80);
        arnold.addGrade(90);
        arnold.addGrade(49);
        System.out.println("The Students name is " + arnold.getName() + "  Arnold's average is " + arnold.getGradeAverage());

    }
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }
    // returns the stud name
    public String getName(){
        return name;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);

    }
    // returns the average of the students grades
    public double getGradeAverage() {
        double total = 0;
        for(int grade : grades) {
            total += grade;
        }
        return total / grades.size();
    }

}


