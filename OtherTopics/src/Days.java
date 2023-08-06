public class Days {
    public static final Days PAZARTESI = new Days(1);
    public static final Days SALI = new Days(2);
    public static final Days CARSAMBA = new Days(3);
    public static final Days PERSEMBE = new Days(4);
    public static final Days CUMA = new Days(5);
    public static final Days CUMARTESI = new Days(6);
    public static final Days PAZAR = new Days(7);
    private int day;

    private Days(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
