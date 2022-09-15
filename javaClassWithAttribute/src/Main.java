public class Main {

    public static void main(String[] args) {


        //Without constructors:
        Product product1 = new Product();

        //With constructors:
        Product product2 = new Product(2, "Computer", "Monster", 15.500, 23);

        //variables public olduğunda direkt gidip erişebilirsin aslında.
        /* product1.id = 1;
        product1.name = "Computer";
        product1.description = "HP";
        product1.price = 10.555;
        product1.stockAmount = 50;*/

        //variables private olduğunda getter ve setter kullanman lazım.
        product1.setId(1);
        product1.getId();  // readonly okuyabildi.
        product1.setName("Computer");
        product1.getName();
        product1.setDescription("HP");
        product1.getDescription();
        product1.setPrice(10.555);
        product1.getPrice();
        product1.setStockAmount(50);
        product1.getStockAmount();

        System.out.println(product1.getCode());
        System.out.println(product2.getCode());

        ProductManager productManager = new ProductManager();
        productManager.Add(product1);

        //bade usage
        /*productManager.Add2(2, "Phone", "Samsung", 20.000, 25);
        productManager.Add2(2, "Phone", "Samsung", 20.000, 25);
        productManager.Add2(2, "Phone", "Samsung", 20.000, 25);
        productManager.Add2(2, "Phone", "Samsung", 20.000, 25);*/
    }
}
