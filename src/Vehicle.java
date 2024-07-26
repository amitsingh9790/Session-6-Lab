//Base class Vehicle with a start method
public class Vehicle {
    void start(){
        System.out.println("Vehicle started");
    }
}
//Car class extending Vehicle and overriding start method
class Car extends Vehicle {
    @Override
    void start(){
        System.out.println("Car started");
    }
}
//Motorcycle class extending Vehicle and overriding start method
class Motorcycle extends Vehicle {
    @Override
    void start(){
        System.out.println("Motorcycle started");
    }
}
//Garage class with a method to service any Vehicle
class Garage{
    void serviceVehicle(Vehicle vehicle){
        vehicle.start();
        System.out.println("Vehicle serviced.");
    }
}

class Main2{
    public static void main(String[] args) {
        //Creating instances of Car and Motorcycle
        Car TeslaModelX = new Car();
        Motorcycle BMW_AZ100 = new Motorcycle();

        //Creating an instance of Garage
        Garage ExcelentRepairingCentre = new Garage();

        //Servicing the Car and Motorcycle using the Garage instance
        ExcelentRepairingCentre.serviceVehicle(TeslaModelX);
        ExcelentRepairingCentre.serviceVehicle(BMW_AZ100);
    }
}