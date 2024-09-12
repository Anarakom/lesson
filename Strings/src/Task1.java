import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int a = 0; a < 5; a++) {
            System.out.print("Введите число " + (a + 1) + ": ");
            numbers[a] = scanner.nextInt();
        }
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println("Число " + number + " - четное");
            } else {
                System.out.println("Число " + number + " - нечетное");
            }
        }
    }
}