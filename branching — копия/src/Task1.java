import java.util.Scanner;
class Task1 {
    public static void main(String[] args) {
                int num ;
                Scanner in =new Scanner(System.in);
                System.out.print("Введите отценку");
                num = in.nextInt();
                if ( num >= 1 && num <= 25 ) {
                    System.out.println("Плохо!!");
                } else if ( num >= 26 && num <= 50 ) {
                    System.out.println("Ниже среднего ");
                } else if ( num >= 51 && num <= 75 ) {
                    System.out.println("Выше среднего");
                } else if ( num >= 76 && num <= 100 ) {
                    System.out.println("Отлично !!");
                } else {
                    System.out.println("Ошибка!");
                }


    }
    }