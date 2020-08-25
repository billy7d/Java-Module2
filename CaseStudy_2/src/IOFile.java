import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class IOFile {

    public  void writeFile(List<StudentMark> list) throws IOException {

        ObjectOutputStream objectOutputStream = null;
            try {
                objectOutputStream = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Admin\\Desktop\\1.txt"));

                objectOutputStream.writeObject(list);
                objectOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

    }

    public  ArrayList<StudentMark> readFile() throws IOException {
        ObjectInputStream objectInputStream = null;

        try {
            objectInputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\Admin\\Desktop\\1.txt"));


           List<StudentMark> list = (List<StudentMark>) objectInputStream.readObject();
            objectInputStream.close();
            return (ArrayList<StudentMark>) list;

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }
}











