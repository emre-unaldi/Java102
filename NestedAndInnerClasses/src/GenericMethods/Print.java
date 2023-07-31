package GenericMethods;

public class Print {
    public static <G> void printArray(G[] array){
        for (G i : array) {
            System.out.println(i);
        }
    }
}
