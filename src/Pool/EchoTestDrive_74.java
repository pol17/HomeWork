package Pool;

public class EchoTestDrive_74 {
    public static void main(String[] args) {

        Echo_74 e1 = new Echo_74();
        Echo_74 e2 = new Echo_74();
        int x = 0;

        while (x < 4) {
            e1.hello();
            e1.count = e1.count + 1;

            if (x == 3) {
                e2.count = e2.count + 1;
            }

            if (x > 0) {
                e2.count = e2.count + e1.count;
            }

            x = x +1;
        }

        System.out.println(e2.count);
    }
}
