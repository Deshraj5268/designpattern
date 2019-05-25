package structural.classdata;

public class Circle {

    private CircleSpecs circleSpecs;

    public Circle(double radius){
        this.circleSpecs = new CircleSpecs(radius);
    }

    public double circumFerence(){
        return Math.PI * circleSpecs.getRadius();
    }

    public double diameter(){
        return 2*Math.PI*circleSpecs.getRadius();
    }
}
