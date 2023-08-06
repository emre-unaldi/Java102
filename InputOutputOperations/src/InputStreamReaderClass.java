import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class InputStreamReaderClass {
    public static void main(String[] args) {
        try {
            FileInputStream inputFile = new FileInputStream("patika.txt");
            InputStreamReader inputReader = new InputStreamReader(inputFile, Charset.forName("UTF8"));
            System.out.println(inputReader.getEncoding());

            int i = inputReader.read();
            while (i != -1){
                System.out.print((char) i);
                i = inputReader.read();
            }
            inputFile.close();
            inputReader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
