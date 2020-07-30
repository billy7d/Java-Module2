

public class Fan {

    final int SLOW = 1;
    final int MEDIUM =2;
    final int FAST =3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";



    public Fan(){}


    public void setSpeed(int speedChange){
         this.speed = speedChange;
    }

    public void setTurnOn(boolean batTat){
        this.on = batTat;
    }

    public void setRadius(double radiusChange){
        this.radius = radiusChange;
    }

    public void setColor(String mau){
        this.color = mau;
    }


    public int getSpeed(){
        return this.speed;
    }
    public boolean getTurnOn(){
        return this.on;
    }
    public double getRadius(){
        return this.radius;
    }
    public String getColor(){
        return this.color;
    }

    public String toString(){
        if (this.on){
            return "toc do quat la: "+ this.speed + " mau quat la: " + this.color + " ban kinh cua quat la: " + this.radius + " fan is on";
        } else{
            return "mau quat la: " + this.color + " ban kinh cua quat la: " + this.radius + " fan is off";
        }
    }


}
