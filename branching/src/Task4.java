public class Task4 {
    public static void main(String[]agrs) {
        int num = 1;
        int balans = 7;
        int Cola = 6;
        int Pepsi = 2;
        int Lays = 4;
        int Burn =8;
        int Ice = 1;
        int costCoal = 4;
        int costPepsi = 3;
        int costLays = 5;
        int costBurn = 6;
        int costIce = 2 ;


        switch (num) {
            case 1:
                System.out.println("Вы выбрали Cola цена:" + costCoal + "$");
                break;
            case 2:
                System.out.println("Вы выбрали Pepsi цена:" + costPepsi + "$");
                break;
            case 3:
                System.out.println("Вы выбрали Lays цена:" + costLays + "$");
                break;
            case 4:
                System.out.println("Вы выбрали Burn цена:" + costBurn + "$");
                break;
            case 5:
                System.out.println("Вы выбрали Ice цена:" + costIce + "$");
                break;
            default:
                System.out.println("Несуществующий выбор! Ошибка !");
        }
            if (Cola > 0 && balans > costCoal  ) {
                Cola--;
                System.out.println("Покупка одобрена с балланса снята :"+ costCoal + "$");
            }
            else
                System.out.println("Ошибка!\n+Недопустимая Операция");



    System.out.println("Доступно :\n" +
            "1.Cola кол: " + Cola + ". Цена: " + costCoal + "$" + "\n" +
            "2.Pepsi кол: " + Pepsi + ". Цена: "+ costPepsi + "$" + "\n" +
            "3.Lays кол: " + Lays + ". Цена: " + costLays + "$" + "\n" +
            "4.Burn кол: " + Burn + ". Цена: " + costBurn + "$" + "\n" +
            "5.Ice кол: " + Ice + ". Цена: " + costIce + "$" );
    }

    }

