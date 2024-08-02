public class Task2 {
    public static void main(String[] args) {
        int[] numbers = {0, 22, 8, 89, 52, 14, 96, 58, 85, 56};

        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        int a  =  sum / numbers.length;

        System.out.println("Сумма чисел: " + sum);
        System.out.println("Среднее значение чисел: " + a);
    }
}
