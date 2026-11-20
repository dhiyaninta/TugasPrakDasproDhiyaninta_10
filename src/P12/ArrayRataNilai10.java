package P12;
/*
Percobaan 3 (uji wajib
tambahan)
salah satu nilai yang diinput 30 + (10 mod 71)=40
 */
import java.util.Scanner;

public class ArrayRataNilai10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int[] nilaiMhs = new int[input.nextInt()];
        int total = 0;
        double rata2;
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = input.nextInt();
            total += nilaiMhs[i];
        }
        rata2 = (double) total / nilaiMhs.length;
        System.out.println("Total nilai: " + total);
        System.out.println("Rata-rata: " + rata2);
        int tertinggi = nilaiMhs[0];

        int terendah = nilaiMhs[0];
        int lulus = 0;
        
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (i > 0) {
                if (nilaiMhs[i] > tertinggi) tertinggi = nilaiMhs[i];
                if (nilaiMhs[i] < terendah) terendah = nilaiMhs[i];
            }
            if (nilaiMhs [i] > 70)
                lulus++;
        }
        
        if (rata2 >= 85 && rata2 <=100) {
            System.out.println("Predikat kelas: SANGAT BAIK");
        } else if (rata2 >= 70 && rata2 < 85) {
            System.out.println("Predikat kelas: BAIK");        
        } else {
            System.out.println("Predikat kelas: PERLU PENDAMPINGAN");
        }
        
        {
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa yang lulus: " + lulus);
        }
    }
}
