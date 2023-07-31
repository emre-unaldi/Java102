package NestedInnerClasses;

public class Local {
    public void run(){
        // NestedInnerClasses.Local Sınıf
        class Yerel{
            private int a;

            public Yerel(int a) {
                this.a = a;
            }

            public int getA() {
                return a;
            }

            public void setA(int a) {
                this.a = a;
            }
        }

        Yerel yerel = new Yerel(20);
        System.out.println("NestedInnerClasses.Local sınıfı çalıştı");
        System.out.println(yerel.getA());
    }
}
