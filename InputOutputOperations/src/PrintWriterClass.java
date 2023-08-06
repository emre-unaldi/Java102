import java.io.PrintWriter;

public class PrintWriterClass {
    public static void main(String[] args) {
        String data = "Java 102";

        try {
            PrintWriter writer = new PrintWriter("output.txt");
            writer.print(data);
            writer.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
