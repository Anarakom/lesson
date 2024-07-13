import java.util.Scanner;
public class Task2 {
    public static void main (String[] agrs) {
        Scanner in =new Scanner(System.in);
        System.out.print("Сумму дахода");
        float Bank = in.nextFloat();
        if (Bank <  250000){
            Bank = Bank * 0.1F;
        }
        else if (Bank >= 250000 && Bank <= 499999){
            Bank = Bank * 0.15F;
        }
        else{
            Bank = Bank * 0.18F;
        }
        System.out.printf("Сумма выплаты налога составит :" + Bank );

    }
}
