public class TypeConversion {
    public static void main(String[] args) {
        // Widening Casting
        int a = 10;
        double b = a;
        System.out.println(b);

        // Narrowing Casting
        double pi = 3.14;
        int c = (int) pi;
        System.out.println(c);

        byte d = 80;
        System.out.println((char) d);

        // Integer -> String Dönüþümü
        int e = 38;
        System.out.println("Integer : " + e);

        String str = String.valueOf(e);
        System.out.println(str);

        int t = Integer.parseInt(str);
        System.out.println(t);
    }
}
