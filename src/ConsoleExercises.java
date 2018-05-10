import java.util.Scanner;

public class ConsoleExercises {


    public static void main(String[] args) {
        int userInput;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Int: ");
        userInput = sc.nextInt();
        System.out.println("You entered: --> \"" + userInput + "\" <--");

//        String inputUser;
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Please enter 3 words: ");
//        inputUser = scan.nextLine();
//        System.out.println("Your words are: " + inputUser);
//
//    }


        String userSentence;
        Scanner sentence = new Scanner(System.in);
        System.out.print("Please enter a sentence: ");
        userSentence = sentence.nextLine();
        System.out.println("You entered: " + userSentence);
//==================================================================================

        int area;
        int perimeter;
        Scanner length = new Scanner(System.in);
        System.out.print("Enter the length: ");
        length.nextLine();
        Scanner width =  new Scanner(System.in);
        System.out.print("Enter the width: ");
         area = length.nextInt() * width.nextInt();
         perimeter = length.nextInt() * 2 + width.nextInt() * 2;
        System.out.println("Class area = " + area  );
        System.out.println("class Perimeter = " + perimeter);






//        public static void main(String[] args) {
//        String userInput;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter something: ");
//        userInput = sc.nextLine();
//        System.out.println("You entered: --> \"" + userInput + "\" <--");
//    }


    }
}

