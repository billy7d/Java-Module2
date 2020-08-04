public class Circle {
    private double radius = 1;

    public Circle(){

    }

    public Circle(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                " Area= " + getArea()+
                '}';
    }
}
