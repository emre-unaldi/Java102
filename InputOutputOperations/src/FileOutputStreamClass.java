import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamClass {
    public static void main(String[] args) {
        String text = "OutputStream öğreniyorum. \n Patika.dev\n";
        try {
            FileOutputStream output = new FileOutputStream("patika.txt",true);
            // text.getBytes(); // -> String ifadeyi byte şelinde bir diziye çeviriyor.
            byte[] textConvertByte = text.getBytes();
            output.write(textConvertByte); // dosyaya byte byte yazar
            output.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
