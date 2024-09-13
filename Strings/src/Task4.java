import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Введите предложение: ");
        String sentence = in.nextLine().toLowerCase();
        System.out.print("Введите слово для подсчета: ");
        String wordToCount = in.nextLine().toLowerCase();
        String[] words = sentence.split("\\s+");
        int count = 0;
        for (String word : words) {
            if (word.equals(wordToCount)) {
                count++;
            }
        }
        System.out.println("Слово '" + wordToCount + "' встречается " + count + " раз(а) в предложении.");
    }
}