import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String message = "Today weather is pretty good.";

        System.out.println(message);
        System.out.println("Length of String : " + message.length());
        System.out.println("5. Eleman of String : " + message.charAt(4));
        //concatte baştaki string değişkenine bir şey olmaz, concat edilen hali ile yeni string oluşturulur memoryde. Eğer sonradan kullancaksan gidip onu variable a eklemelisin.
        System.out.println("Concat two String : " + message.concat(" :)"));
        System.out.println("What char is first in String? : " + message.startsWith("t"));
        System.out.println("What char is first in String? : " + message.startsWith("T"));
        System.out.println("What char is end in String? : " + message.endsWith("."));

        char[] charArray = new char[5];
        message.getChars(0, 5, charArray, 0);
        System.out.println(charArray);

        System.out.println(message.indexOf("."));
        System.out.println(message.lastIndexOf("o"));

        System.out.println(message.replace(" ", "-"));
        System.out.println(message.substring(5));
        System.out.println(message.substring(5, 9));

        for (String word : message.split(" ")) {
            System.out.println(word);
        }
        //database arama işlemi gönderdiğinde kullanabilirsin. Database de case sensitive var. O süreçte kontrol için iyi olur.
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());

        //String baş ve sonundaki white spaceleri tamamen yok ediyor.
        String message1 = "  Message 1: Today weather is pretty good.  ";
        System.out.println(message1.trim());
    }
}
