public class Triangle extends Shape{

    private double side1 = 1;
    private double side2 = 1;
    private double side3 = 1;


    public Triangle(){

    }

    public Triangle(double side1,double side2, double side3,String color) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
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



    @Override
    public double getArea() {
        return 0.25*(Math.sqrt((side1+side2+side3)*(side1+side2-side3)*(side2+side3-side1)*(side3+side1-side2)));
    }

    @Override
    public double getPerimeter() {
        return side1+side2+side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1= " + side1 +
                ", side2= " + side2 +
                ", side3= " + side3 +
                ", Chu vi= " + getPerimeter() +
                ", Dien tich= " + getArea() +
                ", color= '" + super.getColor() + '\'' +
                '}';
    }
}
