public class MovieTestDrive_67 {
    public static void main(String[] args) {

        Movie_67 one = new Movie_67();
        one.title = "Как приручить Дракона";
        one.genre = "Мультик";
        one.rating = +5;

        Movie_67 two = new Movie_67();
        two.title = "Убить Билла";
        two.genre = "Боевик";
        two.rating = +1;
        two.playIt(); //тут еще вызвали метод playI()

        Movie_67 three = new Movie_67();
        three.title = "Дети Кукурузы";
        three.genre = "Ужасы";
        three.rating = -2;
    }
}
