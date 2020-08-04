public class Square implements Colorable {
    private double side =1;

    public Square(){}

    public Square(double side){
        this.side = side;
    }
    public double getArea(){
        return side*side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side= " + side +
                "Area= "+ getArea()+
                '}';
    }

    @Override
    public void howToColor() {
        System.out.println(" Color all four sides..");
    }
}
