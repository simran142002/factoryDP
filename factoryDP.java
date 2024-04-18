// Abstract product
interface Vehicle {
    void drive();
}

// Concrete product classes
class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a car");
    }
}

class Truck implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a truck");
    }
}

// Factory class
class VehicleFactory {
    // Factory method to create vehicles
    public static Vehicle createVehicle(String type) {
        if ("car".equalsIgnoreCase(type)) {
            return new Car();
        } else if ("truck".equalsIgnoreCase(type)) {
            return new Truck();
        } else {
            throw new IllegalArgumentException("Invalid vehicle type: " + type);
        }
    }
}

// Client code
public class Main {
    public static void main(String[] args) {
        // Create a car
        Vehicle car = VehicleFactory.createVehicle("car");
        car.drive();

        // Create a truck
        Vehicle truck = VehicleFactory.createVehicle("truck");
        truck.drive();
    }
}
