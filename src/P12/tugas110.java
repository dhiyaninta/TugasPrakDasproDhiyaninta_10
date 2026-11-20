package P12;

import java.util.Scanner;

/*
Tugas 1 (uji wajib) jumlah nilai mahasiswa 5 + (10 mod 11) = 15
Tugas 1 (uji wajib) salah satu nilai yang diinput 10 mod 100 = 10*/
public class tugas110 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0, lulus = 0, tdkLulus = 0;
        double rata;

        int jmlhMhs = 0;
        System.out.print("Masukkan banyaknya mahasiswa:  ");
        jmlhMhs = input.nextInt();

        int[] nilai = new int [jmlhMhs];
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Nilai Mahasiswa ke- " + i + ": ");
            nilai[i] = input.nextInt();
            total += nilai[i];
        }
        int tertinggi = nilai[0];

        int terendah = nilai[0];
        for (int i = 0; i < nilai.length; i++) {
            if (i > 0) {
                if (nilai[i] > tertinggi) tertinggi = nilai[i];
                if (nilai[i] < terendah) terendah = nilai[i];
            }
        }
        for (int newNilai : nilai) {
            if (newNilai > 70) {
                String status = "LULUS";
                System.out.println("Nilai lulus: " + newNilai + " (" + status + ")");
                lulus++;
            } else {
                System.out.println("nilai tidak lulus: " + newNilai + " (TIDAK LULUS)");
                tdkLulus++;
            }
        }
        rata = total/jmlhMhs;
        System.out.println("Nilai rata-rata mahasiswa: " + rata);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        
    }
    
    
}
