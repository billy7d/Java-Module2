import java.util.Scanner;

public class addElementArray {
    public static void main(String[] args) {
        int[] arr = {10,4,6,7,8,0};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao vi tri can chen: ");
        int index = scanner.nextInt();

        System.out.print("Nhap vao gia tri can chen: ");
        int valueNum = scanner.nextInt();


        if (index <= 1 || index >= arr.length-1)
            System.out.println("Khong chen duoc ptu vao mang");

        for (int i =arr.length-1; i>=index -1;i--){
            arr[i] = arr[i-1];
        } arr[index-1]= valueNum;

        for (int p = 0;p<arr.length;p++){
            System.out.println(arr[p]);
        }

    }
}
