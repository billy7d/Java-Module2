import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentMark implements IStudentMark, Serializable {
    private String fullName;
    private int id;
    private String className;
    private int semester;
    private double averageMark;
    float[] subjectMarkList = new float[5];



    public StudentMark(){}

    public StudentMark (int id,String fullName,String className, int semester,
                       float subjectMark1, float subjectMark2,
                       float subjectMark3,float subjectMark4,float subjectMark5){


        this.id = id;
        this.fullName = fullName;
        this.className = className;
        this.semester = semester;
        this.averageMark = aveCal();

        setSubjectMarkList(subjectMark1,subjectMark2,subjectMark3,subjectMark4,subjectMark5);

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public float getAverageMark() {
        return aveCal();
    }

    public void setAverageMark(float averageMark) {
        this.averageMark = averageMark;
    }


    public float[] getSubjectMarkList(){
        return subjectMarkList;
    }

    public void setSubjectMarkList(float subjectMark1, float subjectMark2,
                                   float subjectMark3, float subjectMark4, float subjectMark5) {
        this.subjectMarkList = new float[]{subjectMark1,subjectMark2,subjectMark3,subjectMark4,subjectMark5};
    }


    public float aveCal(){
        float sumElements = 0;
        for (int i = 0; i < subjectMarkList.length; i++) {
            sumElements += subjectMarkList[i];
        }
        return sumElements / subjectMarkList.length;
    }


    @Override
    public void display() {
        System.out.println("Full name: "+getFullName()+", Student id: "+getId()+", Student class name: "+getClassName()+", Semester: "+getSemester()+", Average mark: "+getAverageMark());
    }


    public void editName(List<StudentMark> list, int id, String name) {
        for (StudentMark i: list){
            if (i.getId() == id){
                i.setFullName(name);
                break;
            }
        }
    }
    public void editClassName(List<StudentMark> list,int id,String className) {
        for (StudentMark i: list){
            if (i.getId() == id){
                i.setClassName(className);
                break;
            }
        }
    }
    public void editSemester(List<StudentMark> list,int id,int semester) {
        for (StudentMark i: list){
            if (i.getId() == id){
                i.setSemester(semester);
                break;
            }
        }
    }
    public void editSubjectMark_1(List<StudentMark> list,int id,float mark1) {
        for (StudentMark i: list){
            if (i.getId() == id){
                getSubjectMarkList()[0] = mark1;
                break;
            }
        }
    }
    public void editSubjectMark_2(List<StudentMark> list,int id,float mark2) {
        for (StudentMark i: list){
            if (i.getId() == id){
                getSubjectMarkList()[1] = mark2;
                break;
            }
        }
    }
    public void editSubjectMark_3(List<StudentMark> list,int id,float mark3) {
        for (StudentMark i: list){
            if (i.getId() == id){
                getSubjectMarkList()[2] = mark3;
                break;
            }
        }
    }
    public void editSubjectMark_4(List<StudentMark> list,int id,float mark4) {
        for (StudentMark i: list){
            if (i.getId() == id){
                getSubjectMarkList()[3] = mark4;
                break;
            }
        }
    }
    public void editSubjectMark_5(List<StudentMark> list,int id,float mark5) {
        for (StudentMark i: list){
            if (i.getId() == id){
                getSubjectMarkList()[4] = mark5;
                break;
            }
        }
    }

    public int checkId(List<StudentMark>list) {
            int count =0;
        for (StudentMark i : list) {
            if (i.getId()>count)
                    count=getId();
        }
        return ++count;
    }



        @Override
    public String toString() {
        return "StudentMark{" +
                "fullName='" + fullName + '\'' +
                ", id=" + this.id +
                ", className='" + className + '\'' +
                ", semester=" + semester +
                ", subjectMarkList=" + Arrays.toString(subjectMarkList) +
                ", AverageMark=" + getAverageMark() +
                '}';
    }
}
