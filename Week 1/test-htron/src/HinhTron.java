import java.util.Scanner;

public class HinhTron {

        /**
         * Demo cách khai báo các constructor,
         * các thuộc tính và phương thức vẫn được giữ nguyên như bài 19,
         * bạn hãy chú ý các constructor được comment
         */

        final float PI = 3.14f;

        float r;
        float cv;
        float dt;

        // Constructor không có tham số truyền vào
        public HinhTron() {
            nhapBanKinh();  // Thử gọi hàm nhapBanKinh()
        }

        // Constructor có một tham số r truyền vào
        public HinhTron(float r) {
            this.r = r; // Gán biến r vào thuộc tính r
        }

        public void nhapBanKinh() {
            System.out.println("Hãy nhập vào Bán kính Hình tròn: ");
            Scanner scanner = new Scanner(System.in);
            r = scanner.nextFloat();
        }

        public void tinhChuVi() {
            cv = 2 * PI * r;
        }

        public void tinhDienTich() {
            dt = PI * r * r;
        }

        public void inChuVi() {
            System.out.println("Chu vi Hình tròn: " + cv);
        }

        public void inDienTich() {
            System.out.println("Diện tích Hình tròn: " + dt);
        }
    }

