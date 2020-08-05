public class AbsoluteNumberCalculator {
    public static int findAbsolute(int number){
        if (number >0){
            return number;
        } else if (number ==0) return 0;
        else {
            return -number;
        }
    }
}
