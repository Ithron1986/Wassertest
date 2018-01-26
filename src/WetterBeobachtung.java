public class WetterBeobachtung {
    private int maxsonnenstundenJahreszeit;
    private double temperatur;
    private int windgeschwindigkeit;

    public WetterBeobachtung(int temperatur, int windgeschwindigkeit, int maxsonnenstundenJahreszeit) {
        this.setTemperatur(temperatur);
        this.setWindgeschwindigkeit(windgeschwindigkeit);
        this.maxsonnenstundenJahreszeit = maxsonnenstundenJahreszeit; //wird irgendwann durch eine Funktion übernommen;
    }

    public double kalkBewoelkung() {
        return Math.random() * maxsonnenstundenJahreszeit;
    }

    public int kalkWindgeschwindigkeit() {
        return 0;
    }

    public double randomNiederschlagsmenge() {
        return (Math.random() * 799 + 1);

    }


    public int sonnenscheindauer() {
        int bewoelkung = (int) kalkBewoelkung();
        return maxsonnenstundenJahreszeit - bewoelkung;
    }


    // die Temperatur hängt von der Jahreszeit ab und soll am Ende auch abhängig von der des vorherigen Tages sein
    public void setTemperatur(double newTemperature) {
        this.temperatur = newTemperature;
    }

    double getTemperatur() {
        return this.temperatur;
    }

    public int calcNiederschlag() {
        double bewoelkung = kalkBewoelkung();
        if (bewoelkung < 1) {
            return 0;
        } else if (bewoelkung < 20) {
            double niederschlagsmengeCalc = randomNiederschlagsmenge() * bewoelkung;
            return (int) niederschlagsmengeCalc;
        } else {
            return (int) randomNiederschlagsmenge();
        }
    }

    public void setWindgeschwindigkeit(int newWindgeschwindigkeit) {
        this.windgeschwindigkeit = newWindgeschwindigkeit;
    }
}
