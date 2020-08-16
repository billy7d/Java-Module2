import java.io.*;
import java.util.Scanner;

public class InputOutputBinary {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap source path: ");
        String source = scanner.nextLine();

        System.out.print("Nhap target path: ");
        String target = scanner.nextLine();

        InputStream inputStream = null;
        OutputStream outputStream = null;
        try{
            inputStream = new FileInputStream(source);
            outputStream = new FileOutputStream(target);


            byte[] bytes = new byte[1024];
            int i= -1;
            while ((i = inputStream.read(bytes))!=-1){
                outputStream.write(bytes);
            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            inputStream.close();
            outputStream.close();

        }

    }





}

