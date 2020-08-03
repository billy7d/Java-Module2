public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(10,10);
        point2D.displayX();
        point2D.displayY();

        Point3D point3D = new Point3D(11,11,12);
        point3D.displayX();

        point3D.displayY();

        for (int i=0; i<point3D.getXYZ().length;i++){
            System.out.println(point3D.getXYZ()[i]);
        }

    }


}
