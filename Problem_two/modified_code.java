// Interface
abstract class Vehicle {
    int set_num_of_wheels(){
        return 4;
    }

    int set_num_of_passengers(){
        return 900;
    }

    boolean has_gas(){
        return true;
    }
}

// Car "implements" the Vehicle interface
class Car extends Vehicle {
    @Override
    int set_num_of_passengers(){
        return 5;
    }
}

// Plane "implements" the Vehicle interface
class Plane extends Vehicle{

    @Override
    public int set_num_of_wheels() {
        return 18;
    }

    @Override
    public boolean has_gas() {
        return false;
    }
}

