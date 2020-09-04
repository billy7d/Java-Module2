import java.util.ArrayList;

public class Service {


    public static void addNhanVienFullTime(ArrayList<NhanVienFullTime> nhanVienFullTimes, NhanVienFullTime nhanVienFullTime) {
        nhanVienFullTimes.add(nhanVienFullTime);
    }

    public static void addNhanVienParttime(ArrayList<NhanVienParttime> nhanVienParttimes, NhanVienParttime nhanVienParttime) {
        nhanVienParttimes.add(nhanVienParttime);
    }


    public static double tinhLuongParttime(NhanVienParttime nhanVienParttime) {
      return nhanVienParttime.getSoGioLamViec()*10000;
    }

    public static double tinhLuongFullTime(NhanVienFullTime nhanVienFullTime) {
        return nhanVienFullTime.getLuongCung()+(nhanVienFullTime.getSoTienThuong()-nhanVienFullTime.getSoTienPhat());
    }

    public static double tinhLuongTrungBinhAll(ArrayList<NhanVien> nhanViens){
        double luong =0;
        for (NhanVien nhanVien:nhanViens){
            luong +=nhanVien.getLuongThucLinh();

        }
        return luong/nhanViens.size();
    }

    public static void showLuongNvDuoiTb(ArrayList<NhanVien> nhanViens,ArrayList<NhanVienFullTime> nhanVienFullTimes){
        ArrayList<NhanVienFullTime> showNhanVienFullTimes = new ArrayList<>();
        for (NhanVien nhanVien:nhanViens){
            for (NhanVienFullTime nhanVienFullTime:nhanVienFullTimes)
            if (nhanVienFullTime.getLuongThucLinh()<Service.tinhLuongTrungBinhAll(nhanViens)
                    &&!showNhanVienFullTimes.contains(nhanVienFullTime)){
                showNhanVienFullTimes.add(nhanVienFullTime);
            }
        }
        System.out.println(showNhanVienFullTimes);
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
