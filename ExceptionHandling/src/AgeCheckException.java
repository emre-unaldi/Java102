public class AgeCheckException extends Exception{
    public AgeCheckException(String message) {
        super(message);
        //System.out.println("Hata yakalandı !!!");
    }

    @Override
    public String toString() {
        return "Bu AgeCheckException sınıfına ait bir Exception";
    }
}
