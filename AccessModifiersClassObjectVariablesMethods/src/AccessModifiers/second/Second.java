package AccessModifiers.second;

import AccessModifiers.first.First;

public class Second {
    public static void main(String[] args) {
        First b = new First("Hello Second");
        b.showStr();
    }
}
