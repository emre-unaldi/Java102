import java.io.FileInputStream;
public class FileInputStreamClass {
    public static void main(String[] args) {
        try {
            FileInputStream input = new FileInputStream("patika.txt");
            // input.skip(10); // -> 10 byte atlar okumaz
            System.out.println("Kullanılabilir Byte Sayısı : " + input.available());
            // input.read(); // -> 1 byte okur

            int i = input.read();
            while (i != -1){ // byte byte okur. (iterasyon şeklinde)
                System.out.print((char) i);
                i = input.read();
            }

            input.close(); // Hafızada yer kaplamaması için kapat
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
