package abstraction.abstract_classes;

public interface Bluetooth{
    void connectBluetooth();

    //static method
    static int getYear(){
        return 2022;
    }
    //Default (non -static)
    default boolean isConnected(){
        return true;
    }


}
