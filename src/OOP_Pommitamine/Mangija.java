package OOP_Pommitamine;

import java.util.Scanner;

/**
 * Created by ttihhano on 21.11.2015.
 */
public class Mangija {
    private Scanner sc = new Scanner(System.in);

    public int[] kuhuLasta() {
        System.out.println("Sisesta kordinaadid formaadis yyy-xxx");
        String[] input = sc.nextLine().split("-");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        return new int[]{x, y};
    }

    public void pihtas() {
        System.out.println("Said pihta");
    }

    public void moodas() {
        System.out.println("Ei saanud pihta");
    }

    public void gameover() {
        System.out.println("Mäng läbi");
    }
}
