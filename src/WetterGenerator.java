import java.util.ArrayList;
import java.util.List;

public class WetterGenerator {
    private List<WetterBeobachtung> wetterfolge = new ArrayList<>();

    public WetterBeobachtung generate() {
        if (wetterfolge.size() < 7) {
            int temperatur = zufallsGenerator(30, -20);
            WetterBeobachtung wetterTag1 = new WetterBeobachtung(temperatur,
                    zufallsGenerator(40, -40),
                    zufallsGenerator(12, 0)
            );
            wetterfolge.add(wetterTag1);
            return wetterTag1;

        }


        return null;

    }

    private int zufallsGenerator(int maximum, int minimum) {
        // minimum = 5 max = 50  => 0 * (50 - 5) + 5  ; 1 * (50 - 5) + 5
        return (int) (Math.random() * (maximum - minimum) + minimum);

    }

    //public void postHinzufügen(String text) {
    //        this.posts[ersterFreierIndex] = new Statusmeldung(text, this);
    //        ersterFreierIndex++;
    //    }
}
