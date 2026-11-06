package P3;
import java.util.Scanner;

public class BiayaBensin10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Jumlah_Lembar, Biaya_Cetak_Perlembar = 500, Biaya_Jilid = 5000, Total_Biaya;

        System.out.println("Masukkan Jumlah Lembar: ");
        Jumlah_Lembar = input.nextInt();
        Total_Biaya = (Jumlah_Lembar * 500) + 5000;
        System.out.println("Total biaya anda adlah: " + Total_Biaya );

    }
    
}
