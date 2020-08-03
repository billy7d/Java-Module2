import java.util.Scanner;

public class tinhLaiSuat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so tien can gui: ");
        double money = scanner.nextDouble();

        System.out.print("Nhap so thang can gui: ");
        int  month = scanner.nextInt();

        System.out.print("Nhap lai suat/nam: ");
        double rate = scanner.nextDouble();

        double totalMoney = 0;

        for (int i =1;i<=month;i++){
            totalMoney = totalMoney + ((money*rate/100/12) *month);

        }
        System.out.println("So tien lai nhan duoc sau "+ month + " thang la: "+totalMoney);
    }
}
