import vehicleInventory.Car;
import vehicleInventory.CarColors;
import vehicleInventory.ElectricCar;
import vehicleInventory.Vehicle;

class Main{

    public static void main(String[] args){
        Car myCar = new Car("Jennae", "Chevy", "Cobalt", 4, 2.5f, true, true, CarColors.RED);

        // Car myOtherCar = new Car("Speed Demon", "Ferarri", "Enzo", 4, 6f, true, true);

        Vehicle myECar = new ElectricCar("Jennae", "Chevy", "Cobalt", 4, 2.5f, CarColors.RED, true, true, 2.4f);
    }
}