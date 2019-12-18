public class PhraseOMatic_46_generator {
    public static void main(String[] args) {

        //Создаем три набора слов для выбора
        String [] wordListOne = {"стойкий", "взаимный", "обоюдный", "умный", "проникающий", "динамичный", "красивый"};
        String [] wordListTwo = {"классный", "беспечный", "упругий", "вариативный", "синий", "новый", "яркий"};
        String [] wordListThree = {"енот", "кот", "петух", "конь", "попугай", "тирг", "пингвин"};

        //Вычисляем, сколько слов в каждом списке
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        //Генерируем три случайных числа
        int random1 = (int) (Math.random() * oneLength);
        int random2 = (int) (Math.random() * twoLength);
        int random3 = (int) (Math.random() * threeLength);

        //Теперь строим фразу
        String phrase = wordListOne[random1] + " " + wordListTwo[random2] + " " + wordListThree[random3];

        //Выводим фразу на экран
        System.out.println("Все, что нам нужно, это - " + phrase);
    }
   }
