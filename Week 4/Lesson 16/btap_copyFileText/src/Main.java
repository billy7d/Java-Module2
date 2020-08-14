import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap source file nguon: ");
        String sourceFilePath = scanner.nextLine();

        System.out.print("Nhap source file target: ");
        String sourceFileTarget = scanner.nextLine();

        ReadFileText.readFileText(sourceFilePath,arrayList);
        WriteFileText.writeFileText(sourceFileTarget,arrayList);


    }
}
