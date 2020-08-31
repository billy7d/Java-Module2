import java.util.ArrayList;

public class HocSinh {
    private String hoVaTen;
    private String dob;
    private String queQuan;
    private String tenLop;

    public HocSinh(){

    }

    public HocSinh(String hoVaTen,String dob, String queQuan,String tenLop){
        this.hoVaTen = hoVaTen;
        this.dob = dob;
        this.queQuan =queQuan;
        this.tenLop = tenLop;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public void addHocsinhVaoList(ArrayList<HocSinh> allHocsinhs,HocSinh hocSinh){
        allHocsinhs.add(hocSinh);
    }

    @Override
    public String toString() {
        return "HocSinh{" +
                "hoVaTen='" + hoVaTen + '\'' +
                ", dob='" + dob + '\'' +
                ", queQuan='" + queQuan + '\'' +
                ", tenLop='" + tenLop + '\'' +
                '}';
    }
}
