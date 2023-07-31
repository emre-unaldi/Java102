package NestedInnerClasses;

public class Main {
    public static void main(String[] args) {
//        NestedInnerClasses.Outer outer = new NestedInnerClasses.Outer();
//        outer.run();

//         NestedInnerClasses.Outer.Inner inner = outer.new Inner();
//         inner.run();

//         NestedInnerClasses.Outer.Inner.run();  // static erişim

//        NestedInnerClasses.Local local = new NestedInnerClasses.Local();
//        local.run();

        Anonim anonim = new Anonim(){ // NestedInnerClasses.Anonim sınıf
            @Override
            public void run(){
                System.out.println("NestedInnerClasses.Anonim olarak yazılmış method");
            }
        };

        anonim.run();
    }
}
