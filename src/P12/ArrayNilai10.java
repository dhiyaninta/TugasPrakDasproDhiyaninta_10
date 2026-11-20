package P12;
/*
Percobaan 2 (uji wajib
tambahan)
salah satu nilai yang diinput 60 + (10 mod 41) = 70
 */
import java.util.Scanner;

public class ArrayNilai10 {
    public static void main(String[] args) {
        int[] nilaiAkhir = new int[10];
        Scanner input = new Scanner(System.in); 
        int jmlhLulus = 0, tdkLulus = 0;
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = input.nextInt();
        }

        for (int nilai : nilaiAkhir) {
            if (nilai > 70) {
                String status = "LULUS";
                System.out.println("Nilai lulus: " + nilai + " (" + status + ")");
                jmlhLulus++;
            } else {
                tdkLulus++;
            }
        }
        System.out.println("Jumlah lulus: " + jmlhLulus);
        System.out.println("Jumlah tidak lulus: " + tdkLulus);
    }
}