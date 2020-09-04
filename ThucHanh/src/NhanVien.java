public class NhanVien {
    private String idNhanVien;
    private String hoVaTen;
    private int age;
    private int phoneNumber;
    private String email;
    private double luongThucLinh;

    public NhanVien(String idNhanVien, String hoVaTen, int age, int phoneNumber, String email) {
        this.idNhanVien = idNhanVien;
        this.hoVaTen = hoVaTen;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;

    }
    public NhanVien(String idNhanVien, String hoVaTen, int age, int phoneNumber, String email,double luongThucTinh) {
        this.idNhanVien = idNhanVien;
        this.hoVaTen = hoVaTen;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.luongThucLinh = luongThucTinh;

    }

    public String getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(String idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getLuongThucLinh() {
        return luongThucLinh;
    }

    public void setLuongThucLinh(double luongThucLinh) {
        this.luongThucLinh = luongThucLinh;
    }


    @Override
    public String toString() {
        return " " +
                "idNhanVien='" + idNhanVien + '\'' +
                ", hoVaTen='" + hoVaTen + '\'' +
                ", age=" + age +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ' ';
    }
}

