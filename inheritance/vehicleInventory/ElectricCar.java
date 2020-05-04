package vehicleInventory;

public class ElectricCar extends Car{
    private Float batteryCapacity;

    public ElectricCar(
        String name, 
        String make, 
        String model, 
        Integer numOfWheels, 
        Float engineSize,
        CarColors color,
        Boolean hasHorn, 
        Boolean hasCruiseControl,
        Float batteryCapacity
    ){
        super(name, make, model, numOfWheels, engineSize, color, hasHorn, hasCruiseControl);
        this.batteryCapacity = batteryCapacity;
    }

    public Float getBatteryCapacity() {
        return this.batteryCapacity;
    }

    public void setBatteryCapacity(Float batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
    
    @Override
    public String toString() {
        return super.toString() + "Battery Capacity: " + this.batteryCapacity;
    }

}