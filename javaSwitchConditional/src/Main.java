public class Main {

    public static void main(String[] args) {
        // grade and note
        char grade = 'C';

        switch (grade) {
            case 'A':
                System.out.println("Your grade is " + grade);
                break;
            case 'B':
            case 'C':
                System.out.println("Your grade is " + grade);
                break;
            case 'D':
                System.out.println("Your grade is " + grade);
                break;
            case 'F':
                System.out.println("Your grade is " + grade);
                break;
            default:
                System.out.println("Please control grade.");
                break;
        }
    }
}
