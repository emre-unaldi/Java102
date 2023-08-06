import java.io.File;
import java.io.IOException;
public class FileClass {
    public static void main(String[] args) {
        File file = new File("patika.txt");
        try {
            if (file.createNewFile()){
                System.out.println(file.getName() + " dosyası oluşturuldu");
            } else {
                System.out.println(file.getName() + " dosyası oluşturulamadı");
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        try {
            if (file.delete()){
                System.out.println(file.getName() + " dosyası silindi");
            } else {
                System.out.println(file.getName() + " dosyası silinemedi");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        File newDirectory = new File("test");
        try {
            if (newDirectory.mkdir()){
                System.out.println(newDirectory.getName() + " dizini oluşturuldu");
            } else {
                System.out.println(newDirectory.getName() + " dizini oluşturulamadı");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        File newDirectory2 = new File("patika/dev");
        try {
            if (newDirectory2.mkdirs()){
                System.out.println(newDirectory2.getName() + " dizini oluşturuldu");
            } else {
                System.out.println(newDirectory2.getName() + " dizini oluşturulamadı");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        /*
            Oluşturulacak dizini "patika/dev" şeklinde verirsek herzaman dosya yolunun
            sonundaki oluşturur. Fakat eğer patika adında dizin yoksa hata verir.
            Eğer iç içe dizinler oluşturmak istersek mkdir() yerine mkdirs() kullanılır.
            Bu sayede olmayan üst dizinler de oluşur.
        */

        File listDirectory = new File("test");
        String[] list = listDirectory.list();

        for (String str : list){
            System.out.println(str);
        }
    }
}
