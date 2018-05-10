public class Person {


    private String name;
    private String hairColor;
    private String eyeColor;

    // returns the Person's name
    public String getName(){
        return name;

    };
    // changes the name property to the passed value
    public void setName(String name){
        this.name = name;

    };
    // prints a message to the console using the Person's name
    public void sayHello(){
        System.out.println("Hey " + name + " you have " + eyeColor + " eyes and "  + hairColor + " hair. Very unique." );

    };


    public Person(String name, String hairColor, String eyeColor){
        this.name = name;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
    }

    public static void main(String[] args) {
        Person person = new Person("Dude","Grey", "Blue");
        Person person1 = new Person("John", "blue","orange");
        Person person2 = person1;

        person.getName();
        person.setName("Dude");
        person.sayHello();
        System.out.println(person.name);
        System.out.println(person.eyeColor);

    }
}






