public class Cylinder extends Circle{
    private double height;

    public Cylinder(){
        this.height = 1;
    }

    public Cylinder(double height,double radius, String color){
        super(radius, color);
        this.height = height;
    }

    public double getVolume(){

        return super.getArea()*this.height;
    }





}
