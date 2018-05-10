import java.util.Scanner;
import java.util.Random;
public class HighLow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int tries;
        int correctNum = rand.nextInt(100);
        while (true) {
            System.out.println("enter a number 0-99"); // Changed from 1-100 because rand.nextInt(100)
            // returns a number between 0 and 99
            // You can do correctNum += 1 to make it between 1 and 100
            // But put this in before the while loop starts
            int guess1 = input.nextInt();

            if(guess1 < correctNum){
                System.out.println("number is too low!");
            }
            else if(guess1 > correctNum){
                System.out.println("Number is too high!");
            }
            else if(guess1 == correctNum){
                System.out.println("correct!");
                break; // <---- Add this, this will make the loop stop when the
                //player gets the answer correct and therefore the program will end
            }
            else{
                System.out.println("not a valid option");
            }
        }

    }

}




