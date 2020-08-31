import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lop lop = new Lop();
        HocSinh hocSinh = new HocSinh();
        ArrayList<Lop> lops = new ArrayList<>();
        ArrayList<HocSinh> allHocSinhs = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {

            System.out.println("1. Add lop: ");
            System.out.println("2. Add hoc sinh: ");
            System.out.println("3. Hien thi lop: ");
            System.out.println("0. Exit: ");

            choice = scanner.nextInt();
            scanner.nextLine();


            switch (choice){
                case 1:
                    System.out.println("Nhap ten lop");
                    String tenLop = scanner.nextLine();
                    System.out.println("Nhap khoa hoc");
                    String khoaHoc = scanner.nextLine();
                    lop = new Lop(tenLop,khoaHoc);
                    lops.add(lop);
                    break;
                case 2:
                    System.out.println("Nhap ho va ten hoc sinh ");
                    String hoVaTen = scanner.nextLine();
                    System.out.println("Nhap ngay thang nam sinh (dd/mm/yyyy) ");
                    String dob = scanner.nextLine();
                    System.out.println("Nhap que quan hoc sinh ");
                    String que = scanner.nextLine();
                    System.out.println("Nhap lop cua hoc sinh");
                    String tenLopCuaHocSinh = scanner.nextLine();
                    hocSinh = new HocSinh(hoVaTen,dob,que,tenLopCuaHocSinh);
                    allHocSinhs.add(hocSinh);
                    lop.addHocSinhVaoLop(lops,allHocSinhs);
                    break;

                case 3:
                    lop.displayLop(lops);
                    break;

            }
        } while (choice!=0);
    }
}
