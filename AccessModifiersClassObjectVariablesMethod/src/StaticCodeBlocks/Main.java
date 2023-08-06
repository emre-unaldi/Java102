package StaticCodeBlocks;

public class Main {
    public static void main(String[] args) {
        User u = new User("Emre");
        System.out.println(u.name);

        System.out.println(User.counter);
    }
}
