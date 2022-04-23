package abstraction.abstract_classes;

public class Samsung extends Phone implements Camera, Bluetooth{

    public static final String OS="Android";

    public Samsung() {
    }

    public Samsung(String brand, String color, int storage, double price) {
        super(brand, color, storage, price);
    }

    @Override
    public void call() {
        System.out.println("Samsung calls");

    }

    @Override
    public void ring() {
        System.out.println("Samsung rings");

    }

    @Override
    public void text() {
        System.out.println("Samsung text");
    }

    @Override
    public boolean isConvertible() {
        return false;
    }

    @Override
    public void takesPhoto() {
        System.out.println("Samsung takes photo");
    }

    @Override
    public void connectBluetooth() {
        System.out.println("Samsung connects to Bluetooth");
    }
}
