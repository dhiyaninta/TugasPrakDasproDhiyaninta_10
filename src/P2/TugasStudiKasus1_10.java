import java.util.Scanner;
public class TugasStudiKasus1_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Gaji_Pokok, Tunjangan  = 200000, Jumlah_Anak;
        double Dana_Pensiun = 0.1, Gaji_Bersih;

        System.out.print("Masukkan Gaji Pokok : ");
        Gaji_Pokok = input.nextInt();
        System.out.print("Masukkan Jumlah Anak: ");
        Jumlah_Anak = input.nextInt();
        //Hitung Dana Pensiun
        Dana_Pensiun = Gaji_Pokok * Dana_Pensiun;
        //Hitung Tunnjangan
        Tunjangan = Tunjangan * Jumlah_Anak;
        // Hitung Gji Bersih
        Gaji_Bersih = Gaji_Pokok - Dana_Pensiun + Tunjangan;
        System.out.println("Jumlah Gaji Bersih Anda Adalah: " + Gaji_Bersih);
    }
}
