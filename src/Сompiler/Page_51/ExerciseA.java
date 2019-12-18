package Сompiler.Page_51;

public class ExerciseA {
    public static void main(String[] args) {

        //выводим текст с шагом в 1, когда Х больше 3х (от 1 до 10). Итого 7 раз (Когда Х = 4, ..., Х = 10)
        int x = 1;

        while (x < 10) {
            x = x + 1; //дописана строка

            if (x > 3) {
                System.out.println("большой икс");
            }
        }
    }
}
