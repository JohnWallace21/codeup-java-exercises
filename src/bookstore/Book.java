package bookstore;
//Create a Book class that inherits from product and ads an author property
public class Book extends Product{
    Author author;
    public Book(String title, double price, Author author) {
        super(title, price);
        this.author = author;
        }

    public String toString() { // override
        return title;
    }



//       - Book class’s author property should hold an Author typed object
}

