package Interface;

public class BankB implements IBank{
    private String bankName;
    private String terminalId;
    private String password;

    public BankB(String bankName, String terminalId, String password) {
        this.bankName = bankName;
        this.terminalId = terminalId;
        this.password = password;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean connect(String ipAddress) {
        System.out.println("Kullanıcı ip : " + ipAddress);
        System.out.println("Makine ip : " + this.hostIpAddress);
        System.out.println(this.bankName + " Bağlanıldı !");
        return false;
    }

    @Override
    public boolean payment(double price, String cardNumber, String expiryDate, String cvc) {
        // Banka ödeme işlemleri oluğunu varsayalım
        System.out.println("Bankadan cevap bekleniyor");
        System.out.println("İşlem başarılı oldu!");
        return false;
    }
}
