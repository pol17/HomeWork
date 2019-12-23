public class Dog_104 {

    public static void main(String[] args) {

    Dog_104 d = new Dog_104();
    //вызываем метод bark из ссылки на объект Dog_104 и передаем ему значение 3 (в качестве аргумента для метода). Биты, представляющие целочисленное значение 3, передаются в метод bark
    d.bark(3);
    }

    void bark(int numOfBarks) { //биты размещаются в параметре numOfBarks (переменная типа int)
        while (numOfBarks > 0) { //используем параметр numOfBarks в качестве переменной внутри метода
            System.out.println("Гав!");
            numOfBarks = numOfBarks - 1;
        }
    }
}
