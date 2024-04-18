Vehicle is an interface representing an abstract product.
Car and Truck are concrete product classes implementing the Vehicle interface.
VehicleFactory is a factory class with a static factory method createVehicle() that creates instances of concrete products based on a given type.
The Main class serves as the client, using the factory to create instances of Car and Truck without needing to know their concrete classes.
This code demonstrates how the Factory pattern encapsulates object creation logic and provides a way to create objects without exposing the instantiation logic to the client code.
