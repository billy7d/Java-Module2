public class NhanVienFullTime extends NhanVien {

    private double soTienThuong;
    private double soTienPhat;
    private double luongCung;
    private double luongThucLinh;




    public NhanVienFullTime(String idNhanVienFullTime, String hoVaTen, int age, int phoneNumber, String email, double soTienThuong, double soTienPhat, double luongCung) {
        super(idNhanVienFullTime, hoVaTen, age, phoneNumber, email);
        this.soTienThuong = soTienThuong;
        this.soTienPhat = soTienPhat;
        this.luongCung = luongCung;
    }

    public NhanVienFullTime(String idNhanVien, String hoVaTen, int age, int phoneNumber, String email,  double soTienThuong, double soTienPhat, double luongCung,double luongThucLinh) {
        super(idNhanVien, hoVaTen, age, phoneNumber, email,luongThucLinh);
        this.soTienThuong = soTienThuong;
        this.soTienPhat = soTienPhat;
        this.luongCung = luongCung;
        this.luongThucLinh =luongThucLinh;
    }

    public double getSoTienThuong() {
        return soTienThuong;
    }

    public void setSoTienThuong(double soTienThuong) {
        this.soTienThuong = soTienThuong;
    }

    public double getSoTienPhat() {
        return soTienPhat;
    }

    public void setSoTienPhat(double soTienPhat) {
        this.soTienPhat = soTienPhat;
    }

    public double getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(double luongCung) {
        this.luongCung = luongCung;
    }



    public double getLuongThucLinhFt() {
        return luongThucLinh;
    }

    public void setLuongThucLinhFt(double luongThucLinh) {
        this.luongThucLinh = luongThucLinh;
    }

    public String getIdNhanVienFullTime() {
        return super.getIdNhanVien();
    }

    public void setIdNhanVienFullTime(String idNhanVien) {
        super.setIdNhanVien(idNhanVien);
    }

    @Override
    public String getHoVaTen() {
        return super.getHoVaTen();
    }

    @Override
    public void setHoVaTen(String hoVaTen) {
        super.setHoVaTen(hoVaTen);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public int getPhoneNumber() {
        return super.getPhoneNumber();
    }

    @Override
    public void setPhoneNumber(int phoneNumber) {
        super.setPhoneNumber(phoneNumber);
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email);
    }

    @Override
    public String toString() {
        return "NhanVienFullTime{" +
                super.toString()+
                "soTienThuong=" + soTienThuong +
                ", soTienPhat=" + soTienPhat +
                ", luongCung=" + luongCung +
                ", luongThucLinh=" + luongThucLinh +
                '}';
    }
}
