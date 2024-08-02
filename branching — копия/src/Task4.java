public class Task4 {
    public static void main(String[]agrs) {
        int num = 2;
        int balans = 7;
        int cola = 6;
        int pepsi = 2;
        int lays = 4;
        int burn =8;
        int ice = 1;
        int costCoal = 4;
        int costPepsi = 3;
        int costLays = 5;
        int costBurn = 6;
        int costIce = 2 ;


        switch (num) {
            case 1:
                System.out.println("Вы выбрали Cola цена:" + costCoal + "$");
                if (cola > 0 && balans > costCoal  ) {
                    cola--;
                    System.out.println("Покупка одобрена с балланса снята :"+ costCoal + "$");
                }
                else
                    System.out.println("Ошибка!\n+Недопустимая Операция");
                break;
            case 2:
                System.out.println("Вы выбрали Pepsi цена:" + costPepsi + "$");
                if (pepsi > 0 && balans > costPepsi  ) {
                    pepsi--;
                    System.out.println("Покупка одобрена с балланса снята :"+ costPepsi + "$");
                }
                else
                    System.out.println("Ошибка!\n+Недопустимая Операция");
                break;
            case 3:
                System.out.println("Вы выбрали Lays цена:" + costLays + "$");
                if (lays > 0 && balans > costLays  ) {
                    lays--;
                    System.out.println("Покупка одобрена с балланса снята :"+ costLays + "$");
                }
                else
                    System.out.println("Ошибка!\n+Недопустимая Операция");
                break;
            case 4:
                System.out.println("Вы выбрали Burn цена:" + costBurn + "$");
                if (burn > 0 && balans > costBurn  ) {
                    burn--;
                    System.out.println("Покупка одобрена с балланса снята :"+ costBurn + "$");
                }
                else
                    System.out.println("Ошибка!\n+Недопустимая Операция");
                break;
            case 5:
                System.out.println("Вы выбрали Ice цена:" + costIce + "$");
                if (ice > 0 && balans > costIce  ) {
                    ice--;
                    System.out.println("Покупка одобрена с балланса снята :"+ costIce + "$");
                }
                else
                    System.out.println("Ошибка!\n+Недопустимая Операция");
                break;
            default:
                System.out.println("Несуществующий выбор! Ошибка !");
        }
    System.out.println("Доступно :\n" +
            "1.Cola кол: " + cola + ". Цена: " + costCoal + "$" + "\n" +
            "2.Pepsi кол: " + pepsi + ". Цена: "+ costPepsi + "$" + "\n" +
            "3.Lays кол: " + lays + ". Цена: " + costLays + "$" + "\n" +
            "4.Burn кол: " + burn + ". Цена: " + costBurn + "$" + "\n" +
            "5.Ice кол: " + ice + ". Цена: " + costIce + "$" );
    }

    }

