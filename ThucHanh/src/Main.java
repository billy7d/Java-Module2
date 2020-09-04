import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NhanVien nhanVien;
        NhanVienParttime nhanVienParttime;
        NhanVienFullTime nhanVienFullTime;
        ArrayList<NhanVienFullTime> nhanVienFullTimes = new ArrayList<>();
        ArrayList<NhanVienParttime> nhanVienParttimes = new ArrayList<>();

        int choice;
        int idFt =1;
        int idPt = 101;
        do{
            System.out.println("1. Add nhan vien Full time: ");
            System.out.println("2. Add nhan vien Part time");
            System.out.println("3. Tinh so luong cho tat ca Nv ban thoi gian: ");
            System.out.println("4. Danh sach nv Full time luong < luong TB");
            choice =scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    final double luongCung = 2000000;

                    System.out.println("Nhap ten nhan vien");
                    String name = scanner.nextLine();
                    System.out.println("Nhap tuoi cua nhan vien");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nhap so dien thoai cua nhan vien: ");
                    int phoneNumber = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nhap email cua nhan vien: ");
                    String emailNhanVien = scanner.nextLine();
                    System.out.println("Nhap so tien thuong: ");
                    double tienThuong = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nhap so tien phat: ");
                    double tienPhat = scanner.nextInt();
                    scanner.nextLine();



                    nhanVienFullTime = new NhanVienFullTime(idFt,name,age,phoneNumber,emailNhanVien,tienThuong,tienPhat,luongCung);
                    nhanVienFullTimes.add(nhanVienFullTime);
                    idFt++;
                    break;

                case 2:
                    System.out.println("Nhap ten nhan vien");
                    String namePt = scanner.nextLine();
                    System.out.println("Nhap tuoi cua nhan vien");
                    int agePt = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nhap so dien thoai cua nhan vien: ");
                    int phoneNumberPt = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nhap email cua nhan vien: ");
                    String emailNhanVienPt = scanner.nextLine();
                    System.out.println("Nhap so gio lam viec cua Nvien Part time");
                    double soGiolv2= scanner.nextDouble();
                    scanner.nextLine();

                    nhanVienParttime = new NhanVienParttime(idPt,namePt,agePt,phoneNumberPt,emailNhanVienPt,soGiolv2);
                    nhanVienParttimes.add(nhanVienParttime);
                    idPt++;

                    break;

                case 3:
                    System.out.println(Service.tinhLuongAllParttime(nhanVienParttimes).toString());
                    break;

                case 4:
                    Service.showLuongFullTimeDuoiTB(nhanVienFullTimes);
                    break;





            }
        } while (choice!=0);
    }
}
