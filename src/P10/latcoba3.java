package P10;

import java.util.Scanner;

public class latcoba3 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int n = 0, tertinggi = 0, terendah = 0, remidi = 0, tuntas =0;
        double rata = 0, total = 0;

        System.out.print("Jumlah Mahasiswa: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            int nilai;
            do {
                System.out.print("Nilai tugas ke-" + i + " : ");
                nilai = input.nextInt();
                if( nilai < 0 || nilai > 100){
                    System.out.println("Nilai harus 0-100. Ulangi input!");
                }
            } while (nilai < 0 || nilai > 100);
            total += nilai;
            if (i == 1) {
                tertinggi = nilai;
                terendah = nilai;
            } else {
                if (nilai >  tertinggi) {
                    tertinggi = nilai;
                }
                if (nilai < terendah) {
                    terendah = nilai;
                }
            }
            if (nilai >= 70) {
                tuntas++;
            } else{
                remidi++;
            }
            rata = total/n;
        } 
        System.out.println("Rata-rata: " + rata);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Tuntas(>=70): " + tuntas);
        System.out.println("Remidi: " + remidi);
    }
}
