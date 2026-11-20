package P10;

import java.util.Scanner;

public class latcoba2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jmlKantin = 0;
        int jmlHari = 0;
        int totsmua = 0;
        
        System.out.print("Masukkan jumlah kantin: ");
        jmlKantin = input.nextInt();
        System.out.print("Masukkan jumlah hari: ");
        jmlHari = input.nextInt();

        if (jmlKantin <= 0 || jmlHari <= 0){
                System.out.println("jumlah kantin dan hariharus > 0");
        } else {
            int maxtotal = -1;
            int minTotal = Integer.MAX_VALUE;
            int kantinterbaik = 0, sepi = 0;
            int i = 1;
            while (i <= jmlKantin) {
                System.out.println("Kantin " + i);
                int total = 0;
                for (int j = 1; j <= jmlHari; j++) {
                    int pendapatan = 0;
                    do {
                        System.out.print("Pandapatan hari ke-" + j + ": ");
                        pendapatan = input.nextInt();
                        if(pendapatan < 0){
                            System.out.println("Pendapatan tidak boleh negatif, input ulang!");
                        }
                    } while (pendapatan < 0);
                    if (pendapatan < 100) {
                        sepi++;
                    }
                    total += pendapatan;
                }
                double rata;
                rata = total/jmlHari;
                System.out.println("Kantin "+ i + " - " + "total: " +total + " - "+ "Rata/hari: " + rata);
                totsmua += total;
                if (total > maxtotal) {
                    maxtotal = total;
                    kantinterbaik = i;
                }
                if (total < 100) {
                    minTotal = total;
                    sepi = i;   
                }
                i++;       
            }
            System.out.println("Total seluruh kantin: " + totsmua);
            System.out.println("Kantin terbaik: " + kantinterbaik );
            System.out.println("Hari sepi (< 100): " + sepi);
        }
        input.close();
    }
}
