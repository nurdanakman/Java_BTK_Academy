public class Main {

    public static void main(String[] args) {
        BaseLogger[] loggers = {new FileLogger(), new DatabaseLogger(), new EmailLogger()};
        for (BaseLogger logger : loggers) {
            logger.log("trial");
        }

        System.out.println("-------------------------");
        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.Add();
    }
}
