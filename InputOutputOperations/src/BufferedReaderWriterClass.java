import java.io.*;
import java.nio.charset.Charset;

public class BufferedReaderWriterClass {
    public static void main(String[] args) {
        try {
            FileReader readFile = new FileReader("patika.txt");
            BufferedReader bufferedReader = new BufferedReader(readFile);

            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }

            /*String line;
            // readLine ile satýr satýr okuruz.
            while ((line = bufferedReader.readLine()) != null) {
                System.out.print(line + "#####");
            }*/
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        String data = "JAVAÖÐRENÝYORUM";

        try {
            File file = new File("output.txt");
            FileWriter fileWriter = new FileWriter(file, Charset.forName("UTF8"));
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(data);

            bufferedWriter.close();
            fileWriter.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
