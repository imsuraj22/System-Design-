public class Vehicle{
    String noPlate;
    String vehicleType;

    Vehicle(String noPlate, String vehicleType){
        this.noPlate=noPlate;
        this.vehicleType=vehicleType;
    }
    String getLicencePlate(){
        return noPlate;
    }
    String getVehicleType(){
        return vehicleType;
    }
}
