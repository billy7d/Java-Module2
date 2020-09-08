import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOFile {
    public  void writeFile(List<NhanVien> list) throws IOException {

        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Admin\\Desktop\\1.txt"));
            objectOutputStream.writeObject(list);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public ArrayList<NhanVien> readFile() throws IOException {
        ObjectInputStream objectInputStream = null;

        try {
            objectInputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\Admin\\Desktop\\1.txt"));

            List<NhanVien> list = (List<NhanVien>) objectInputStream.readObject();
            objectInputStream.close();
            return (ArrayList<NhanVien>) list;

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }
}
