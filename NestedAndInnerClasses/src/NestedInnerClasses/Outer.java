package NestedInnerClasses;

// NestedInnerClasses.Outer(Nested) Class
public class Outer {
    public int a = 5;
    // Inner Class
    public static class Inner {
        public int a = 10;

        public static void run() {
            int a = 1;
            System.out.println("Inner sınıfına ait run metodu çalıştı");
            System.out.println(a);
            // System.out.println(this.a);
            // System.out.println(NestedInnerClasses.Outer.this.a);
        }
    }

    public void run(){
        System.out.println("NestedInnerClasses.Outer sınıfına ait run metodu çalıştı");
        Inner inner = new Inner();
        inner.run();
    }
}
