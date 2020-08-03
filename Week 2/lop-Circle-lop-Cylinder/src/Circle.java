public class Circle {
    private double radius;
    private String color;

    public Circle(){
        this.radius =1;
        this.color="red";
    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public double getArea(){
        return this.radius* this.radius* Math.PI;
    }


}
