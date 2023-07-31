package GenericInterface;

public class Main {
    public static void main(String[] args) {
        Student<String> st = new Student<>();
        st.insert("ABC");
        // Veri tipini belirlemek istemediğimiz veya bilmediğimiz durumlarda generic yapılar kullanılır
    }
}
