package Model;

public class Purchase {
    private String name;
    private double price;

    // Construtor
    public Purchase(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // To String

    @Override
    public String toString() {
        return name + " - R$" + price;
    }
}
