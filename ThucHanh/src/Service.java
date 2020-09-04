import java.util.ArrayList;

public class Service {


    public static void addNhanVienFullTime(ArrayList<NhanVienFullTime> nhanVienFullTimes, NhanVienFullTime nhanVienFullTime) {
        nhanVienFullTimes.add(nhanVienFullTime);
    }

    public static void addNhanVienParttime(ArrayList<NhanVienParttime> nhanVienParttimes, NhanVienParttime nhanVienParttime) {
        nhanVienParttimes.add(nhanVienParttime);
    }


    public static void tinhLuongAllParttime(ArrayList<NhanVien> nhanViens, ArrayList<NhanVienParttime> nhanVienParttimes) {
        for (NhanVien nhanVien: nhanViens){
            for (NhanVienParttime nhanVienParttime:nhanVienParttimes){
                if (nhanVien.getIdNhanVien().equals(nhanVienParttime.getIdNhanVienPartTime())){
                    nhanVienParttime.setLuongThucTinhPt(nhanVienParttime.getSoGioLamViec()*100000);
                }
            }
        }

    }

    public static void tinhLuongAllFullTime(ArrayList<NhanVien> nhanViens, ArrayList<NhanVienFullTime> nhanVienFullTimes) {
        for (NhanVien nhanVien: nhanViens){
            for (NhanVienFullTime nhanVienFullTime:nhanVienFullTimes){
                if (nhanVien.getIdNhanVien().equals(nhanVienFullTime.getIdNhanVienFullTime())){
                    nhanVienFullTime.setLuongThucLinhFt(nhanVienFullTime.getLuongCung()+
                            (nhanVienFullTime.getSoTienThuong()-nhanVienFullTime.getSoTienPhat()));
                }
            }
        }
    }

    public static void tinhLuongTrungBinhAll(ArrayList<NhanVien> nhanViens){
        for (Nhan)
    }

//    public static void showLuongFullTimeDuoiTB(ArrayList<NhanVienFullTime> nhanVienFullTimes){
//        double mucLuongFtTrungBinh = 0;
//
//        for (Double db: tinhLuongAllFullTime(nhanVienFullTimes)){
//            mucLuongFtTrungBinh+=db;
//        }
//        mucLuongFtTrungBinh = mucLuongFtTrungBinh/ tinhLuongAllFullTime(nhanVienFullTimes).size();
//
//        for (NhanVienFullTime nhanVienFullTime: nhanVienFullTimes){
//            if (nhanVienFullTime.getLuongThucLinhFt()<mucLuongFtTrungBinh){
//                System.out.println(nhanVienFullTime);
//            }
//        }
//
//    }

}
