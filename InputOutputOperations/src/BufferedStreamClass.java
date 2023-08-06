import java.io.*;

public class BufferedStreamClass {
    public static void main(String[] args) {
        try {
            FileInputStream fileInput = new FileInputStream("patika.txt");
            BufferedInputStream bufferedInput = new BufferedInputStream(fileInput);

            int i = bufferedInput.read();
            while (i != -1){
                System.out.print((char) i);
                i = bufferedInput.read();
            }
            fileInput.close();
            bufferedInput.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        String data = "Java 102 Patikasý";
        try {
            FileOutputStream fileOutput = new FileOutputStream("patika.txt", true);
            BufferedOutputStream bufferOutput = new BufferedOutputStream(fileOutput);

            byte[] byteArray = data.getBytes();
            bufferOutput.write(byteArray);

            bufferOutput.close();
            fileOutput.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
