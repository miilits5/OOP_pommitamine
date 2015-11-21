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
    public Laev(int pikkus, int lauaServaPikkus) {
        laevaPikkus = pikkus;
        genereeriKordinaadid(lauaServaPikkus);
    }

    private void genereeriKordinaadid(int lauaServaPikkus) {
        Random rand = new Random();
        int x = rand.nextInt(lauaServaPikkus);
        int y = rand.nextInt(lauaServaPikkus);
        kordinaadid = new int[]{x, y};
        System.out.println(Arrays.toString(kordinaadid));
    }
}
