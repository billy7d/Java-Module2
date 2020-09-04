import java.net.ServerSocket;
import java.util.ArrayList;

public class Service {


    public static void addNhanVienFullTime(ArrayList<NhanVienFullTime> nhanVienFullTimes, NhanVienFullTime nhanVienFullTime) {
        nhanVienFullTimes.add(nhanVienFullTime);
    }

    public static void addNhanVienParttime(ArrayList<NhanVienParttime> nhanVienParttimes, NhanVienParttime nhanVienParttime) {
        nhanVienParttimes.add(nhanVienParttime);
    }


    public static double tinhLuongParttime(NhanVienParttime nhanVienParttime) {
        return nhanVienParttime.getSoGioLamViec() * 100000;
    }

    public static double tinhLuongFullTime(NhanVienFullTime nhanVienFullTime) {
        return nhanVienFullTime.getLuongCung() + (nhanVienFullTime.getSoTienThuong() - nhanVienFullTime.getSoTienPhat());
    }

    public static double tinhLuongTrungBinhAll(ArrayList<NhanVien> nhanViens) {
        double luong = 0;
        for (NhanVien nhanVien : nhanViens) {
            luong += nhanVien.getLuongThucLinh();

        }
        return luong / nhanViens.size();
    }


    public static void showLuongAllNvParttime(ArrayList<NhanVienParttime> nhanVienParttimes){
        for (NhanVienParttime nhanVienParttime: nhanVienParttimes){
            nhanVienParttime.setLuongThucLinhPt(Service.tinhLuongParttime(nhanVienParttime));
        }
        System.out.println(nhanVienParttimes);
    }

    public static void showLuongNvDuoiTb(ArrayList<NhanVien> nhanViens, ArrayList<NhanVienFullTime> nhanVienFullTimes) {
        ArrayList<NhanVienFullTime> showNhanVienFullTimes = new ArrayList<>();
        for (NhanVienFullTime nhanVienFullTime : nhanVienFullTimes) {
            if (nhanVienFullTime.getLuongThucLinhFt() < Service.tinhLuongTrungBinhAll(nhanViens)) {
                showNhanVienFullTimes.add(nhanVienFullTime);
            }
        }

        System.out.println(showNhanVienFullTimes);
    }


}

