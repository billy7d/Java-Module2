import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class View {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        StudentMark studentMark = new StudentMark();
        MenuService menuService = new MenuService();
        List<StudentMark> studentMarkInstance = new ArrayList<>();
        IO io = new IO();
        String filePath;
        studentMarkInstance = io.readFile();
        int ID = 0;






        String choice;
        String subMenuChoice;


        do {
            System.out.println("-------");
            System.out.println(" ");
            System.out.println("Action: ");
            System.out.println("1. Insert new Student");
            System.out.println("2. View list of Student & each of Average Mark");
            System.out.println("3. Edit: ");
            System.out.println("4. Delete subject mark");
            System.out.println("0. Exit Application");


            System.out.print("Chose action: ");
            choice = scanner.nextLine();


            switch (choice) {
                case "1":

                    System.out.print("Input Student's name: ");
                    String fullName = scanner.nextLine();

                    System.out.print("Input Student's class name: ");
                    String className = scanner.nextLine();

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

                    studentMark = new StudentMark(menuService.checkId(studentMarkInstance), fullName, className, semester, subjectMark1, subjectMark2,
                            subjectMark3, subjectMark4, subjectMark5);
                    ID++;

                    studentMarkInstance.add(studentMark);
                    break;

                case "2":
                    for (Object i : studentMarkInstance) {
                        System.out.println(i.toString());

                    }
                    studentMark.display();
                    break;

                case "3":
                    do {
                        System.out.println("-------");
                        System.out.println(" ");
                        System.out.println("1. Edit Student name: ");
                        System.out.println("2. Edit Student class name: ");
                        System.out.println("3. Edit Student class semester: ");
                        System.out.println("4. Edit Student mark of 1st Subject: ");
                        System.out.println("5. Edit Student mark of 2nd Subject: ");
                        System.out.println("6. Edit Student mark of 3rd Subject: ");
                        System.out.println("7. Edit Student mark of 4th Subject: ");
                        System.out.println("8. Edit Student mark of 5th Subject: ");
                        System.out.println("0. Go Back ");

                        System.out.print("Chose action: ");
                        subMenuChoice = scanner.nextLine();

                        switch (subMenuChoice) {
                            case "1":
                                System.out.print("Input Student ID to edit: ");
                                int id = scanner.nextInt();
                                scanner.nextLine();
                                System.out.print("Input Student name to edit: ");
                                String name = scanner.nextLine();
                                menuService.editName(studentMarkInstance, id, name);
                                break;

                            case "2":
                                System.out.print("Input Student ID to edit: ");
                                int id2 = scanner.nextInt();
                                scanner.nextLine();
                                System.out.println("Input new class name: ");
                                String className1 = scanner.nextLine();
                                menuService.editClassName(studentMarkInstance, id2, className1);
                                break;
                            case "3":
                                System.out.print("Input Student ID to edit: ");
                                int id3 = scanner.nextInt();
                                scanner.nextLine();
                                System.out.println("Intput new class semester: ");
                                int newSemester = scanner.nextInt();
                                menuService.editSemester(studentMarkInstance, id3, newSemester);
                                break;
                            case "4":
                                System.out.print("Input Student ID to edit: ");
                                int id4 = scanner.nextInt();
                                scanner.nextLine();
                                System.out.println("Intput new Subject 1st mark: ");
                                float newSubjectMark1 = scanner.nextFloat();
                                menuService.editSubjectMark_1(studentMarkInstance, id4, newSubjectMark1);
                                break;
                            case "5":
                                System.out.print("Input Student ID to edit: ");
                                int id5 = scanner.nextInt();
                                scanner.nextLine();
                                System.out.println("Intput new Subject 2nd mark: ");
                                float newSubjectMark2 = scanner.nextFloat();
                                menuService.editSubjectMark_2(studentMarkInstance, id5, newSubjectMark2);
                                break;
                            case "6":
                                System.out.print("Input Student ID to edit: ");
                                int id6 = scanner.nextInt();
                                scanner.nextLine();
                                System.out.println("Intput new Subject 3rd mark: ");
                                float newSubjectMark3 = scanner.nextFloat();
                                menuService.editSubjectMark_3(studentMarkInstance, id6, newSubjectMark3);
                                break;
                            case "7":
                                System.out.print("Input Student ID to edit: ");
                                int id7 = scanner.nextInt();
                                scanner.nextLine();
                                System.out.println("Intput new Subject 4th mark: ");
                                float newSubjectMark4 = scanner.nextFloat();
                                menuService.editSubjectMark_4(studentMarkInstance, id7, newSubjectMark4);
                                break;
                            case "8":
                                System.out.print("Input Student ID to edit: ");
                                int id8 = scanner.nextInt();
                                scanner.nextLine();
                                System.out.println("Intput new Subject 5th mark: ");
                                float newSubjectMark5 = scanner.nextFloat();
                                menuService.editSubjectMark_5(studentMarkInstance, id8, newSubjectMark5);
                                break;
                            case "0":

                                break;


                        }

                        break;


                    } while (!subMenuChoice.equals("0"));
                    break;

                case "4":
                    System.out.println("Input an id of student mark to delete");
                    int id4 = scanner.nextInt();
                    scanner.nextLine();
                    menuService.remove(studentMarkInstance,id4);

                    break;


                case "0":
                    System.out.println("In put file path to save: ");
                    filePath = scanner.nextLine();
                    io.writeFile(studentMarkInstance);
                    break;

            }
        }
        while (!choice.equals("0"));

    }



}



