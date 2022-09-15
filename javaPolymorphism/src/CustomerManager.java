public class CustomerManager {
    private BaseLogger logger;

    public CustomerManager(BaseLogger logger){
        this.logger = logger;
    }
    public void Add() {
        System.out.println("Customer is added.");
        logger.log("Customer is added log.");
    }
}
