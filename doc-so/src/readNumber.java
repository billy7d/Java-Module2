import java.util.Scanner;

public class readNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao 1 so de doc: ");

        int number = scanner.nextInt();
        int hangDonVi = number % 10;
        int hangChuc = (number / 10) - (hangDonVi / 10);
        int hangTram = (number - ((hangChuc * 10) + hangDonVi)) / 100;
        String docHangTram ="";
        String docHangChuc = "";
        String docHangDonVi = "";

//        if (number >= 0 && number < 10) {
//            switch (number) {
//                case 0:
//                    System.out.println("old");
//                    break;
//                case 1:
//                    System.out.println("one");
//                    break;
//                case 2:
//                    System.out.println("two");
//                    break;
//                case 3:
//                    System.out.println("three");
//                    break;
//                case 4:
//                    System.out.println("four");
//                    break;
//                case 5:
//                    System.out.println("five");
//                    break;
//                case 6:
//                    System.out.println("six");
//                    break;
//                case 7:
//                    System.out.println("seven");
//                    break;
//                case 8:
//                    System.out.println("eight");
//                    break;
//                case 9:
//                    System.out.println("nine");
//                    break;
//
//            }
//        } else if (number >= 10 && number < 20) {
//            switch (hangDonVi) {
//                case 0:
//                    System.out.println("ten");
//                    break;
//                case 1:
//                    System.out.println("eleven");
//                    break;
//                case 2:
//                    System.out.println("twelve");
//                    break;
//                case 3:
//                    System.out.println("thirteen");
//                    break;
//                case 4:
//                    System.out.println("fourteen");
//                    break;
//                case 5:
//                    System.out.println("fifteen");
//                    break;
//                case 6:
//                    System.out.println("sixteen");
//                    break;
//                case 7:
//                    System.out.println("seventeen");
//                    break;
//                case 8:
//                    System.out.println("eighteen");
//                    break;
//                case 9:
//                    System.out.println("nineteen");
//                    break;
//            }
//        } else if (number >= 20 && number < 100) {
//            switch (hangChuc) {
//                case 2:
//                    docHangChuc = "twenty";
//                    break;
//                case 3:
//                    docHangChuc = "thirty";
//                    break;
//                case 4:
//                    docHangChuc = "forty";
//                    break;
//                case 5:
//                    docHangChuc = "fifty";
//                    break;
//                case 6:
//                    docHangChuc = "sixty";
//                    break;
//                case 7:
//                    docHangChuc = "seventy";
//                    break;
//                case 8:
//                    docHangChuc = "eighty";
//                    break;
//                case 9:
//                    docHangChuc = "nighty";
//                    break;
//            }
//
//            switch (hangDonVi) {
//                case 1:
//                    docHangDonVi = "one";
//                    break;
//                case 2:
//                    docHangDonVi = "two";
//                    break;
//                case 3:
//                    docHangDonVi = "three";
//                    break;
//                case 4:
//                    docHangDonVi = "four";
//                    break;
//                case 5:
//                    docHangDonVi = "five";
//                    break;
//                case 6:
//                    docHangDonVi = "six";
//                    break;
//                case 7:
//                    docHangDonVi = "seven";
//                    break;
//                case 8:
//                    docHangDonVi = "eight";
//                    break;
//                case 9:
//                    docHangDonVi = "nine";
//                    break;
//
//            }
//            System.out.println(docHangChuc + docHangDonVi);
//        }
         if (number >= 100 && number < 1000) {

            switch (hangTram) {
                case 1:
                    docHangTram = "one hundred";
                    break;
                case 2:
                    docHangTram = "two hundred";
                    break;
                case 3:
                    docHangTram = "three hundred";
                    break;
                case 4:
                    docHangTram = "four hundred";
                    break;
                case 5:
                    docHangTram = "five hundred";
                    break;
                case 6:
                    docHangTram = "six hundred";
                    break;
                case 7:
                    docHangTram = "seven hundred";
                    break;
                case 8:
                    docHangTram = "eight hundred";
                    break;
                case 9:
                    docHangTram = "nine hundred";
                    break;

            }
            System.out.println(docHangTram);
        }
    }
}
