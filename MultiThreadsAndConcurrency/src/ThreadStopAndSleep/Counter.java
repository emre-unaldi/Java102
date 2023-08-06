package ThreadStopAndSleep;

public class Counter implements Runnable {
    private String name;
    private int id;
    private boolean isRun = true;

    public Counter(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(getName() + " Çalýþtý !");
        int i = 0;
        while (isRun) {
            try {
                Thread.sleep(1000L * getId());
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(getName() + " : " + i++);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void stop() {
        this.isRun = false;
    }
}
