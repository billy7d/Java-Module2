import java.util.List;

public class HoDan {
    private int thanhVienTrongHo;
    private String soNha;


    public HoDan() {

    }

    public HoDan(int thanhVienTrongHo, String soNha) {
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



    public void addNguoi(List<Nguoi> list, Nguoi nguoi) {
        list.add(nguoi);
    }

    public void editHoVaTen(List<Nguoi> list, String hoVaTen, String ngaySinhCaNhan) {
        for (Nguoi i : list) {
            if (i.getNgaySinhCaNhan().equals(ngaySinhCaNhan)) {
                i.setHoVaTen(hoVaTen);
            }
        }
    }

    public void editNgaySinh(List<Nguoi> list, String hoVaTen, String ngaySinhCaNhan) {
        for (Nguoi i : list) {
            if (i.getHoVaTen().equals(hoVaTen)) {
                i.setNgaySinhCaNhan(ngaySinhCaNhan);
            }
        }
    }

    public void editNgheNghiep(List<Nguoi> list, String hoVaTen, String ngheNghiep) {
        for (Nguoi i : list) {
            if (i.getHoVaTen().equals(hoVaTen)) {
                i.setNgheNghiep(ngheNghiep);
            }
        }
    }

    public List<Nguoi> getListOf80(List<Nguoi> list, List<Nguoi> agesOf80) {
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
                ", hoVaTen='" + hoVaTen + '\'' +
                ", ngaySinhCaNhan='" + ngaySinhCaNhan + '\'' +
                ", ngheNghiep='" + ngheNghiep + '\'' +
                '}';
    }
}
