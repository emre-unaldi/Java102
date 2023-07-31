package GenericBoundedTypes;

public class Nullable <Generic extends Number> {
    private final Generic value;

    public Nullable(Generic value) {
        this.value = value;
    }

    public Generic getValue() {
        return value;
    }

    public boolean isNull() {
        return this.getValue() == null;
    }

    public void run() {
        if (isNull()) {
            System.out.println("Bu değişkene değer atanmamıştır (null)");
        } else {
            System.out.println(this.getValue());
        }
    }
}
