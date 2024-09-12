public class Task3 {
    public static void main(String[]agrs) {
        int balans = 4350;
        int operation = 5000;
        int limit = 1000;
        int totalBalans;
        if (operation <= limit  && operation % 20 == 0 && operation <= balans ) {
            totalBalans = balans - operation;
            System.out.printf("Остаток на счете:" + totalBalans);
        }
        else

        System.out.println("Недопустимая операция! Баланс: " + balans);


    }
}
