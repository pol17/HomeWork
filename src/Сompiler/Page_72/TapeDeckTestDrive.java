package Сompiler.Page_72;

public class TapeDeckTestDrive {
    public static void main(String[] args) {

        TapeDeck t = new TapeDeck(); //добавил объект класса TapeDeck
        t.canRecord = true;
        t.playTape();

        if (t.canRecord == true) {
            t.recordTape();
        }
    }
}
