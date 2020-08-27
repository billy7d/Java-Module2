import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        List<Nguoi> nguois = new ArrayList<>();
        List<HoDan> hoDans = new ArrayList<>();
        Nguoi nguoi;
        HoDan hoDan;
        KhuPho khuPho;
        int choice;
        do {
            System.out.println("1. Add Ho dan: ");
            System.out.println("2. Sua Ho dan: ");
            System.out.println("3. Print Ho dan: ");
            System.out.println("4. Print Ho dan co nguoi tren 80 tuoi: ");
            System.out.println("0. Exit");

            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    hoDan = new HoDan(4,"a301");
                    khuPho = new KhuPho();
                    khuPho.addHoDan(hoDans,hoDan);
                    break;
            }

        } while (choice !=0);
    }
}
