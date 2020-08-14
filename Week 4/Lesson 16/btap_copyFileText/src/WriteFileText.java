
import java.io.*;


public class WriteFileText {
    public static void writeFileText(String originalFilePath,String filePath){

        try {
            File file = new File(filePath);

            OutputStream  outputStream = new FileOutputStream(file);

            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);


            for (String i: ReadFileText.readFileText(originalFilePath)){
                outputStreamWriter.write(i+"\n");
            }



            outputStreamWriter.close();


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
