import java.util.Random;
public class ServerNameGenerator {
    public static  String[] adjectives = {"AGGRESSIVE", "agreeable", "ambitious"," brave"," delightful"," eager","faithful","ambitious","amphibious","calm"};
    public static String[] nouns = {"Dog", "Parrot", "Raccoon", "Cat", "Desk", "Lamp", "Duck", "Car","Truck", "Cup"};

    public static String getRandomString(String[] user) {
    Random rand = new Random();
        int randomIndex = rand.nextInt(user.length);
        return user[randomIndex];
    }



    public static void main(String[] args) {
        System.out.println("Here is your server name:");
        System.out.println(getRandomString(adjectives) + "-" + getRandomString(nouns));
    }
}
