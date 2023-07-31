package GenericBoundedTypes;

public class Main {
    public static void main(String[] args) {
        // Integer, Ddouble, Float extends Number

        Integer i = null;
        Nullable<Integer> nullable = new Nullable<>(i);
        nullable.run();
    }
}
