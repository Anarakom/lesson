import java.util.Scanner;
public class Task2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сообщение для шифровки: ");
        String message = scanner.nextLine();
        System.out.print("Введите шифр (сдвиг): ");
        int shift = scanner.nextInt();
        char[] chars = message.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'А' : 'а';
                chars[i] = (char) ((c - base + shift )  + base);
            }
        }
        String encryptedMessage = new String(chars);
        System.out.println(String.format("Исходное сообщение: %s, зашифрованное сообщение: %s, шифр: %d",
                message, encryptedMessage, shift));
    }
}
