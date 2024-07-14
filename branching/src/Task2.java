import java.util.Scanner;
public class Task2 {
    public static void main(String[] agrs) {
        Scanner in = new Scanner(System.in);
        String field = "Transport";
        System.out.print("Сумму дахода");
        float bank = in.nextFloat();
        if (field == "Bank") {
            if (bank < 250000) {
                bank = bank * 0.1F;
            } else if (bank >= 250000 && bank <= 499999) {
                bank = bank * 0.15F;
            } else {
                bank = bank * 0.18F;
            }
            System.out.printf("Сумма выплаты налога составит :" + bank);

        } else if (field == "Health") {
            if (bank < 400000) {
                bank = bank * 0.07F;
            } else if (bank >= 400000 && bank <= 8999999) {
                bank = bank * 0.12F;
            } else {
                bank = bank * 0.15F;
            }
            System.out.printf("Сумма выплаты налога составит :" + bank);
        } else if (field == "Transport") {
            if (bank < 100000) {
                bank = bank * 0.09F;
            } else if (bank >=100000  && bank <= 299999) {
                bank = bank * 0.13F;
            } else {
                bank = bank * 0.17F;
            }
            System.out.printf("Сумма выплаты налога составит :" + bank);
        }
    }
}
