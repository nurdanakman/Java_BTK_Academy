public class Main {

    public static void main(String[] args) {

        // bu compile hatasıdır. Yazılımcının yazarken aldığı programming errors.
        /*String city = "Eskişehir";
        int number = "İstanbul";*/

        // try catch = uygulama çalışırken alınan hatalar. Program build olur, bir byte code oluşur. Sonra bazı değerler alırken oluşan hatalarda kullanılır.
        try {
            int[] numbers = new int[]{1, 2, 3};
            System.out.println(numbers[5]); //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
            //} catch (Exception e) {  //outputtaki "ArrayIndexOutOfBoundsException" hata mesajı buraya aktarılır. Bu mesaj geldiğinde catch içindeki eylem gerçekleştirilir. Program kırılmaz.
        } catch (ArrayIndexOutOfBoundsException e) { //yine çalışırdı
            System.out.println(e);
        } catch (StringIndexOutOfBoundsException e) { //şuanki problemimiz bu olmasa da biz gidip bu hata için de ayrı bir catch yazabiliriz.
            System.out.println(e);
        } catch (Exception e){ // tüm sınıfların base classı extend edileni bu olduğu için bunu yazabilirsin. En son hatayı sen anla diye. Genel bir mesaj olduğu için bunu en sona koyarsın.
            System.out.println("log messagese" + e);
        }
        finally {  //son çalışacak blok. ister try çalışsın ister catch çalışsın, en sonda her türlü çalışır.
            System.out.println("Software runned."); //database bağlantısı açtın, datayı aldın veya almadın sonra her türlü bağlantını kapatman lazım. Bu işlemlerde kullanılır. Veya bir doyayı açtın hata geldi veya gelmedi. Yine de en en sonunda dosyayı kapatman lazım.
        }
    }
}