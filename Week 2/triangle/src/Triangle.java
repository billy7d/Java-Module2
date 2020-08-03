public class Triangle extends Shape{

    private double side1 = 1;
    private double side2 = 1;
    private String color = "blue";

    public Triangle(){

    }

    public Triangle(double side1,double side2, double side3,String color) {
        super(side1,color);
        this.side2 = side2;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }





    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double getArea() {
        return 0.25*(Math.sqrt((side1+side2+super.getSide())*(side1+side2-super.getSide())*(side2+super.getSide()-side1)*(super.getSide()+side1-side2)));
    }

    @Override
    public double getPerimeter() {
        return side1+side2+super.getSide();
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1= " + side1 +
                ", side2= " + side2 +
                ", side3= " + super.getSide() +
                ", Chu vi= " + getPerimeter() +
                ", Dien tich= " + getArea() +
                ", color= '" + color + '\'' +
                '}';
    }
}
