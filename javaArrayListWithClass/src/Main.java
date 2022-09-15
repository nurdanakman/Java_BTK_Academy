import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();

        Customer nurdan1 = new Customer(1,"Nurdan1","Akman");
        customers.add(nurdan1);
        customers.add(new Customer(2,"Nurdan2","Akman"));
        customers.add(new Customer(3,"Nurdan3","Akman"));

        customers.remove(new Customer(1,"Nurdan2","Akman")); // bu hiç bir indexi silmez. Çünkü her new dediğinde yeni bir referans number oluşturulur.
        customers.remove(nurdan1); //bunda index 0 silinir.
        for (Customer i : customers){
            System.out.println(i.firstName);
        }
    }
}
