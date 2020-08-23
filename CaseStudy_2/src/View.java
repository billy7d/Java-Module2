import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentMark studentMark  = new StudentMark();
        List studentMarkInstance = new ArrayList();
        int choice;
        do {
          System.out.println(" ");
          System.out.println("Action: ");
          System.out.println("1 . Insert new Student");
          System.out.println("2. View list of Student & each of Average Mark");
          System.out.println("3. Go Back");
          System.out.println("4. Exit");


            System.out.print("Chose action: ");


            choice = scanner.nextInt();

          switch (choice){
              case 1:
                  System.out.print("Input Student's name: ");
                  String fullName = scanner.next();
                  System.out.print("Input Student's class name: ");
                  String className = scanner.next();
                  System.out.print("Input Student's semester(by number): ");
                  int semester = scanner.nextInt();
                  System.out.print("Input Student's mark of Subject 1 (by number): ");
                  float subjectMark1 = scanner.nextFloat();
                  System.out.print("Input Student's mark of Subject 2 (by number): ");
                  float subjectMark2 = scanner.nextFloat();
                  System.out.print("Input Student's mark of Subject 3 (by number): ");
                  float subjectMark3 = scanner.nextFloat();
                  System.out.print("Input Student's mark of Subject 4 (by number): ");
                  float subjectMark4 = scanner.nextFloat();
                  System.out.print("Input Student's mark of Subject 5 (by number): ");
                  float subjectMark5 = scanner.nextFloat();

                  studentMark = new StudentMark(fullName,className,semester,subjectMark1,subjectMark2,
                          subjectMark3,subjectMark4,subjectMark5);



                  studentMarkInstance.add(studentMark);
//                  System.out.println(studentMarkInstance.toString());

                  break;
              case 2:
                  for (Object i: studentMarkInstance){
                      System.out.println(i.toString());
                  }
                  studentMark.Display();

              default:


          }


      } while(choice !=4);

    }
}
