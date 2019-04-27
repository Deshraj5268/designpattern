package creational.prototype.entertainment;

public class Album implements PrototypeCapable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Album clone() throws CloneNotSupportedException {
        System.out.println("cloning Album Object");
        return (Album)super.clone();
    }

    @Override
    public String toString() {
        return "Album";
    }
}
