package GenericClasses;

public class GenericAll <value1, value2, value3>{
    private value1 obj1;
    private value2 obj2;
    private value3 obj3;

    public GenericAll(value1 obj1, value2 obj2, value3 obj3) {
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;
    }

    public value1 getObj1() {
        return obj1;
    }

    public void setObj1(value1 obj1) {
        this.obj1 = obj1;
    }

    public value2 getObj2() {
        return obj2;
    }

    public void setObj2(value2 obj2) {
        this.obj2 = obj2;
    }

    public value3 getObj3() {
        return obj3;
    }

    public void setObj3(value3 obj3) {
        this.obj3 = obj3;
    }

    public void showInfo(){
        System.out.println("Value1 : " + obj1 + " : " + obj1.getClass().getSimpleName());
        System.out.println("Value2 : " + obj2 + " : " + obj2.getClass().getSimpleName());
        System.out.println("Value3 : " + obj3 + " : " + obj3.getClass().getSimpleName());
    }
}
