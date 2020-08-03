import java.sql.SQLOutput;
import java.util.Scanner;

public class inHinh {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1. Hinh chu nhat");
        System.out.println("2. Hinh tam giac");
        System.out.println("0. Exit");

        int choice;

       do {
           System.out.println(" ");
           System.out.print("Chon hinh can ve: ");
           choice = scanner.nextInt();
       switch (choice){
           case 1:
           for (int i =1;i<=3;i++) {
               System.out.println(" ");
               for (int j = 1; j <= 7; j++) {
                   System.out.print("*");

               }
           }break;
           case 2:
               for (int i = 1; i<=5; i++){
                   System.out.println(" ");
                   for (int j = 1;j<=i;j++){
                       System.out.print("*");
                   }
               }
               break;
           case 3:
               for (int i =5;i>=1;i--){
                   System.out.println(" ");
                   for (int j =1;j<=i;j++){
                       System.out.print("*");
                   }
               } break;
           }
       } while (choice!= 0);



    }
}
