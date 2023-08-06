import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamClass {
    public static void main(String[] args) {
        try {
            PrintStream output = new PrintStream("print.txt");
            output.println(123123);
            output.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
