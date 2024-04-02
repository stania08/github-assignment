package q4;

class Vehicle {
    public int horsepower = 50;

    public Vehicle(int horsepower) {
        this.horsepower = horsepower;
    }

    public void drive() {
        System.out.println("Vehicle is being driven.");
    }
}

class Car extends Vehicle {
    private String make;

    public Car(int horsepower, String make) {
        super(horsepower);
        this.make = make;
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Car is being driven.");
    }

    public void putdata() {
        System.out.println("Car's Horsepower: " + horsepower);
        System.out.println("Car's Make: " + make);
    }
}
