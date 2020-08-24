import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Nguoi> list = new ArrayList<>();
        Nguoi nguoi = new Nguoi("abc","20/5/94",1234);
        KhachSan khachSan = new KhachSan();
        khachSan.addCustomer(list,nguoi);
    }
}
