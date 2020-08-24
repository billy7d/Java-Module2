import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentMark studentMark = new StudentMark();
        List<StudentMark> studentMarkInstance = new ArrayList<>();

        int choice;
        int subMenuChoice;
        int ID = 1;
        do {
            System.out.println("-------");
            System.out.println(" ");
            System.out.println("Action: ");
            System.out.println("1. Insert new Student");
            System.out.println("2. View list of Student & each of Average Mark");
            System.out.println("3. Edit: ");
            System.out.println("0. Exit Application");


            System.out.print("Chose action: ");
            choice = scanner.nextInt();

            switch (choice) {
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

                    studentMark = new StudentMark(ID, fullName, className, semester, subjectMark1, subjectMark2,
                            subjectMark3, subjectMark4, subjectMark5);

                    ID++;


                    studentMarkInstance.add(studentMark);

                    break;
                case 2:
                    for (Object i : studentMarkInstance) {
                        System.out.println(i.toString());

                    }
                    studentMark.display();
                    break;

                case 3:
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

                        subMenuChoice = scanner.nextInt();

                        switch (subMenuChoice) {
                            case 1:
                                System.out.print("Input Student ID to edit: ");
                                int id = scanner.nextInt();
                                System.out.print("Input Student name to edit: ");
                                String name = scanner.next();
                                studentMark.editName(studentMarkInstance, id, name);
                                break;

                            case 2:
                                System.out.print("Input Student ID to edit: ");
                                int id2 = scanner.nextInt();
                                System.out.println("Input new class name: ");
                                String className1 = scanner.next();
                                studentMark.editClassName(studentMarkInstance, id2, className1);
                                break;
                            case 3:
                                System.out.print("Input Student ID to edit: ");
                                int id3 = scanner.nextInt();
                                System.out.println("Intput new class semester: ");
                                int newSemester = scanner.nextInt();
                                studentMark.editSemester(studentMarkInstance, id3, newSemester);
                                break;
                            case 4:
                                System.out.print("Input Student ID to edit: ");
                                int id4 = scanner.nextInt();
                                System.out.println("Intput new Subject 1st mark: ");
                                float newSubjectMark1 = scanner.nextFloat();
                                studentMark.editSubjectMark_1(studentMarkInstance, id4, newSubjectMark1);
                                break;
                            case 5:
                                System.out.print("Input Student ID to edit: ");
                                int id5 = scanner.nextInt();
                                System.out.println("Intput new Subject 2nd mark: ");
                                float newSubjectMark2 = scanner.nextFloat();
                                studentMark.editSubjectMark_2(studentMarkInstance, id5, newSubjectMark2);
                                break;
                            case 6:
                                System.out.print("Input Student ID to edit: ");
                                int id6 = scanner.nextInt();
                                System.out.println("Intput new Subject 3rd mark: ");
                                float newSubjectMark3 = scanner.nextFloat();
                                studentMark.editSubjectMark_3(studentMarkInstance, id6, newSubjectMark3);
                                break;
                            case 7:
                                System.out.print("Input Student ID to edit: ");
                                int id7 = scanner.nextInt();
                                System.out.println("Intput new Subject 4th mark: ");
                                float newSubjectMark4 = scanner.nextFloat();
                                studentMark.editSubjectMark_4(studentMarkInstance, id7, newSubjectMark4);
                                break;
                            case 8:
                                System.out.print("Input Student ID to edit: ");
                                int id8 = scanner.nextInt();
                                System.out.println("Intput new Subject 5th mark: ");
                                float newSubjectMark5 = scanner.nextFloat();
                                studentMark.editSubjectMark_5(studentMarkInstance, id8, newSubjectMark5);
                                break;
                            default:
                                if (subMenuChoice == 0)
                                    System.out.println(" ");

                                else if (subMenuChoice != 0 || subMenuChoice != 1 || subMenuChoice != 2 || subMenuChoice != 3
                                        || subMenuChoice != 4 || subMenuChoice != 5 || subMenuChoice != 6
                                        || subMenuChoice != 7 || subMenuChoice != 8) {
                                        System.out.println("Invalid option !!! ");
                                }
                                break;

                        }

                        break;


                    } while (subMenuChoice != 0);


                default:
                    if (choice == 0)
                        System.out.println(" ");
                    else if (choice != 0 || choice != 1 || choice != 2 || choice != 3) {
                        System.out.println("Invalid option !!! ");
                    }
                    break;


            }
        }
            while (choice != 0) ;

        }

    }


