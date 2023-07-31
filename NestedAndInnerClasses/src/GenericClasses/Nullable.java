package GenericClasses;

public class Nullable {
    private final String value;

    public Nullable(String value) {
        this.value = value;
    }

    public String getValue() {
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
