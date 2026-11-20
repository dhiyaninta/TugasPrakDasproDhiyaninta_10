package P12;
/*
Percobaan 4 Bagian A (uji wajib
tambahan)
key 50 + (10 mod 50)= 60
 */
import java.util.Scanner;

public class SearchNilai10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int elemen = 0;
        System.out.print("Masukkan elemen:");
        elemen = input.nextInt();

        int[] nilai = new int [elemen];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Nilai elemen ke- " + i + ": ");
            nilai[i] = input.nextInt();

        }
        System.out.print("Masukkan nilai key: ");
        int key = input.nextInt();

        boolean ditemukan = false;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i]== key) {
                ditemukan = true;
                System.out.println("Nilai " + key +" ditemukan pada indeks ke- " + i );
                break;
            }
        }

            
        if (!ditemukan) {
            System.out.println("Nilai " + key + " Tidak ditemukan.");
        }
    }
}