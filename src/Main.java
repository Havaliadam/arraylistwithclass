import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Customer>customers=new ArrayList<Customer>();
        Customer ayhan=new Customer(1,"ayhan","celik");
        customers.add(ayhan);
        customers.add(new Customer(2,"derin","demir"));
        customers.add(new Customer(3,"salih","al"));
        customers.remove(ayhan);
        for (Customer customer:customers){
            System.out.println(customer.firstname);
        }
    }
}
