import java.util.Arrays;

public class StudentMark implements IStudentMark {
    private String fullName;
    private int id;
    private String className;
    private int semester;
    private double averageMark;
    float[] subjectMarkList = new float[5];


    public StudentMark(){}

    public StudentMark (String fullName,String className, int semester,
                       float subjectMark1, float subjectMark2,
                       float subjectMark3,float subjectMark4,float subjectMark5){

        this.id = ++this.id;
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


    @Override
    public void Display() {
        System.out.println(getFullName()+", "+getId()+", "+getClassName()+", "+getSemester()+", "+getAverageMark());
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
        return sumElements/ subjectMarkList.length;
    }


    @Override
    public String toString() {
        return "StudentMark{" +
                "fullName='" + fullName + '\'' +
                ", id=" + id +
                ", className='" + className + '\'' +
                ", semester=" + semester +
                ", subjectMarkList=" + Arrays.toString(subjectMarkList) +
                ", AverageMark=" + getAverageMark() +
                '}';
    }
}
