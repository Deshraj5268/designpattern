package behavioral.visitor;

public class Book implements Visitable {

    private double weight;

    private double price;

    public Book(double weight, double price) {
        this.weight = weight;
        this.price = price;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
