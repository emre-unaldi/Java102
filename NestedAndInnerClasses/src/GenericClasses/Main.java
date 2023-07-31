package GenericClasses;

public class Main {
    public static void main(String[] args) {
/*        String s1; // undefined -> Hafızada s1 değişkeni var ama karşılığı yok.
        String s2 = null; // null -> Hafızada bir değer alanı karşılığı var fakat o alan boş
        String s3 = ""; // empty -> Hafıazaa alanı var alanın içinde değerde var fakat o değerin içi boş*/

        String str = "adfsfa";
        Nullable nullable = new Nullable(str);
        nullable.run();
        // Bu Nullable sınıfı sadece String tipteki değerleri kontrol eder. Integer, Double vs kontrol etmez.
        // Diğer tüm tiplerdeki değişkenleri de kontrol edebilmek için bu sınıfı Generic olarak oluştururuz.
        // Generic olunca tip ayrımı yapmadan tim değişken tiplerini kabul eder.

        Integer a = 12;
        String b = "asdad";

        GenericNullable<Integer> integerGenericNullable = new GenericNullable<Integer>(a);
        integerGenericNullable.run();

        GenericNullable<String> stringGenericNullable = new GenericNullable<>(b);
        stringGenericNullable.run();

        Integer e = 38;
        String d = "Emre";
        Double f = 3.14;

        GenericAll<String, Integer, Double> genericAll = new GenericAll<>(d,e,f);
        genericAll.showInfo();
    }
}
