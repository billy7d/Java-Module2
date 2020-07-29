import java.util.Scanner;

public class findValueInArray {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a student name: ");
        String name = scanner.nextLine();

        boolean isExist = false;
        for (int i=0;i<students.length;i++) {
            if (students[i].equals(name)) {

                System.out.println("Position of student" + name + " is: " + (i + 1));
                isExist = true;
                break;
            }
        }
        if (isExist == false)
            System.out.println("Not found " + name + " in the list.");


    }
}
