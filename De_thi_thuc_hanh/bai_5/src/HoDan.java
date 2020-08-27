import java.util.ArrayList;
import java.util.List;

public class HoDan {
    private int idHodan;
    private int soThanhVienTrongHo;
    private String soNha;
    private List<Nguoi> nguois = new ArrayList<>();


    public HoDan() {

    }

    public HoDan(int id, int thanhVienTrongHo, String soNha,List<Nguoi> nguois) {
        this.idHodan = id;
        this.soThanhVienTrongHo = thanhVienTrongHo;
        this.soNha = soNha;
        this.nguois = nguois;

    }

    public List<Nguoi> getNguois() {
        return nguois;
    }

    public void setNguois(List<Nguoi> nguois) {
        this.nguois = nguois;
    }

    public int getSoThanhVienTrongHo() {
        return soThanhVienTrongHo;
    }

    public void setSoThanhVienTrongHo(int soThanhVienTrongHo) {
        this.soThanhVienTrongHo = soThanhVienTrongHo;
    }

    public String getSoNha() {
        return soNha;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }


    public int getIdHodan() {
        return idHodan;
    }

    public void setIdHodan(int idHodan) {
        this.idHodan = idHodan;
    }

    public void addNguoi(List<Nguoi> list, Nguoi nguoi) {
        list.add(nguoi);
    }

    public void editHoVaTen(List<Nguoi> list, int id, String hoVaTen) {
        for (Nguoi i : list) {
            if (i.getId() == id) {
                i.setHoVaTen(hoVaTen);
            }
        }
    }

    public void editNgaySinh(List<Nguoi> list,int id, String ngaySinhCaNhan) {
        for (Nguoi i : list) {
            if (i.getId() == id) {
                i.setNgaySinhCaNhan(ngaySinhCaNhan);
            }
        }
    }

    public void editNgheNghiep(List<Nguoi> list, int id, String ngheNghiep) {
        for (Nguoi i : list) {
            if (i.getId() == id) {
                i.setNgheNghiep(ngheNghiep);
            }
        }
    }

    public List<Nguoi> getListOf80(List<Nguoi> list) {
        List<Nguoi> agesOf80 = new ArrayList<>();
        for (Nguoi i : list) {
            String[] split = i.getNgaySinhCaNhan().split("/");
            int year = Integer.parseInt(split[2]);

            if (year >= 80) {
                agesOf80.add(i);
            }
        }
        return agesOf80;

    }

    @Override
    public String toString() {
        return "HoDan{" +
                "thanhVienTrongHo=" + soThanhVienTrongHo +
                ", soNha='" + soNha + '\'' +
                '}';
    }
}
