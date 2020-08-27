import java.util.ArrayList;
import java.util.List;

public class Nguoi {
    private String hoVaTen;
    private String ngaySinhCaNhan;
    private String ngheNghiep;

    public Nguoi(){}

    public Nguoi(String hoVaTen, String ngaySinhCaNhan,String ngheNghiep){
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





}




