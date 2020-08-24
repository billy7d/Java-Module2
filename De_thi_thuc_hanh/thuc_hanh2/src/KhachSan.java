import java.util.ArrayList;
import java.util.List;

public class KhachSan {
    private int soNgayTro;
    private String loaiPhongTro;
    private double giaPhong;
    private String customerInfo;
    List<Nguoi> list = new ArrayList<>();
    Nguoi nguoi = new Nguoi();


    public int getSoNgayTro() {
        return soNgayTro;
    }

    public void setSoNgayTro(int soNgayTro) {
        this.soNgayTro = soNgayTro;
    }

    public String getLoaiPhongTro() {
        return loaiPhongTro;
    }

    public void setLoaiPhongTro(String loaiPhongTro) {
        this.loaiPhongTro = loaiPhongTro;
    }

    public double getGiaPhong() {
        return giaPhong;
    }

    public void setGiaPhong(double giaPhong) {
        this.giaPhong = giaPhong;
    }

    public String getCustomerInfo() {
        return customerInfo;
    }

    public void setCustomerInfo(String customerInfo) {
        this.customerInfo = customerInfo;
    }

    public void addCustomer(List list, Nguoi nguoi){
        list.add(nguoi);

    }

    public void removeCustomer(List<Nguoi> list, int id){
        for (Nguoi i:list){
            if (i.getId() == id){
                list.remove(i);
            }
        }
    }

    public void display(List<Nguoi> list){
        for (Nguoi i:list){
            System.out.println(i);
        }
    }

    public double checkOutFee(List<Nguoi> list, int id){
        for (Nguoi i:list){
            if (i.getId()==id){
                System.out.println("khach hang: " +i.toString()+ " hoa don thanh toan: "+(getSoNgayTro()*getGiaPhong()));
            }

        }
        return getSoNgayTro()*getGiaPhong();
    }


}
