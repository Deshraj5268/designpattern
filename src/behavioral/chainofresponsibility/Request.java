package behavioral.chainofresponsibility;

public class Request {

    private String description;

    private int value;

    public Request() {
    }

    public Request(String description,int value) {
        this.value = value;
        this.description = description;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
