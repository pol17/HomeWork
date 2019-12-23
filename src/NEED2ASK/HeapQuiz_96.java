package NEED2ASK;

public class HeapQuiz_96 {
    int id = 0;

    public static void main(String[] args) {
        int x = 0;

        HeapQuiz_96[] hq = new HeapQuiz_96[5];

        while (x < 3) {
            hq[x] = new HeapQuiz_96();
            hq[x].id = x;
            x = x + 1;
        }

        hq[3] = hq[1];
        hq[4] = hq[1];
        hq[3] = null;
        hq[4] = hq[0];
        hq[0] = hq[3];
        hq[3] = hq[2];
        hq[2] = hq[0];
        //Делаем что-то
    }
}
