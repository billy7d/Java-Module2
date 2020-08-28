public class Nguoi {
    private int idCaNhan;
    private int idHoDan;
    private String hoVaTen;
    private String ngaySinhCaNhan;
    private String ngheNghiep;

    public Nguoi(){}

    public Nguoi(int idCaNhan,int idHoDan,String hoVaTen, String ngaySinhCaNhan,String ngheNghiep){
        this.idCaNhan = idCaNhan;
        this.idHoDan = idHoDan;
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

    public int getIdCaNhan() {
        return idCaNhan;
    }

    public void setIdCaNhan(int idCaNhan) {
        this.idCaNhan = idCaNhan;
    }

    public int getIdHoDan() {
        return idHoDan;
    }

    public void setIdHoDan(int idHoDan) {
        this.idHoDan = idHoDan;
    }



    @Override
    public String toString() {
        return "Nguoi{" +
                "id=" + idCaNhan +
                ", hoVaTen='" + hoVaTen + '\'' +
                ", ngaySinhCaNhan='" + ngaySinhCaNhan + '\'' +
                ", ngheNghiep='" + ngheNghiep + '\'' +
                '}';
    }
}




