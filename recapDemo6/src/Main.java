public class Main {

    public static void main(String[] args) {
        // friend numbers -- 220 - 284
        int number1 = 220;
        int number2 = 284;
        int sum1 = 0;
        int sum2 = 0;

        if (number1 < 1 || number2 < 1) {
            System.out.println("Please enter a number that greater than 0.");
        } else {
            for (int i = 1; i < number1; i++) {
                if (number1 % i == 0) {
                    sum1 += i;
                }
            }
            for (int j = 1; j < number2; j++) {
                if (number2 % j == 0) {
                    sum2 += j;
                }
            }
            if (sum1 == number2 && sum2 == number1) {
                System.out.println(number1 + " and " + number2 + " are friend numbers ");
            } else {
                System.out.println(number1 + " and " + number2 + " are not friend numbers ");
            }
        }
    }
}
