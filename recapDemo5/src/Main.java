public class Main {

    public static void main(String[] args) {
        // perfect number
        int number = 28;
        int sum = 0;

        if (number <= 1) {
            System.out.println("Please enter a positive integer number greater than 1.");
        } else {
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }
            if (sum == number) {
                System.out.println(number + " is a perfect number.");
            } else {
                System.out.println(number + " is not a perfect number.");
            }
        }
    }
}
