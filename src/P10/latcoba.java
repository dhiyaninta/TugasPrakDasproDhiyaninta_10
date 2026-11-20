package P10;

import java.util.Scanner;

public class latcoba {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0, tertinggi= 100, terendah = 0, lulus = 0, tidakLulus = 0;
        double rata = 0, total = 0;

        System.out.print("Masukkan jumlah Mahasiswa: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            int nilai;
            do {
                System.out.print("Masukkan nilai Mahasiswa ke-" + i + ": ");
                nilai = input.nextInt();
                if (nilai <0 || nilai > 100) {
                     System.out.println("Nilai tidak valid input ulang");
                }
            } while (nilai <0 || nilai > 100);
                total += nilai;
                if (i == 1){
                    tertinggi = nilai;
                    terendah = nilai;
                } else{
                    if (nilai > tertinggi) {
                        tertinggi = nilai;
                    }else {
                        terendah = nilai;
                    }
                }
                if (nilai >= 60) {
                    lulus++;
                } else{
                    tidakLulus++;
                }
                rata = total/n;
        } 
        System.out.println("Rata-rata: " + rata);
        System.out.println("Nilai Tertinggi: " + tertinggi);
        System.out.println("Nilai Terendah: " + terendah);
        System.out.println("Lulus (>=60): " + lulus);
        System.out.println("Tidak Lulus: " + tidakLulus);
    }
}
