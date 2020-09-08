import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NhanVien nhanVien;
        ArrayList<NhanVien> nhanViens = new ArrayList<>();
        ArrayList<NhanVienFullTime> nhanVienFullTimes = new ArrayList<>();
        ArrayList<NhanVienParttime> nhanVienParttimes = new ArrayList<>();


        int choice;
        do{
            System.out.println("1. Add nhan vien Full time: ");
            System.out.println("2. Add nhan vien Part time");
            System.out.println("3. Danh sach nv Full time luong < luong TB");
            System.out.println("4. Tinh so luong cho tat ca Nv ban thoi gian: ");
            System.out.println("5. Show all nhan vien: ");
            System.out.println("6. Sap xep nvien toan tgian theo so luong tang dan: ");

            choice =scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    final double luongCung = 2000000;

                    System.out.println("Nhap id cua nv FullTime(**ft): ");
                    String idFt = scanner.nextLine();
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



                    NhanVienFullTime nhanVienFullTime =
                            new NhanVienFullTime(idFt,name,age,phoneNumber,emailNhanVien,tienThuong,tienPhat,luongCung);
                    NhanVienFullTime nhanVienFullTimeToAdd =
                            new NhanVienFullTime(idFt,name,age,phoneNumber,emailNhanVien,tienThuong,tienPhat,luongCung,Service.tinhLuongFullTime(nhanVienFullTime));

                    nhanVienFullTimes.add(nhanVienFullTimeToAdd);
                    nhanViens.add(nhanVienFullTimeToAdd);

                    break;

                case 2:
                    System.out.println("Nhap id nhan vien Part Time: ");
                    String idPt = scanner.nextLine();
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
                    double soGiolv= scanner.nextDouble();
                    scanner.nextLine();

                    NhanVienParttime nhanVienParttime =
                            new NhanVienParttime(idPt,namePt,agePt,phoneNumberPt,emailNhanVienPt,soGiolv);
                    NhanVienParttime nhanVienParttimeToAdd =
                            new NhanVienParttime(idPt,namePt,agePt,phoneNumberPt,emailNhanVienPt,soGiolv,Service.tinhLuongParttime(nhanVienParttime));

                    nhanVienParttimes.add(nhanVienParttimeToAdd);
                    nhanViens.add(nhanVienParttimeToAdd);
                    break;

                case 3:
                    Service.showLuongNvDuoiTb(nhanViens,nhanVienFullTimes);
                    break;

                case 4:
                    Service.showLuongAllNvParttime(nhanVienParttimes);
                    break;
                case 5:
                    System.out.println(nhanViens.toString());
                    break;

                case 6:
                    Collections.sort(nhanVienFullTimes);
                    System.out.println(nhanVienFullTimes.toString());
                    break;





            }
        } while (choice!=0);
    }
}
