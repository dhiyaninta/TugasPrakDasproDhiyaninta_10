package P10;
import java.util.Scanner;

public class Tugas310 {
    public static void main(String[] args) {
        Scanner Alderts = new Scanner(System.in);

        int jmlToko = 0;
        do {
            System.out.print("Masukkan jumlah toko: ");
            jmlToko = Alderts.nextInt();
        } while (jmlToko < 1);
        int totalBarang = 0;
        int maxBarang = 0;
        int tokoTerbanyak = 0;

        for (int i = 1; i <= jmlToko; i++){
            int jmlPelanggan = -1;
            do{
                System.out.print("Masukkan jumlah pelanggan :  ");
                jmlPelanggan = Alderts.nextInt();
                if (jmlPelanggan < 0) {
                    System.out.println("Tidak valid, input ulang!");
                }
            } while (jmlPelanggan < 0);

            int totalBarangToko = 0;
            for (int j = 1; j <= jmlPelanggan; j++) {
                int jmlBarang = 0;
                do {
                    System.out.print("Barang yang dibeli pelanggan ke- " + j + ": " );
                    jmlBarang = Alderts.nextInt();
                    if (jmlBarang < 0){
                        System.out.println("Jumlah barang tak boleh negatif!");
                        }
                } while (jmlBarang < 0);
                totalBarangToko += jmlBarang;
            }
            totalBarang += totalBarangToko;
            System.out.println("Toko " + i + " - pelanggan: " + jmlPelanggan + ", Total barang:  " + "  "+ totalBarang);
            if (totalBarangToko > maxBarang) {
                maxBarang = totalBarangToko;
                tokoTerbanyak = i;
            }
            
            System.out.println("Total barang seluruh toko: " + totalBarangToko);
            }
            System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
            Alderts.close();
        }
        
    }