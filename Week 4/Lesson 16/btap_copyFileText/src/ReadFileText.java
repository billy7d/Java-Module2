import java.io.*;
import java.util.ArrayList;

public class ReadFileText {

    public static void readFileText(String filePath,ArrayList<String> arrayList) {

        try{
            File file = new File(filePath);

            InputStream inputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);


            if (!file.exists()) throw new FileNotFoundException();

            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String line ="";
            while ((line = bufferedReader.readLine())!=null) {
                arrayList.add(line);
            }

            bufferedReader.close();

        } catch (Exception e){
            e.getStackTrace();
        }


    }


}
