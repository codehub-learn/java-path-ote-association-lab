package gr.codelearn.ote.domain;

public class Engine {
    private String type;
    private int horsepower;

    public Engine (String type, int horsepower) {
        this.type = type;
        this.horsepower = horsepower;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public void startEngine() {
        System.out.println("Engine is starting... Vroom!");
    }

    public void displayEngineSpecs() {
        System.out.println("Engine Type: " + type);
        System.out.println("Horsepower: " + horsepower);
    }
}
