public class Main {

    public static void main(String[] args) {
        // method2
        String message = "Today weather is very good.";
        System.out.println(message);

        message.substring(0, 2);  // bu substring sana String döndürüyor. Bu nedenle direkt void gibi hemen işi yapmıyor. Return olduğu için senin bunu bir değişkene ataman lazım.
        String message2 = message.substring(0, 2);
        System.out.println(message2);

        String message3 = update();
        System.out.println(message3);

        int message4 = sum(4,5);
        System.out.println(message4);

        int message5 = sum1(4,5,6,10,25,9);
        System.out.println(message5);
    }

    public static void add() {
        //emir kipi gibi düşün. Sadece git yap.
        System.out.println("Data added.");
    }
    public static String update() {
        //burada aslında String returnü olan bir func. var. Gidip bu değeri bir Stringe variable a tanıtıp yazdırısın vs vs..
        return "System is updated.";
    }
    public static int sum(int number1, int number2) {
        //burada aslındaint returnü olan bir func. var. Gidip bu değeri bir integer variable a tanıtıp yazdırısın vs vs..
        return number1 + number2;
    }
    public static int sum1(int... numbers) {
        // gidip istediğin sayıda parametre (arguman) ekleyebilirsin. Arka planda aldığı tüm inegerları gidip bir array'e çevirir.
        int sum=0;
        for(int number:numbers){
            sum += number;
        }
        return sum;
    }

}
