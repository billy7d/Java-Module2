import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFileText {
    public static String readFileText(String filePath) {
        String line = "";
        try{
            File file = new File(filePath);

            FileReader  fileReader = new FileReader(file);

            if (!file.exists()) throw new FileNotFoundException();

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine())!=null) {
                System.out.println(line);
            }
            bufferedReader.close();




        } catch (Exception e){
            e.getStackTrace();
        }

        return line;
    }


}
