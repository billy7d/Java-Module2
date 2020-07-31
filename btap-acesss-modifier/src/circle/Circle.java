package circle;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    Circle(){}
    Circle(double r){
        this.radius = r;
    }

     double getRadius(){
        return radius;
    }
     double getArea(){
        return radius*radius*Math.PI;
    }
}
