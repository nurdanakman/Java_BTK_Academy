public class Main {

    public static void main(String[] args) {
	//prime number or not?
        int number = 1;
        int counter = 0;

        if(number<1){
            System.out.println("Please enter a positive integer number greater than 1.");
        }
        else if (number==1){
            System.out.println(number +" is not a prime number.");
        }
        else{
        for (int i=2; i <number; i++) {
            if(number%i== 0) {
                counter += 1;
                break;
            }
        }
        if(counter != 0) {
            System.out.println(number + " is not a prime number.");
        }
        else{
            System.out.println(number + " is a prime number.");
        }
    }}
}
