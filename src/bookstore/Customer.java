package bookstore;

public class Customer extends Person {
    String customer;
    public Customer(String name) {
        super(name);
        this.customer = customer;
    }
    public String toString() { // override
        return name;
    }
    public static Customer[] customers = CustomerArray.findAll();

    public static void showCustomers(){
        for(int i = 0; i < customers.length; i++){
            System.out.println(customers[i]);
        }
    }


}
