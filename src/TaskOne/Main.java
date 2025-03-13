package TaskOne;

import java.util.ArrayList;

// 1.e
public class Main {

    static ArrayList<Customer> customers = new ArrayList<>();

    public static void main(String[] args) {

        // Add customers to list
        customers.add(new Customer("John", "Doe", "He-Man"));
        customers.add(new Customer("Jane", "Doe", "G.I.Jane"));
        customers.add(new Customer("Laurence", "Tureaud", "Mr. T"));

        // 1.f
        printCustomers(customers);
    }

    // 1.f
    static void printCustomers(ArrayList<Customer> customers){
        for (Customer c : customers){
            System.out.println(c);
        }
    }

}
