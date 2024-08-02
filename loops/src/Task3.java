public class Task3 {
    public static void main(String[] args) {
        int[] numbers = {230, 5, 82, 56, 0, 15, 80, 6, 99, 44};

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        int ii = numbers[1];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[0]) {
                ii = numbers[i];
                break;
            }
        }

        System.out.println("Второй наименьший элемент: " + ii);
    }
}