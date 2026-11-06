package P3;

import java.util.Scanner;

public class GajiKaryawan10 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int gajiPokok;
        int bonus, totGaji;
        int tunjTans = 600000;
        int tunjMkn = 400000;

        gajiPokok = input.nextInt();
        bonus = (int) 0.05 * gajiPokok;
        totGaji = gajiPokok + tunjTans + tunjMkn + bonus - ((int)0.1 * gajiPokok);

        System.out.println("Bonus Bulanan anda adalah Rp. " + bonus);
        System.out.println("Gaji yang diterima adalah Rp. " + totGaji);

    }

    
}
