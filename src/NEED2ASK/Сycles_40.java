package NEED2ASK;

public class Сycles_40 {

    public static void main(String[] args) {

        //Сделать что-то
        int x = 3;
        String name = "Кинжал";
        x = x * 17;
        System.out.println("x равен " + x);
        double d = Math.random();

        //Делать что-то снова и снова
        while (x > 12) {
            x = x - 1;
        }
        for (x = 0; x < 10; x = x +1) { //for (int x = 0; ...
            System.out.println("Теперь х равен " + x);
        }

        //Сделать что-то при условии
        if (x == 10) {
            System.out.println("х должен быть равен 10");
        } else {
            System.out.println("х не равен 10");
        }

        if ((x > 3) & (name.equals("Кинжал"))) {
            System.out.println("Осторожно");
        }

        System.out.println("Эта строка выполняется в любом случае");
    }
}
