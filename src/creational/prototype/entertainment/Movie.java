package creational.prototype.entertainment;

public class Movie implements PrototypeCapable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Movie clone() throws CloneNotSupportedException{
        System.out.println("Cloning Movie Object : ");
        return (Movie)super.clone();
    }

    @Override
    public String toString(){
        return "Movie";
    }
}
