// Interface
interface Vehicle {
    int set_num_of_wheels();
    int set_num_of_passengers();
    boolean has_gas();
}

// Car "implements" the Vehicle interface
class Car implements Vehicle {
    @Override
    public int set_num_of_wheels() {
        return 4;
    }

    @Override
    public int set_num_of_passengers() {
        return 5;
    }

    @Override
    public boolean has_gas() {
        return true;
    }
}

// Plane "implements" the Vehicle interface
class Plane implements Vehicle{

    @Override
    public int set_num_of_wheels() {
        return 18;
    }

    @Override
    public int set_num_of_passengers() {
        return 900;
    }

    @Override
    public boolean has_gas() {
        return false;
    }
}
