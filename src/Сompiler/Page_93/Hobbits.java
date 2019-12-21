package Сompiler.Page_93;

public class Hobbits {
    String name;

    public static void main(String[] args) {

        Hobbits[] h = new Hobbits[3];
        int z = -1; //0 меняем на -1, ведь z+1 должен = 0, что выполнилось первое условие и вывело "Бильбо"

        while (z < 2) { //4 меняем на 2, ведь нам нужно вывести 3 условия: 0 = "Бильбо", 1 = "Фродо", 2 = "Сэм"
            z = z + 1;
            h[z] = new Hobbits();
            h[z].name = "Бильбо";

            if (z == 1) {
                h[z].name = "Фродо";
            }

            if (z == 2) {
                h[z].name = "Сэм";
            }

            System.out.print(h[z].name + " - ");
            System.out.println("имя хорошего хоббита");
        }
    }
}
