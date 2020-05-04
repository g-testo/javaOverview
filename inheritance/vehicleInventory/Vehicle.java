package vehicleInventory;
// model
// domain
// pojo
// java bean
public abstract class Vehicle implements Drivable{

    // properties
    private String name;
    private String make;
    private String model;
    private Integer numOfWheels;
    private Float engineSize;
    private CarColors color;
    
    // Constructors
   public Vehicle() {}

   public Vehicle(
       String name, 
       String make, 
       String model, 
       Integer numOfWheels, 
       Float engineSize, 
       CarColors color
    ) {
       this.name = name;
       this.make = make;
       this.model = model;
       this.numOfWheels = numOfWheels;
       this.engineSize = engineSize;
       this.color = color;
   }

   //Getters and Setters
   public String getName() {
       return name;
   }
   public void setName(String name) {
       this.name = name;
   }
   public String getMake() {
       return make;
   }
   public void setMake(String make) {
       this.make = make;
   }
   public String getModel() {
       return model;
   }
   public void setModel(String model) {
       this.model = model;
   }
   public Integer getNumOfWheels() {
       return numOfWheels;
   }
   public void setNumOfWheels(Integer numOfWheels) {
       this.numOfWheels = numOfWheels;
   }
   public Float getEngineSize() {
       return this.engineSize;
   }
   public void setEngineSize(Float engineSize) {
       this.engineSize = engineSize;
   }
   public CarColors getColor() {
        return color;
   }
   public void setEngineSize(CarColors color) {
        this.color = color;
   }

   public void myMethod(){
       System.out.println("Testing");
   }

   public void drive() {
                
  }

  public abstract void honkHorn();
   
   //Override Methods
   @Override
   public String toString() {
       return "Vehicle [name=" + name + ", make=" + make + ", model=" + model + ", numOfWheels=" + numOfWheels
               + ", engineSize=" + engineSize + ", color= " + color;
   }

}