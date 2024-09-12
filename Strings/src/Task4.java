import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите предложение: ");
        String sentence = scanner.nextLine().toLowerCase();
        String[] words = sentence.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            int count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = "";
                }
            }
            if (!words[i].equals("")) {
                System.out.println("Слово '" + words[i] + "' встречается " + count + " раз(а).");
            }
        }
        System.out.print("Введите количество элементов в массиве: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        if (size > 1) {
            System.out.println("Второй наименьший элемент массива: " + array[1]);
        } else {
            System.out.println("Массив слишком мал для поиска второго наименьшего элемента.");
        }
    }
}
