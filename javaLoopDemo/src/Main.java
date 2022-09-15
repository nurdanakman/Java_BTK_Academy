public class Main {

    public static void main(String[] args) {
        // for : write odd number between 1-10
        for (int i = 1; i <= 10; i = i + 2) {
            System.out.println(i);
        }
        System.out.println("For Loop finished.");

        //while write odd number between 1-10:
        int i = 1;
        while (i<10) {
            System.out.println(i);
            i+=2;
        }
        System.out.println("While Loop finished.");

        //Do-while write odd number between 1-10:
        int j = 1;
        do{
            System.out.println(j);
            j+=2;
        } while (j<10);
        System.out.println("While Loop finished.");
    }
}
