package OOP_Pommitamine;

/**
 * Created by ttihhano on 21.11.2015.
 */
public class Mang {
    public Mang() {
/*
    *1. mängu seadistada
    *2. Mängu tööshoidmine
    *3. Kui mäng on läbi, mis saab?
*/
        Meri meri = new Meri(10);

        Mangija mangija = new Mangija();


        while (meri.laevuOnAlles()) {
            int[] lask = mangija.kuhuLasta();/*
            boolean pihtas = meri.saiPihta(lask);
            if (pihtas) {
                mangija.pihtas();
            } else {
                mangija.moodas();
            }
*/
        }
/*
        mangija.gameover();

*/
    }
}
