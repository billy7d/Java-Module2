
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class WriteFileText {
    public static void writeFileText(String originalFilePath,String filePath){

        try {
            FileWriter fileWriter = new FileWriter(filePath);

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(ReadFileText.readFileText(originalFilePath));

            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
