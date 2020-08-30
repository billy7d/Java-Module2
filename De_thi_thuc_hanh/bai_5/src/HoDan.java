import java.util.ArrayList;
import java.util.List;

public class HoDan {
    private int idHodan;
    private int soThanhVienTrongHo;
    private String soNha;
    private List<Nguoi> nguoiTrongHoDan = new ArrayList<>();


    public HoDan() {

    }

    public HoDan(int id, int soThanhVienTrongHo, String soNha,List<Nguoi> nguoiTrongHoDan) {
        this.idHodan = id;
        this.soThanhVienTrongHo = soThanhVienTrongHo;
        this.soNha = soNha;
        this.nguoiTrongHoDan = nguoiTrongHoDan;

    }

    public List<Nguoi> getNguoiTrongHoDan() {
        return nguoiTrongHoDan;
    }
    public void setNguoiTrongHoDan(List<Nguoi> nguoiTrongHoDan) {
        this.nguoiTrongHoDan = nguoiTrongHoDan;
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

    public void setNguoiNaoTrongHoDan(List<HoDan> hoDans,List<Nguoi> nguois){
       for (HoDan hoDan: hoDans){
           for (Nguoi nguoi:nguois){
               if (nguoi.getIdHoDan()== hoDan.getIdHodan()&&!nguoiTrongHoDan.contains(nguoi)){
                   nguoiTrongHoDan.add(nguoi);
               }
           }
       }
    }

    public List<Nguoi> getNguoiNaoTrongHoDan(){
        return nguoiTrongHoDan;
    }



    public void editHoVaTen(List<Nguoi> list, int id, String hoVaTen) {
        for (Nguoi i : list) {
            if (i.getIdCaNhan() == id) {
                i.setHoVaTen(hoVaTen);
            }
        }
    }

    public void editNgaySinh(List<Nguoi> list,int id, String ngaySinhCaNhan) {
        for (Nguoi i : list) {
            if (i.getIdCaNhan() == id) {
                i.setNgaySinhCaNhan(ngaySinhCaNhan);
            }
        }
    }

    public void editNgheNghiep(List<Nguoi> list, int id, String ngheNghiep) {
        for (Nguoi i : list) {
            if (i.getIdCaNhan() == id) {
                i.setNgheNghiep(ngheNghiep);
            }
        }
    }



    public List<Nguoi> getListOf80(List<Nguoi> list) throws ArrayIndexOutOfBoundsException{
        List<Nguoi> agesOf80 = new ArrayList<>();
       try {


           for (Nguoi i : list) {
               String[] split = i.getNgaySinhCaNhan().split("/");
               int year = Integer.parseInt(split[2]);

               if (year >= 80) {
                   agesOf80.add(i);
               }
           }

       }catch (ArrayIndexOutOfBoundsException e){
           System.out.println("Invalid input, input again!!!");
       }
        return agesOf80;
    }


    @Override
    public String toString() {
        return "HoDan{" +
                "idHodan=" + idHodan +
                ", soThanhVienTrongHo=" + soThanhVienTrongHo +
                ", soNha='" + soNha + '\'' +
                ", nguoiTrongHoDan=" + nguoiTrongHoDan +
                '}';
    }
}
