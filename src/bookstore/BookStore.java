package bookstore;
import java.lang.reflect.Array;
import java.util.Random;

public class BookStore {
    public static void main(String[] args) {
        Author author1 = new Author("J.K. Rowling");
        Author author2 = new Author("Thomas Meyer");
        Author author3 = new Author("Dr.Seuss");

      Customer.showCustomers();

        Book[] books = {
                new Book("Harry Potter", 9.99, author1),
                new Book("Con-Cats Nation: A Story of Redemption", 4.99, author2),
                new Book("Cat in the Hat", 5.99, author3),
                new Book("Green Eggs and Ham", 3.99, author3),
                new Book("Harry Potter and the Chamber of Secrets", 8.99, author1)


};
       showBooks(books);
        getRandombook(books);

    }
        public static void showBooks(Book[] books){
            for(int i = 0; i < books.length; i++){
                System.out.println(books[i]);
            }
        }



    public static void getRandombook(Book[] books) {
        Random rand = new Random();
        int randomIndex = rand.nextInt(books.length);
        System.out.println( books[randomIndex]);
    }
    public String bookInf() { // override
        return ;
    }

}
