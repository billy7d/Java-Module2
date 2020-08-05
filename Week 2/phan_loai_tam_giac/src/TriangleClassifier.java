public class TriangleClassifier {
    public static boolean isTriangle(int side1,int side2,int side3){

        if (Math.abs(side2-side3)<side1 && side1<side2+side3){
            return true;
        } return false;
    }
    public static String classifyTriangle(int side1,int side2, int side3){
        if (isTriangle(side1,side2,side3)){
            if (side1 == side2 || side1 == side3 || side2 == side3){
                if (side1 == side2 && side1 ==side3){
                    return "tam giac deu";
                } return "tam giac can";
            }
        }   return "tam giac thuong";
    }


}
