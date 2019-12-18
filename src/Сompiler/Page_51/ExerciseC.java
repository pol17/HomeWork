package Сompiler.Page_51;

public class ExerciseC {
    public static void main(String[] args) {

        //выводим текст с шагом в 1, когда Х меньше 3х (от 5 до 1). Итого 2 раза (когда Х = 2, Х = 1)
        int x = 5;

        while (x > 1) {
            x = x - 1;

            if (x < 3) {
                System.out.println("большой икс"); //заменен текст ("маленький" на "большой") из-за override из ExerciseB
            }
        }
    }
}
