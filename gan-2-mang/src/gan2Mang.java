import java.util.Scanner;

public class gan2Mang {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        int[] arr3 = new int[arr1.length + arr2.length];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Nhap gia tri cho phan tu thu " + (i + 1) +" : ");
            int intputArr1 = scanner.nextInt();
            arr1[i] = intputArr1;
        }
        System.out.println(" ");
        for (int a = 0; a < arr2.length; a++) {
            System.out.print("Nhap gia tri cho phan tu thu " + (a + 1) +" cho mang 2 : ");
            int intputArr2 = scanner.nextInt();
            arr2[a] = intputArr2;
        }

        for (int m = 0; m < arr1.length; m++) {
            arr3[m]=arr1[m];
        }
        for (int n = 0; n <arr2.length; n++) {
            arr3[arr1.length+n]= arr2[n];
        }
        for (int l =0;l<arr3.length;l++){
            System.out.print(arr3[l] +" , ");
        }

    }
}
