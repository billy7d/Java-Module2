import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {
  public static void readFileText(String filePath){
   try {
       File file = new File(filePath);

//       FileReader fileReader = new FileReader(file);

       if (!file.exists()) {
           throw new FileNotFoundException();
       }

       BufferedReader br = new BufferedReader(new FileReader(file));

       String line = "";

       int sum = 0;

       while ((line = br.readLine())!=null){
           System.out.println(line);
           sum+= Integer.parseInt(line);
       }

       br.close();

       System.out.println("Sum = " + sum);

   } catch (Exception e){
       e.printStackTrace();
   }

  }

    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        ReadFileExample.readFileText(path);
    }

}
