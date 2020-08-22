import java.lang.reflect.Array;

public class StudentMark implements IStudentMark {
    private String fullName;
    private int id;
    private String className;
    private int semester;
    private float averageMark;

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

    Array int[] subject


}
