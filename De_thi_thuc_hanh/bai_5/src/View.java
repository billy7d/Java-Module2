import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        List<Nguoi> nguois = new ArrayList<>();
        List<HoDan> hoDans = new ArrayList<>();
        Nguoi nguoi;
        HoDan hoDan = new HoDan();
        KhuPho khuPho = new KhuPho();
        int choiceMenu;
        int choiceHoDan;
        int choiceNguoi;
        int id =1;
        int idHoDan = 10;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("1. Nguoi: ");
            System.out.println("2. Ho dan: ");
            System.out.println("0.Exit: ");
            System.out.print("Chon: ");

            choiceMenu = scanner.nextInt();
            scanner.nextLine();

            switch (choiceMenu){

                case 1:
                    do {
                        System.out.println("1. Add nguoi: ");
                        System.out.println("2. Doi ten: ");
                        System.out.println("3. Doi ngay thang nam sinh: ");
                        System.out.println("4. Doi nghe nghiep: ");
                        System.out.println("5. Show nguoi: ");
                        System.out.println("0. Go back");

                        choiceNguoi = scanner.nextInt();
                        scanner.nextLine();

                        switch (choiceNguoi){
                            case 1:

                                System.out.println("Nhap ten tuoi: ");
                                String name = scanner.nextLine();
                                System.out.println("Nhap ngay thang nam sinh(dd/mm/yyyy)");
                                String dob = scanner.nextLine();
                                System.out.println("Nghe nghiep: ");
                                String job = scanner.nextLine();
                                nguoi = new Nguoi(id,name,dob,job);
                                hoDan.addNguoi(nguois,nguoi);
                                id++;
                                break;
                            case 2:
                                System.out.println("Nhap id cua doi tuong: ");
                                int id1 = scanner.nextInt();
                                scanner.nextLine();
                                System.out.println("Nhap ten moi can doi: ");
                                String dob1 = scanner.nextLine();
                                hoDan.editHoVaTen(nguois,id,dob1);
                                break;
                            case 3:
                                System.out.println("Nhap id cua doi tuong: ");
                                int id2 = scanner.nextInt();
                                scanner.nextLine();
                                System.out.println("Nhap ngay thang nam sinh moi: ");
                                String dob2 = scanner.nextLine();
                                hoDan.editNgaySinh(nguois,id2,dob2);
                                break;
                            case 4:
                                System.out.println("Nhap id cua doi tuong: ");
                                int id3 = scanner.nextInt();
                                scanner.nextLine();
                                System.out.println("Nhap ngay nghe nghiep moi: ");
                                String dob3 = scanner.nextLine();
                                hoDan.editNgheNghiep(nguois,id3,dob3);
                                break;
                            case 5:
                                for (Nguoi i: nguois){
                                    System.out.println(i.toString());
                                }
                        }

                    }while (choiceNguoi!=0);
                    break;
                case 2:
                    do {
                        System.out.println("1. Add Ho dan: ");
                        System.out.println("2. Sua so nha Ho dan: ");
                        System.out.println("3. Sua so thanh vien Ho dan");
                        System.out.println("4. Print tat ca Ho dan: ");
                        System.out.println("5. Print Ho dan co nguoi tren 80 tuoi: ");
                        System.out.println("0. Go back");

                        choiceHoDan= scanner.nextInt();

                        scanner.nextLine();

                        switch (choiceHoDan){
                            case 1:
                                System.out.println("So thanh vien trong ho: ");
                                int soNguoiTrongHo= scanner.nextInt();
                                scanner.nextLine();
                                System.out.println("Nhap so nha cua ho: ");
                                String soNha = scanner.nextLine();
                                hoDan = new HoDan(idHoDan,soNguoiTrongHo,soNha,nguois);
                                khuPho.addHoDan(hoDans,hoDan);
                                idHoDan++;
                                break;
                            case 2:
                                System.out.println("Nhap id cua ho dan can sua so nha: ");
                                int idHoDan1 = scanner.nextInt();
                                scanner.nextLine();
                                System.out.println("Nhap so nha moi: ");
                                String soNhaMoi = scanner.nextLine();
                                khuPho.editSoNha(hoDans,idHoDan1,soNhaMoi);
                                break;

                            case 3:
                                System.out.println("Nhap id cua ho dan can sua so nha: ");
                                int idHoDan2 = scanner.nextInt();
                                scanner.nextLine();
                                System.out.println("Nhap so thanh vien can thay doi: ");
                                int soThanhVienThayDoi = scanner.nextInt();
                                scanner.nextLine();
                                khuPho.editSoNguoiTrongHo(hoDans,idHoDan2,soThanhVienThayDoi);
                                break;

                            case 4:
                                for (HoDan i:hoDans){
                                    System.out.println(i.toString());
                                }
                                break;

                            case 5:
                                for (Nguoi i :  hoDan.getListOf80(nguois)){
                                    System.out.println(i.toString());
                                }
                                break;


                        }


                    }while (choiceHoDan !=0);
                    break;
            }

        } while (choiceMenu!=0);






    }
}
