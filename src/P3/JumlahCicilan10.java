package P3;
import java.util.Scanner;

public class JumlahCicilan10 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int harga, uang_muka, Jml_Bulanan;
        double bunga = 0.02, jumlah_Cicilan_Perbulan;


        System.out.print("Masukkan harga: ");
        harga = input.nextInt();
        System.out.print("Masukkan uang muka: ");
        uang_muka = input.nextInt();
        System.out.println("Masukkan Jumlah Bulan: ");
        Jml_Bulanan = input.nextInt();

        jumlah_Cicilan_Perbulan = ((harga - uang_muka) / Jml_Bulanan) + ((harga - uang_muka) * bunga);
        System.out.println("Jumlah Cicilan Perbulan Anda adalah: " + jumlah_Cicilan_Perbulan);

    }
    
}