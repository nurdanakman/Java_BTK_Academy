public class CustomerManager{
    //user maybe forget this variable for this reason we can add some constructor for this variable initialized.
    private ICustomerDal customerDal;

    //constructor with customerDal parameter.
    public CustomerManager( ICustomerDal _customerDal){
        this.customerDal = _customerDal;
    }
    public void add(){
        customerDal.add();
    }
}
