public class Boden {

    private int grundwasserAbfluss;

    private int naehrstoffe;

    public void applyWetter(WetterBeobachtung aktuellesWetter, WetterBeobachtung gestern) {
        int niederschlag = aktuellesWetter.calcNiederschlag();
        int wingeschwindigkeit = aktuellesWetter.kalkWindgeschwindigkeit();
    }


    /*Grundwasserspeicher = Grundwasserspeicher -grundwasserAbfluss - Verdunstung;


public void grundwasserAbfluss(){
    grundwasserspeicher =
}

   public int bodenwasserSpeicher(){
   int bodenwasser =  WetterBeobachtung.calcNiederschlag()-Oekosystem.interzeption()-grundwasserAbfluss();
}*/
}

