
public class Task1 {
    public static void main(String[] agrs) {
                String[] names = {"John", "Bob", "Mary", "Peter", "Sarah", "Antony", "Joh", "Sasha"};

                System.out.println("for:");
                for (String name : names) {
                    if (name.length() < 4) {
                        System.out.println("Ваше имя короче 4 букв" );
                    } else if (name.length() > 4) {
                        System.out.println("Ваше имя длиннее 4 букв");
                    } else {
                        System.out.println("Ваше имя состоит из 4 букв");
                    }
                }

                System.out.println("while:");
                int i = 0;
                while (i < names.length) {
                    if (names[i].length() < 4) {
                        System.out.println("Ваше имя короче 4 букв");
                    } else if (names[i].length() > 4) {
                        System.out.println("Ваше имя длиннее 4 букв");
                    } else {
                        System.out.println("Ваше имя состоит из 4 букв");
                    }
                    i++;
                }

                System.out.println("do-while:");
                int j = 0;
                do {
                    if (names[j].length() < 4) {
                        System.out.println("Ваше имя короче 4 букв");
                    } else if (names[j].length() > 4) {
                        System.out.println("Ваше имя длиннее 4 букв");
                    } else {
                        System.out.println("Ваше имя состоит из 4 букв");
                    }
                    j++;
                } while (j < names.length);
            }
        }