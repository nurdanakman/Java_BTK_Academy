public class Main {

    public static void main(String[] args) {
        // Classes
        //reference type
        CustomerManager customerManager= new CustomerManager();
        CustomerManager customerManager2= new CustomerManager();
        customerManager = customerManager2;
        customerManager.add();


        //value type
        int number1=10;
        int number2=20;
        number2=number1;
        number1 =30;
        //number2 en son eşitlendiğinde 10 olarak kaldığı için şimdi 10 olarak print olur.
        System.out.println(number2);
    }
}
