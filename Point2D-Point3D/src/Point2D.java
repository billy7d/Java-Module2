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
        for (int i =0; i<getXY.length;i++){
            System.out.println(getXY[i]);
        }
        return getXY;
    }

    public String toString(){
        return "Toa do 2d: " + getXY();
    }

}
