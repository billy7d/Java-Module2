import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;


public class ReadCsvFile {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\Admin\\Desktop\\2.csv");

            FileReader fileReader = new FileReader(file);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            while ((line=bufferedReader.readLine())!=null){
                System.out.println(line);
            }
        } catch (Exception e){
            e.printStackTrace();

        }
    }
}
