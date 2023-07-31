package Interface;

public interface IBank {
    final String hostIpAddress = "127.0.0.1";
    boolean connect(String ipAddress);
    boolean payment(double price, String cardNumber, String expiryDate, String cvc);

    /*
     Interface içerisine bir değişken tanımlayamayız. Abstract sınıflarda tanımlayabiliriz.
     Eğer Interface içerisinde yine de değişken oluturmak istersek varsayılan değer vermek
     zorundayız. Varsayılan değeri olmayan değişkene atama yapamıyoruz.
    */
}
