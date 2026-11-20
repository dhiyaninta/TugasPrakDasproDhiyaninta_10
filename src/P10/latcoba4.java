package P10;

import java.util.Scanner;

public class latcoba4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jmlrbac = 0, jmlhari = 0, totals = 0;

        System.out.print("Jumlah ruang baca: ");
        jmlrbac = input.nextInt();
        System.out.print("Jumlah hari: ");
        jmlhari = input.nextInt();

        if (jmlrbac < 0 || jmlhari < 0) {
            System.out.println("Jumlah ruang baca atau hari harus > 0");
        } else {
            int totmax =  -1;
            int totmin = Integer.MAX_VALUE;
            int hariramai = 0, palingramai = 0;
            
            for (int i = 1; i <= jmlrbac; i++) {
                System.out.println("Ruang " + i);
                int total = 0;
                int j = 1;
        
                while (j <= jmlhari) {
                    int Pengunjung = 0;
                    
                    do {
                        System.out.print("Pengunjung hari ke-" + j + " : ");
                        Pengunjung = input.nextInt();
                        if (Pengunjung < 0) {
                            System.out.println("Pemgunjung tidak boleh negatif, input ulang!");
                        }
                    } while (Pengunjung < 0);
                    
                    if (Pengunjung > 50) {
                        hariramai++;
                        palingramai++;
                    }
                    total += Pengunjung;
                    j++;
                }
                double rata = 0;
                rata = total/jmlhari;
                System.out.println("Ruang" + i + "- total: " + total + ", rata-rata per hari: " + rata);
                totals += total;
                if (total > totmax) {
                    totmax = total;
                    palingramai = i;
                }
                if (total < totmin) {
                    totmin = total;
                    hariramai = i;
                }
            }
            System.out.println("Total seluruh pengunjung: " + totals);
            System.out.println("Hari paling ramai: " + palingramai);
            System.out.println("Hari ramai >50: " + hariramai);
        } 
        input.close();
    }   
}