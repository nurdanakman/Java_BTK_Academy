public class StudentsLoanManager extends BasedLoanManager {
    //overriding
    public double calculation(double amount) {
        return amount * 1.10;
    }
}
