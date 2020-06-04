package transport;

public class Donkey extends AbstractVehicle {
    private String name;

    public Donkey(String name, int fuel) {
        super(fuel);
        this.name = name;
    }

    public Donkey(String name) {
        // default constructor
        this.name = name;
    }

    @Override
    public String getPath() {
        return "Grass";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "this is a Donkey " + name + " fuel " + fuel;
    }
}