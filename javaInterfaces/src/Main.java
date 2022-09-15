public class Main {

    public static void main(String[] args) {
        ICustomerDal iCustomerDal = new OracleCustomerDal();
        iCustomerDal.add();

        System.out.println("----------------------------");

        /*CustomerManager customerManager = new CustomerManager();
        customerManager.customerDal = new MySqlCustomerDal();
        customerManager.add();*/

        System.out.println("----------------------------");
        CustomerManager customerManager=new CustomerManager(new MySqlCustomerDal());
        customerManager.add();


    }
}
