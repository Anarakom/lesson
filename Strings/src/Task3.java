import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = in.nextLine();
        String formattedInput = input.toLowerCase().replaceAll("\\s+", "");
        boolean isPalindrome = true;
        for (int i = 0, j = formattedInput.length() - 1; i < j; i++, j--) {
            if (formattedInput.charAt(i) != formattedInput.charAt(j)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("Строка является палиндромом.");
        } else {
            System.out.println("Строка не является палиндромом.");
        }
    }
}

