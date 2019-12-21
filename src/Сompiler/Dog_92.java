package Сompiler;

public class Dog_92 {
    String name;

    public static void main(String[] args) {

        //Создаем объект Dog и получаем к нему доступ
        Dog_92 dog1 = new Dog_92();
        dog1.bark();
        dog1.name = "Барт";

        //Теперь создадим массив типа Dog
        Dog_92[] myDogs = new Dog_92[3];

        //и поместим его в несколько элементов
        myDogs[0] = new Dog_92();
        myDogs[1] = new Dog_92();
        myDogs[2] = dog1;

        //Теперь получаем доступ к объектам Dog с помощью ссылок из массива
        myDogs[0].name = "Фред";
        myDogs[1].name = "Джордж";

        //Хммм... какое имя у myDog[2]?
        System.out.print("Имя последней собаки - ");
        System.out.println(myDogs[2].name);

        //Теперь переберем все элементы массива и вызовем для каждого метод bark()
        int x = 0;
        while (x < myDogs.length) { //массивы содержат переменную length, которая предоставляет количество хранимых элементов
            myDogs[x].bark();
            x = x +1;
        }
    }

    public void bark() {
        System.out.println(name + " сказал Гав!");
    }

    public void eat() {}
    public void chaseCat() {}
}
