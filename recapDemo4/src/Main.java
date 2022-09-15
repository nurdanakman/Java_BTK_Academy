public class Main {

    public static void main(String[] args) {
        // silent - bass towel - high towel
        char letter = 'A';

        if (letter == 'A' || letter == 'a' || letter == 'O' || letter == 'o' || letter == 'I' || letter == 'ı' || letter == 'U' || letter == 'u') {
            System.out.println(letter + " is a bass vowel.");
        } else if (letter == 'E' || letter == 'e' || letter == 'Ö' || letter == 'ö' || letter == 'İ' || letter == 'i' || letter == 'Ü' || letter == 'Ü') {
            System.out.println(letter + " is a high vowel.");
        } else {
            System.out.println(letter + " is a silent letter.");
        }
    }
}
