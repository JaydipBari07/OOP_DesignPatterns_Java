package factoryMethod;

public class BikeFactory extends VehicleFactory {
    @Override
    Vehicle createVehicle() {
        return new Bike();
    }
}
