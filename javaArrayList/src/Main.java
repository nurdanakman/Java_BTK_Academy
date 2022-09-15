import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        //Array
        int[] numbers = new int[]{1, 2, 3};
        // numbers [3]=4;  //ArrayIndexOutOfBoundsException hatası alırsın çünkü array 3 elemanlı.
        numbers = new int[4]; //4 elemanlı bir array oluşturdun.
        System.out.println(numbers[0] + "//" + numbers[1] + "//" + numbers[2] + "//" + numbers[3]); //yeni array yeni baştan oluştu. Çünkü new Heap te yeni referans oluşturdu. Initialize da etmemiş olduk. ondan 0 tüm indexler.

        System.out.println("------------------------------------");

        //Koleksiyonlar:
        /*arkada bir array yönetir. Sen 3 elemanlı arrayer 4. eleman eklediğin zaman, arkada bir arraye ilk 3 elemanı yedekleyip getiriyor. Sen üzerine 4. elemanı giriyorsun.
        koleksiyonlar diizlerin gelişmiş versiyonu aslında.*/

        //Array list - not type secure:
        ArrayList numbersArrayList = new ArrayList(); //en başta array list member sayısı giirlmez. // bu şekilde array liste istediğin her türlü objeyi girebilirsin.
        numbersArrayList.add(10);
        numbersArrayList.add(11);
        numbersArrayList.add("İst");
        System.out.println(numbersArrayList.size()); //array list memeber sayısı
        numbersArrayList.set(0, 100); //bir indexi değiştirir
        System.out.println(numbersArrayList.get(0)); // istediğin indexi görürsün
        numbersArrayList.remove(2); //2.indexi siler. değerini değil direlt indexi siler.
        numbersArrayList.clear(); //tüm indexleri komple siler.

        for (Object i : numbersArrayList) {  //içinde sadece int objeler olmadığı için Object i ile dönebilirsin.
            System.out.println(i);
        }

        System.out.println("------------------------------------");

        //ArrayList - Type Secure:
        /*Array listi generic hale getirmiş olacağız.*/
        ArrayList<String> cities = new ArrayList<String>();  //öncekine göre ekstra type girmiş olduk. type belirlenmiş oldu.
        cities.add("Adana");
        cities.add("Sakarya");
        cities.add("İzmir");

        cities.remove("Adana");
        cities.add("Ankara");

        System.out.println("unsorted array list:");
        for (Object i : cities) {
            System.out.println(i);
        }

        System.out.println("\nsorted array list:");
        Collections.sort(cities);
        for (Object i : cities) {
            System.out.println(i);
        }

        System.out.println("------------------------------------");
    }
}
