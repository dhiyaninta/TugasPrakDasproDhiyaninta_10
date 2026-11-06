package P3;
import java.util.Scanner;

public class MengitungTotalBiaya10 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int harga;
        double potongan;
        double jml_Bayar;
        double diskon = 0.15;
        harga = input.nextInt();
        potongan = diskon * harga;
        jml_Bayar = harga - potongan;
        System.out.println("Jumlah Potongan: " + jml_Bayar);
        System.out.println("Jumlah yang harus anda bayar adalah Rp. " + jml_Bayar);



    }
}
