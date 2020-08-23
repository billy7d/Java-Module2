import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentMark studentMark;
        List studentMarkInstance;
        int choice;
        do {
          System.out.println("Action: ");
          System.out.println("1 . Insert new Student");
          System.out.println("2. View list of Student & each of Average Mark");
          System.out.println("3. Go Back");
          System.out.println("4. Exit");

//          choice = Integer.parseInt(scanner.nextLine());
            choice = scanner.nextInt();

          switch (choice){
              case 1:
                  System.out.print("Input Student's name: ");
                  String fullName = scanner.nextLine();
                  System.out.print("Input Student's class name: ");
                  String className = scanner.nextLine();
                  System.out.print("Input Student's semester(by number): ");
                  int semester = scanner.nextInt();
                  System.out.print("Input Student's mark of Subject 1 (by number): ");
                  double subjectMark1 = scanner.nextDouble();
                  System.out.print("Input Student's mark of Subject 2 (by number): ");
                  double subjectMark2 = scanner.nextDouble();
                  System.out.print("Input Student's mark of Subject 3 (by number): ");
                  double subjectMark3 = scanner.nextDouble();
                  System.out.print("Input Student's mark of Subject 4 (by number): ");
                  double subjectMark4 = scanner.nextDouble();
                  System.out.print("Input Student's mark of Subject 5 (by number): ");
                  double subjectMark5 = scanner.nextDouble();

                  studentMark = new StudentMark(fullName,className,semester,subjectMark1,subjectMark2,
                          subjectMark3,subjectMark4,subjectMark5);

                  studentMarkInstance = new ArrayList();

                  studentMarkInstance.add(studentMark);
                  System.out.println(studentMarkInstance.toString());

                  break;

          }


      } while(choice !=4);

    }
}
