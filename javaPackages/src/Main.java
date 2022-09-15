//build-in
//import mathematics.FourOperations;
//import mathematics.Logarithms;
import mathematics.*;

import java.util.Scanner;  //kullanıcıdan bilgi alır.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı giriniz:");

        int sayi = scanner.nextInt(); //read input.
        System.out.println("Sayı:" + sayi);

        FourOperations fourOperations = new FourOperations();
        int fourOperationExam =  fourOperations.addition(sayi,sayi);
        System.out.println(fourOperationExam);

        Logarithms logarithms = new Logarithms();
        double logarithmExam = logarithms.logarithm(sayi);
        System.out.println(logarithmExam);
    }
}
