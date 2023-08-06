package FinalKeywordConstantDefinition;

public class Circle {
    public int r;
    public final double PI = 3.14; // Sabit
    public Circle(int r){
        this.r = r;
    }

    public void calcualteArea(){
        double area = PI * this.r * this.r;
        System.out.println("Dairenin Alanı : " + area);
    }
}
