package vehicleInventory;

public abstract class Car extends Vehicle{
    private Boolean hasHorn;
    private Boolean hasCruiseControl;

    public Car(){}

    public Car(
        String name, 
        String make, 
        String model, 
        Integer numOfWheels, 
        Float engineSize,
        CarColors color,
        Boolean hasHorn, 
        Boolean hasCruiseControl
    ){
        super(name, make, model, numOfWheels, engineSize, color);
        this.hasHorn = hasHorn;
        this.hasCruiseControl = hasCruiseControl;
    }
    public Boolean getHasHorn() {
        return this.hasHorn;
    }
    public void setHasHorn(Boolean hasHorn) {
        this.hasHorn = hasHorn;
    }

    public Boolean getHasCruiseControl() {
        return this.hasCruiseControl;
    }
    public void setHasCruiseControl(Boolean hasCruiseControl) {
        this.hasCruiseControl = hasCruiseControl;
    }

    @Override
    public String toString() {
        return super.toString() + "HasHorn: " + this.hasHorn + ", HasCruiseControl: " + this.hasCruiseControl + " ]";
    }

}