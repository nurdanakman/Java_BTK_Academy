public class Main {

    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product product1 = new Product();
        product1.price = 10;
        product1.name = "headphone";
        productManager.add(product1);


        //inner class
        DatabaseHelper.Crud.delete();
        DatabaseHelper.Connection.createConnection();
    }
}

