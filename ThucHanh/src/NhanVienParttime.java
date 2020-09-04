public class NhanVienParttime extends NhanVien {
    private double soGioLamViec;
    private double luongThucLinhPt;


    public NhanVienParttime(String idNhanVienPartTime, String hoVaTen, int age, int phoneNumber, String email, double soGioLamViec) {
        super(idNhanVienPartTime, hoVaTen, age, phoneNumber, email);
        this.soGioLamViec = soGioLamViec;
    }


    public NhanVienParttime(String idNhanVien, String hoVaTen, int age, int phoneNumber, String email,double soGioLamViec, double luongThucLinhPt) {
        super(idNhanVien, hoVaTen, age, phoneNumber, email);
        this.soGioLamViec = soGioLamViec;
        this.luongThucLinhPt = luongThucLinhPt;

    }

    public String getIdNhanVienPartTime() {
        return super.getIdNhanVien();
    }

    public void setIdNhanVienPartTime(String idNhanVien) {
        super.setIdNhanVien(idNhanVien);
    }

    public double getSoGioLamViec() {
        return soGioLamViec;
    }

    public void setSoGioLamViec(double soGioLamViec) {
        this.soGioLamViec = soGioLamViec;
    }


    public double getLuongThucTinhPt() {
        return super.getLuongThucTinh();
    }


    public void setLuongThucTinhPt(double luongThucTinhPt) {
        super.setLuongThucTinh(luongThucTinhPt);
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


}
