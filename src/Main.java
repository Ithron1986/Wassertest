public class Main {

    public static void main(String[] args) {

        Oekosystem o = new Oekosystem();

        WetterBeobachtung montag = new WetterBeobachtung(5, 5, 5);
        WetterBeobachtung dienstag = new WetterBeobachtung(9, 4, 5);

        WetterGenerator wetterGenerator = new WetterGenerator();
        WetterBeobachtung gestern = wetterGenerator.generate();

        WetterBeobachtung heute = wetterGenerator.generate();



        Boden b = new Boden();

        b.applyWetter(heute, gestern);

        System.out.println(w.kalkBewoelkung());


        //asdfasdf




        /*
         * o.pflanzen = new Pflanze[10]; o.pflanzen[0] = new Pflanze();
         * o.pflanzen[0].growth(1, 1, 1); for (int i = 0; i < o.pflanzen.length; i ++) {
         *
         * System.out.println(o.pflanzen[i].size); }
         */
        /*
         * naehrstoffe = 1.0; wasser = 1.0; energie = 1.0;
         *
         *
         *
         * //Pflanzenwachstum for wachstum = 0; wachstum <50;i++){ if (naehrstoffe =>1
         * && wasser =>1 && energie=> 1) { wachstum = wachstum + 1;
         * System.out.println("Deine Pflanze ist gewachsen"); }else { wachstum =
         * wachstum; System.out.println("Deine Pflanze ist nicht gewachsen ihr fehlt: "
         * + if (naehrstoffe < 1) { System.out.print("Dünger");} + if (wasser < 1) {
         * System.out.print("Wasser");} + if (energie < 1) {
         * System.out.print("Sonne");}); /* nw
         *
         * System.out.println("Deine Pflanze ist nicht gewachsen ihr fehlt: ") if
         * (naehrstoffe < 1) { System.out.print("Dünger ");}
         *
         *
         * } }
         */

    }
}
