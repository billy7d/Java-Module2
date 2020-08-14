
import java.io.*;
import java.util.ArrayList;


public class WriteFileText {
    public static void writeFileText( String filePath,ArrayList<String> arr){

        try {
            File file = new File(filePath);

            OutputStream  outputStream = new FileOutputStream(file);

            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);


            for (String i:arr){
                outputStreamWriter.write(i+"\n");
            }
            outputStreamWriter.close();


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
