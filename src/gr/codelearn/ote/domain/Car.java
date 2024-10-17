package gr.codelearn.ote.domain;

public class Car {
    private String model;
    private String brand;
    private Engine engine; // Composition with the Engine class

    public Car(String model, String brand, String engineType, int engineHorsepower) {
        this.model = model;
        this.brand = brand;
        this.engine = new Engine(engineType, engineHorsepower);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(String engineType, int horsepower) {
        this.engine = new Engine(engineType, horsepower);
    }

    public void startCar() {
        System.out.println(brand + " " + model + " is starting...");
        engine.startEngine();
    }

    public void showCarDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Brand: " + brand);
        engine.displayEngineSpecs();
    }
}
