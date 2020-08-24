public class Nguoi {
    private String name;
    private String dob;
    private int id;

    public Nguoi(){}

    public Nguoi(String name,String dob,int id){
        this.name = name;
        this.dob = dob;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
