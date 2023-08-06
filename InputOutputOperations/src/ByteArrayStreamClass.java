import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayStreamClass {
    public static void main(String[] args) throws IOException {
        byte[] dizi = {1,2,3,54,66};
        // ByteArrayInputStream input = new ByteArrayInputStream(dizi);
        ByteArrayInputStream input = new ByteArrayInputStream(dizi,0,4);
        System.out.println("Kullanılabilen byte sayısı : " + input.available());

        //input.skip(2);

        int i = input.read();
        while (i != -1){
            System.out.println(i);
            i = input.read();
        }
        try {
            input.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String data = "Java 102 Dersleri";
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        byte[] dataByteArray = data.getBytes();

        try {
            output.write(dataByteArray);
            String newData = output.toString();
            System.out.println("Çıkış akışı : " + newData);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
