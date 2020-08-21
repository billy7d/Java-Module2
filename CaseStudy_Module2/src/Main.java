public class Main {
    public static void main(String[] args) {
        WordManager wordManager = new WordManager();
        Word word = new Word("Hello");

        wordManager.addWord(word);
        System.out.println(wordManager.toString());



    }
}
