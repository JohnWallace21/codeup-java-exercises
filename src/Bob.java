import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner talk = new Scanner(System.in);
        System.out.print("Say something to bob:");
       String bobTalk = talk.next();
       if (bobTalk.endsWith("?") ){
           System.out.println("Sure");
       }else if (bobTalk.equals(bobTalk.toUpperCase())){
           System.out.println("Whoa, chill out!");
       }else if(bobTalk.trim().equals("")){
           System.out.println("Fine. Be that way!");
       }else System.out.println("Whatever");

    }
}
