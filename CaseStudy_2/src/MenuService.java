

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MenuService {
    StudentMark studentMark = new StudentMark();
    public void remove(List<StudentMark> list, int id){
        List<StudentMark> toRemove = new ArrayList<>();


        for (StudentMark i:list){
            if (i.getId() == id){
                toRemove.add(i);
            }
        }
        list.removeAll(toRemove);
    }

    public void editName(List<StudentMark> list, int id, String name) {
        for (StudentMark i: list){
            if (i.getId() == id){
                i.setFullName(name);
                break;
            }
        }
    }
    public void editClassName(List<StudentMark> list, int id, String className) {
        for (StudentMark i: list){
            if (i.getId() == id){
                i.setClassName(className);
                break;
            }
        }
    }
    public void editSemester(List<StudentMark> list, int id, int semester) {
        for (StudentMark i: list){
            if (i.getId() == id){
                i.setSemester(semester);
                break;
            }
        }
    }
    public void editSubjectMark_1(List<StudentMark> list, int id, float mark1) {
        for (StudentMark i: list){
            if (i.getId() == id){
                studentMark.getSubjectMarkList()[0] = mark1;
                break;
            }
        }
    }
    public void editSubjectMark_2(List<StudentMark> list, int id, float mark2) {
        for (StudentMark i: list){
            if (i.getId() == id){
                studentMark.getSubjectMarkList()[1] = mark2;
                break;
            }
        }
    }
    public void editSubjectMark_3(List<StudentMark> list, int id, float mark3) {
        for (StudentMark i: list){
            if (i.getId() == id){
                studentMark.getSubjectMarkList()[2] = mark3;
                break;
            }
        }
    }
    public void editSubjectMark_4(List<StudentMark> list, int id, float mark4) {
        for (StudentMark i: list){
            if (i.getId() == id){
                studentMark.getSubjectMarkList()[3] = mark4;
                break;
            }
        }
    }
    public void editSubjectMark_5(List<StudentMark> list, int id, float mark5) {
        for (StudentMark i: list){
            if (i.getId() == id){
                studentMark.getSubjectMarkList()[4] = mark5;
                break;
            }
        }
    }

    public int checkId(List<StudentMark>list) {
        int count =0;
        for (StudentMark i : list) {
            if (i.getId()>count)
                count=i.getId();
        }
        return ++count;
    }


    public static class IOFile {

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
}
