package CriticalSectionsAndRaceCondition;

public class OrderMatic implements Runnable{
    private int orderNo;
    private Object LOCK = new Object();

    public OrderMatic() {
        this.orderNo = 0;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        /*// Thread buraya gelip metoda girdiðind burayý kitler. Ýþlem bitene kadar býrakmaz
        synchronized (LOCK) {
            this.orderNo++;
            System.out.println("Thread : " + Thread.currentThread().getName() + " - OrderNo : " + this.orderNo);
        }*/
        increaseOrder();
    }

    public synchronized void increaseOrder() {
        this.orderNo++;
        System.out.println("Thread : " + Thread.currentThread().getName() + " - OrderNo : " + this.orderNo);
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }
}
