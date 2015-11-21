package OOP_Pommitamine;

import sun.plugin.javascript.navig.Array;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by ttihhano on 21.11.2015.
 */
public class Laev {
    private int laevaPikkus;
    private int[] kordinaadid;
    private boolean elus = true;
    public Laev(int pikkus, int lauaServaPikkus) {
        laevaPikkus = pikkus;
        genereeriKordinaadid(lauaServaPikkus);
    }

    private void genereeriKordinaadid(int lauaServaPikkus) {
        Random rand = new Random();
        int x = rand.nextInt(lauaServaPikkus);
        int y = rand.nextInt(lauaServaPikkus);
        kordinaadid = new int[]{x, y};
    }
    public boolean oledElus() {
        return elus;
    }

    public boolean kasTabas(int[] lask) {
        if (Arrays.equals(kordinaadid, lask)){
            elus = false;
            return true;
        }
        return false;
    }


    public boolean oledSiin(int x, int y) {
        if (x == kordinaadid[0] && y == kordinaadid[1]){
            return true;
        }
        return false;
    }
}
