public class Main {

    public static void main(String[] args) {
        // calculation
        int number1 = 25;
        int number2 = 10;

        Calculation calculation1 = new Calculation();

        System.out.println(calculation1.sum(number1, number2));
        System.out.println(calculation1.subtract(number1, number2));
        System.out.println(calculation1.division(number1, number2));
        System.out.println(calculation1.multiplication(number1, number2));
    }
}
