import java.util.Scanner;

public class delElement {
    public static void main(String[] args) {

        int[] arr = {10,4,6,7,8,6};
        int index =0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao 1 so can xoa: ");
        int inputNum = scanner.nextInt();

        for (int i=0;i<arr.length;i++){

            if (arr[i] == inputNum){
                index = i;
            }
        }

        for (int j =index; j <arr.length-1;j++){
            arr[j] = arr[j +1];
        } arr[arr.length -1] =0;

        for (int p =0;p<arr.length;p++){
            System.out.println(arr[p]);
        }
    }
}
