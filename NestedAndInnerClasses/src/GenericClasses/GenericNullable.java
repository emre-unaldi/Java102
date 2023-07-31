package GenericClasses;

public class GenericNullable <GenericVariable>{
    public final GenericVariable value;

    public GenericNullable(GenericVariable value) {
        this.value = value;
    }

    public GenericVariable getValue() {
        return value;
    }

    public boolean isNull(){
        return this.getValue() == null;
    }

    public void run(){
        if (isNull()){
            System.out.println("Bu değişkene değer atanmamıştır. (null)");
        } else {
            System.out.println(this.getValue());
        }
    }
}
