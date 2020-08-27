import java.util.ArrayList;
import java.util.List;

public class Nguoi {
    private int id;
    private String hoVaTen;
    private String ngaySinhCaNhan;
    private String ngheNghiep;

    public Nguoi(){}

    public Nguoi(int id,String hoVaTen, String ngaySinhCaNhan,String ngheNghiep){
        this.id = id;
        this.hoVaTen = hoVaTen;
        this.ngaySinhCaNhan = ngaySinhCaNhan;
        this.ngheNghiep = ngheNghiep;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getNgaySinhCaNhan() {
        return ngaySinhCaNhan;
    }

    public void setNgaySinhCaNhan(String ngaySinhCaNhan) {
        this.ngaySinhCaNhan = ngaySinhCaNhan;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "id=" + id +
                ", hoVaTen='" + hoVaTen + '\'' +
                ", ngaySinhCaNhan='" + ngaySinhCaNhan + '\'' +
                ", ngheNghiep='" + ngheNghiep + '\'' +
                '}';
    }
}




