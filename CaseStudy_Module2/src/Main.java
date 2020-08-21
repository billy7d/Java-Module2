import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WordManager wordManager;
        Word word;
        List<Word> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int choseOption;



        while (true) {
            System.out.println("Menu: ");
            System.out.println("1:  Add Word");
            System.out.println("2: Remove Word");
            System.out.println("3: Find Word");
            System.out.println("4: Show words");
            System.out.println("0: Exit");

            choseOption = Integer.parseInt(scanner.nextLine());

                switch (choseOption) {
                    case 1:

                        System.out.println("Type a word that you want to add: ");
                        String addWord = scanner.nextLine();
                        wordManager = new WordManager();
                        word = new Word(addWord);
                        wordManager.addWord(list,word);
                        break;

                    case 2:
                        System.out.println("Type a  word that you want to remove: ");
                        String removeWord = scanner.nextLine();
                        wordManager = new WordManager();
                        wordManager.removeWord(list,removeWord);
                        break;

                    case 3:
                        System.out.println("Type a word to find: ");
                        String findWord = scanner.nextLine();
                        wordManager = new WordManager();
                        wordManager.findWord(list,findWord);
                        break;

                    case 4:
                        wordManager = new WordManager();
                        wordManager.showWords(list);
                        break;


                    case 0:
                        System.exit(0);


                    default:
                        System.out.println("Input again: ");
                        break;
                }



        }
    }
}
