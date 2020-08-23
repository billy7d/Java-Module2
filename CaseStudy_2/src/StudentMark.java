import java.lang.reflect.Array;

public class StudentMark implements IStudentMark {
    private String fullName;
    private int id;
    private String className;
    private int semester;
    private float averageMark;
    double[] subjectMarkList = new double[5];



    public StudentMark (String fullName,String className, int semester,
                       double subjectMark1, double subjectMark2,
                       double subjectMark3,double subjectMark4,double subjectMark5){

        this.fullName = fullName;
        this.className = className;
        this.semester = semester;
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
        return averageMark;
    }

    public void setAverageMark(float averageMark) {
        this.averageMark = averageMark;
    }


    @Override
    public void Display() {
        System.out.println(getFullName());
        System.out.println(getId());
        System.out.println(getClassName());
        System.out.println(getSemester());
        System.out.println(getAverageMark());
    }



    public void setSubjectMarkList(double subjectMark1, double subjectMark2,
                                   double subjectMark3, double subjectMark4, double subjectMark5) {
        this.subjectMarkList = new double[]{subjectMark1,subjectMark2,subjectMark3,subjectMark4,subjectMark5};
    }

    public double avaCal(){
        double sumElements = 0;
        for (int i = 0; i < subjectMarkList.length; i++) {
            sumElements += subjectMarkList[i];
        }
        return sumElements/ subjectMarkList.length;
    }









}
