public class NhanVienParttime extends NhanVien {
    private double soGioLamViec;




    public NhanVienParttime(int idNhanVien, String hoVaTen, int age, int phoneNumber, String email) {
        super(idNhanVien, hoVaTen, age, phoneNumber, email);

    }

    public NhanVienParttime(int idNhanVien, String hoVaTen, int age, int phoneNumber, String email, double soGioLamViec) {
        super(idNhanVien, hoVaTen, age, phoneNumber, email);
        this.soGioLamViec = soGioLamViec;
    }



    public double getSoGioLamViec() {
        return soGioLamViec;
    }

    public void setSoGioLamViec(double soGioLamViec) {
        this.soGioLamViec = soGioLamViec;
    }

    @Override
    public int getIdNhanVien() {
        return super.getIdNhanVien();
    }

    @Override
    public void setIdNhanVien(int idNhanVien) {
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
}
