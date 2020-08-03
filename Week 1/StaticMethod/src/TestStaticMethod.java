public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();

        Student s1 = new Student(111,"Lam");
        Student s2 = new Student(222,"Tung");
        Student s3 = new Student(333,"Hai");

        s1.display();
        s2.display();
        s3.display();

    }
}
