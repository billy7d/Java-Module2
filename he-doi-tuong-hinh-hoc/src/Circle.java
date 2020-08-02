public class Circle extends Shape{
    private double radius;


    public Circle(){
        this.radius = 1;
    }
    public Circle(double radius){

    }

    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }


    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }

    public double getPerimeter(){
        return this.radius*2*Math.PI;
    }

    @Override
    public String toString(){
        System.out.println("A Circle with radius " + this.radius +" which is a subclass of "+ super.toString());
    }


}
