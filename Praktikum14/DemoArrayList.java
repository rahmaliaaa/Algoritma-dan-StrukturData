package Praktikum14;
import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        ArrayList<Customer> newCustomers = new ArrayList<>();
        newCustomers.add(new Customer(201, "Della"));
        newCustomers.add(new Customer(202, "Victor"));
        newCustomers.add(new Customer(203, "Sarah"));
        customers.addAll(newCustomers);
        System.out.println(customers); //proses debugging
        
        for (Customer cust : customers){
            System.out.println(cust.toString());
        }
    }
}
