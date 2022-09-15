public class ProductManager {

    // constructor

    // good usage
    public void Add(Product product) {
        System.out.println(product.getName() + " is added.");
    }

    // bad usage
    public void Add2(int id, String name, String description, double price, int stockAmount) {
        System.out.println(name + " is added.");
    }
}
