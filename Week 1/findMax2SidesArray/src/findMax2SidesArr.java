public class findMax2SidesArr {
    public static void main(String[] args) {
        int [][] arr= {
            {1,2,3,4},
            {4,22,6,7},
            {8,9,10,11},
        };

        int max = arr[0][0];
        int x =0;
        int y =0;

        for (int i =0;i<arr.length;i++){
            for (int j =0;j<arr[i].length;j++){
                if (max<arr[i][j]){
                    max = arr[i][j];
                    x=i;
                    y=j;
                }
            }
        }
        System.out.println("Gia tri lon nhat trong mang la: "+ max+", o dong thu "+ x +", cot thu "+ y);




    }
}
