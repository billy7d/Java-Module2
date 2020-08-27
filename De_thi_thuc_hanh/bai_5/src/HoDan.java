import java.util.ArrayList;
import java.util.List;

public class HoDan {
    private int idHodan;
    private int thanhVienTrongHo;
    private String soNha;


    public HoDan() {

    }

    public HoDan(int id, int thanhVienTrongHo, String soNha) {
        this.idHodan = id;
        this.thanhVienTrongHo = thanhVienTrongHo;
        this.soNha = soNha;

    }

    public int getThanhVienTrongHo() {
        return thanhVienTrongHo;
    }

    public void setThanhVienTrongHo(int thanhVienTrongHo) {
        this.thanhVienTrongHo = thanhVienTrongHo;
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
                "thanhVienTrongHo=" + thanhVienTrongHo +
                ", soNha='" + soNha + '\'' +
                '}';
    }
}
