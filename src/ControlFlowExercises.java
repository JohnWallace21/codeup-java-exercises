import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
       int i = 5;
        while (i <= 15){
            System.out.println(i);
            i++;
        }
       int  x = 1;
        do {
            System.out.println(x * 2);
            i++;

        } while(i < 10);
 ==============================================================================================
        String buzz = "buzz", fizz = "fizz";
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.println(buzz + fizz + " " + i);
            } else if (i % 3 == 0) {
                System.out.println(buzz + " " + i);
            } else if (i % 5 == 0) {
                System.out.println(fizz + " " + i);
            }
        }
// ====================================================================================================
        Scanner userInt = new Scanner(System.in);
        System.out.println("Enter an int: ");
        int number = userInt.nextInt();
        for (int n = 1; n <= number; n++) {
            int squared = n * n;
            int cubed = n * n * n;
            System.out.println("Here is your table!");
            System.out.println("Your number " + n);
            System.out.println("Squared: " + squared);
            System.out.println("Cubed: " + cubed);
        }

// ======================================================================================================
        Scanner userGrade = new Scanner(System.in);
        System.out.println("Enter your grade: ");
        int grade = userGrade.nextInt();
        if (grade <= 100 && grade >= 88) {
            System.out.println("You got an A");
        } else if (grade <= 87 && grade >= 80){
            System.out.println("You got a B");
        }   else if (grade <= 79 && grade >= 67){
            System.out.println("You got a c");
        }   else if (grade <= 66 && grade >= 60){
            System.out.println("You got a d");
        }    else if (grade <= 59){
            System.out.println("You got an F");
        }




    }
}




