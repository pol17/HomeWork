package Magnets;

public class DrumKitTestDrive_73 {
    public static void main(String[] args) {

        DrumKit_73 d = new DrumKit_73();
        d.snare = false;
        d.playSnare();
        d.playTopHat();

        if (d.snare == true) {
            d.playSnare();
        }
    }
}
