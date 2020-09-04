import java.util.ArrayList;
import java.util.Scanner;

public class Service {


    public static void addNhanVienFullTime(ArrayList<NhanVienFullTime> nhanVienFullTimes, NhanVienFullTime nhanVienFullTime) {
        nhanVienFullTimes.add(nhanVienFullTime);
    }

    public static void addNhanVienParttime(ArrayList<NhanVienParttime> nhanVienParttimes, NhanVienParttime nhanVienParttime) {
        nhanVienParttimes.add(nhanVienParttime);
    }


    public static ArrayList<Double> tinhLuongAllParttime(ArrayList<NhanVienParttime> nhanVienParttimes) {
        ArrayList<Double> luongNvPt = new ArrayList<>();
        for (NhanVienParttime nhanVienParttime : nhanVienParttimes) {
            double tienLuongPt = nhanVienParttime.getSoGioLamViec() * 100000;
            luongNvPt.add(tienLuongPt);
            System.out.println("Luong cua nhan vien "+nhanVienParttime.getHoVaTen() +" la: "+tienLuongPt);
        }
        return luongNvPt;
    }

    public static ArrayList<Double> tinhLuongAllFullTime(ArrayList<NhanVienFullTime> nhanVienFullTimes) {
        ArrayList<Double> luongNvFt = new ArrayList<>();
        for (NhanVienFullTime nhanVienFullTime : nhanVienFullTimes) {
            double tienLuongFt = nhanVienFullTime.getLuongCung()+(nhanVienFullTime.getSoTienThuong()-nhanVienFullTime.getSoTienPhat());
            luongNvFt.add(tienLuongFt);
            nhanVienFullTime.setLuong(tienLuongFt);
        }
        return luongNvFt;
    }

    public static void showLuongFullTimeDuoiTB(ArrayList<NhanVienFullTime> nhanVienFullTimes){
        double mucLuongFtTrungBinh = 0;

        for (Double db: tinhLuongAllFullTime(nhanVienFullTimes)){
            mucLuongFtTrungBinh+=db;
        }
        mucLuongFtTrungBinh = mucLuongFtTrungBinh/ tinhLuongAllFullTime(nhanVienFullTimes).size();

        for (NhanVienFullTime nhanVienFullTime: nhanVienFullTimes){
            if (nhanVienFullTime.getLuong()<mucLuongFtTrungBinh){
                System.out.println(nhanVienFullTime);
            }
        }

    }

}
