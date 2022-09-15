public class Main {

    public static void main(String[] args) {
        // find a bigger number
        int number1 = 29;
        int number2 = 25;
        int number3 = 26;

        //solution 1
        int maxNumber;
        if (number1 > number2 && number1 > number3) {
            maxNumber = number1;
        } else if (number2 > number3 && number2 > number1) {
            maxNumber = number2;
        } else {
            maxNumber = number3;
        }
        System.out.println("Max number: " + maxNumber);

    //solution 2
        int maxNumber1 = number1;
        if (maxNumber1 < number2){
            maxNumber1 = number2;
        }
        if (maxNumber1 < number3) {
            maxNumber1 = number3;
        }
        System.out.println("Max number: " + maxNumber1);

    }
}
