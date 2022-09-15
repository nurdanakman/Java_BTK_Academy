public class ProductManager {
    public void add(Product product) {
        //not static method
        /*ProductValidator validator = new ProductValidator();
        if (validator.isValid(product)) {*/

        //static method
        if (ProductValidator.isValid(product)) {
            System.out.println("You add an product.");
        }
        else
            System.out.println("You cannot add an product.");
    }
}