import java.util.ArrayList;
import java.util.List;


public class Lop {
        private String tenLop;
        private String khoaHoc;

        private ArrayList<HocSinh> hocSinhTrongLop = new ArrayList<>();

        public Lop() {

        }

        public Lop(String tenLop, String khoaHoc) {
            this.tenLop = tenLop;
            this.khoaHoc = khoaHoc;
        }

        public String getTenLop() {
            return tenLop;
        }

        public void setTenLop(String tenLop) {
            this.tenLop = tenLop;
        }

        public String getKhoaHoc() {
            return khoaHoc;
        }

        public void setKhoaHoc(String khoaHoc) {
            this.khoaHoc = khoaHoc;
        }


        public ArrayList<HocSinh> getHocSinhTrongLop() {
            return hocSinhTrongLop;
        }

        public void setHocSinhTrongLop(ArrayList<HocSinh> hocSinhTrongLop) {
            this.hocSinhTrongLop = hocSinhTrongLop;
        }

        public void addLop(ArrayList<Lop> lops, Lop lop) {
            lops.add(lop);
        }


        public void addHocSinhVaoLop(ArrayList<Lop> lops,HocSinh hocSinh) {
            for (Lop lop : lops) {
                if (lop.getTenLop().equals(hocSinh.getTenLop())&&!hocSinhTrongLop.contains(hocSinh)) {
                    hocSinhTrongLop.add(hocSinh);
                }
            }
        }

        public List<HocSinh> getHocSinhVaoLop(){
            return hocSinhTrongLop;
        }

        public void displayLop(ArrayList<Lop> lops){
            for (Lop lop: lops){
                System.out.println(lop);
            }
        }
        @Override
        public String toString() {
            return "Lop{" +
                    "tenLop='" + tenLop + '\'' +
                    ", khoaHoc='" + khoaHoc + '\'' +
                    ", hocSinhs=" + hocSinhTrongLop +
                    '}';
        }
    }

