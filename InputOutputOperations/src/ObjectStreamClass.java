import java.io.*;

public class ObjectStreamClass {
    public static void main(String[] args) {
        Car c1 = new Car("Audi", "A6");

        try {
            FileOutputStream outputFile = new FileOutputStream("car.txt");
            ObjectOutputStream output = new ObjectOutputStream(outputFile);
            output.writeObject(c1);

            outputFile.close();
            output.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            FileInputStream inputFile = new FileInputStream("car.txt");
            ObjectInputStream input = new ObjectInputStream(inputFile);

            Car newCar = (Car) input.readObject();
            System.out.println(newCar.getBrand());
            System.out.println(newCar.getModel());

            inputFile.close();
            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
