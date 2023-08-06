import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class OutputStreamWriterClass {
    public static void main(String[] args) {
        String data = "амон";

        try {
            FileOutputStream fileOutput = new FileOutputStream("output.txt");
            OutputStreamWriter fileWriter = new OutputStreamWriter(fileOutput, Charset.forName("UTF8"));
            System.out.println(fileWriter.getEncoding());

            fileWriter.write(data);

            fileWriter.close();
            fileOutput.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
