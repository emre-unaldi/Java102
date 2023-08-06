import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
public class FileReaderWriterClasses {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("patika.txt");

            int i = reader.read();
            while (i != -1) {
                System.out.print((char) i);
                i = reader.read();
            }

            reader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        String data = "JAVA ÖÐRENÝYORUM!";
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write(data);
            writer.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
