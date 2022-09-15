import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String, String> dictionary = new HashMap<String, String>();  //burada key ve value int, String, double, other objects vs olabilir.
        dictionary.put("book","kitap");  // yeni index ekledik
        dictionary.put("table","masa");
        dictionary.put("lamp","lamba");

        System.out.println(dictionary); //tüm hashmap i bir set türünde yazdırır. Set türünde tüm elemalar keylerin alfabetik sırasına göre gösterilir. Kendi içinde bir sıralama yapar.
        System.out.println("-------------------------");

        System.out.println(dictionary.get( "book"));  //spesifik key ile value u çağırma
        System.out.println("-------------------------");

        dictionary.remove("table");  // bir elemanı key ile silmek
        System.out.println(dictionary.get( "table"));  //silinen key ve value u çağırdığında, table karşılığı olmadığı için null döner.
        System.out.println("-------------------------");

        for(String item: dictionary.keySet()){
            System.out.println("Key:" + item + " Value:"+ dictionary.get(item));
        }
        System.out.println("-------------------------");

        dictionary.clear();
        System.out.println(dictionary.size()); //sözlük index sayısını gösterir.
        System.out.println("-------------------------");
    }
}
