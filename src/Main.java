import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("This is the AV Club! Type any sentence");
        String userInput = scanner.nextLine();

        String[] wordsArray = userInput.split(" ");

        for (int i = 0; i < wordsArray.length; i++) {
            if (wordsArray[i].contains("av")) {
                System.out.println(wordsArray[i]);
            }
        }
    }
}