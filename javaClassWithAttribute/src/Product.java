public class Product {
    //attribute | field
    //public
    /*int id;
    String name;
    String description;
    double price;
    int stockAmount;*/

    //constructors
    public Product() {

    }

    public Product(int id, String name, String description, double price, int stockAmount) {
        this._id = id;
        this._name = name;
        this._description = description;
        this._price = price;
        this._stockAmount = stockAmount;
    }

    //private
    private int _id;
    private String _name;
    private String _description;
    private double _price;
    private int _stockAmount;
    private String _code;

    //getter
    public int getId() {
        return _id;
    }

    //setter
    public void setId(int id) {
        _id = id;
        //this.id = _id;  //de yazılabilir.
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String description) {
        _description = description;
    }

    public double getPrice() {
        return _price;
    }

    public void setPrice(double price) {
        _price = price;
    }

    public int getStockAmount() {
        return _stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        _stockAmount = stockAmount;
    }

    public String getCode() {
        String s = this._name.substring(0, 1) + this._id;
        return s;
    }

}
