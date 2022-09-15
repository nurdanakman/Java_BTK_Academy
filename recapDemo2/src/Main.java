public class Main {

    public static void main(String[] args) {
        //double[] myList = new double[4];
        double[] myList = {1.2, 1.3, 4.3, 5.6};
        double sum = 0;
        double biggest = myList[0];

        for (double number : myList) {
            System.out.println(number);
            sum = sum + number;
            if (number > biggest) {
                biggest = number;
            }
        }
        System.out.println("Sum: " + sum);
        System.out.println("Biggest Number: " + biggest);
    }
}