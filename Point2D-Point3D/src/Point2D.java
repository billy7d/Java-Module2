public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D(){

    }

    public Point2D(float x, float y){
        this.x = x;
        this.y = y;

    }

    public  float getX(){
        return this.x;
    }

    public void setX(float x){
        this.x = x;
    }

    public  float getY(){
        return this.y;
    }

    public void setY(float y){
        this.y = y;
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float[] getXY(){
        float[] getXY = {this.x, this.y};

        return getXY;
    }

    public void displayX(){
        System.out.println("toa do x: " + getX());
    }
    public void displayY(){

        System.out.println("toa do y: " + getY());
    }

    public String toString(){
        return "Toa do 2d: " + getXY();
    }

}
