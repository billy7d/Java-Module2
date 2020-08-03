public class Shape {

    private String color = "yellow";


    public Shape(){
    }

    public Shape(String color){
        this.color= color;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return getArea();
    }

    public double getPerimeter(){
        return getPerimeter();
    }

    @Override
    public String toString() {
        return "Shape{" +
                 " Area " + getArea()+
                " Perimeter " + getPerimeter()+
                '}';
    }
}
