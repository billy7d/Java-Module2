import java.util.Scanner;

public class uocChungLonNhat {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so a: ");
        a = scanner.nextInt();
        a = Math.abs(a);
        System.out.print("Nhap so b: ");
        b = scanner.nextInt();
        b = Math.abs(b);

        if (a == 0 || b==0){
            System.out.println("Khong co UCLN");
        }
        while (a!=b){
            if (a>b){
                a = a-b;
            } else{
                b= b-a;
            }
        }
        System.out.println("UCLN la: " + a);
    }
}
