public class NhanVien {
    private int idNhanVien;
    private String hoVaTen;
    private int age;
    private int phoneNumber;
    private String email;

    public NhanVien(int idNhanVien, String hoVaTen, int age, int phoneNumber, String email) {
        this.idNhanVien = idNhanVien;
        this.hoVaTen = hoVaTen;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public int getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(int idNhanVien) {
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
}

