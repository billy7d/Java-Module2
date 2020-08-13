import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap source file nguon: ");
        String sourceFilePath = scanner.nextLine();

        System.out.print("Nhap source file target: ");
        String sourceFileTarget = scanner.nextLine();

        ReadFileText.readFileText(sourceFilePath);
        WriteFileText.writeFileText(sourceFilePath,sourceFileTarget);
    }
}
