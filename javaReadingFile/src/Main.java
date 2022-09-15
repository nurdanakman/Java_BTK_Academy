import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        BufferedReader reader = null;
        int total = 0;
        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\Z004DTEW\\Desktop\\javademos\\javaReadingFile\\src\\Numbers.txt"));
            String line = null;
            while ((line = reader.readLine()) != null) {
                total += Integer.valueOf(line);
            }
            System.out.println(total);
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException catch");
        } catch (IOException e) {
            System.out.println("IOException catch");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException catch");
        }  catch (Exception e) {
            System.out.println("Exception catch");
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                System.out.println("IOException try");
            }
        }
    }
}
