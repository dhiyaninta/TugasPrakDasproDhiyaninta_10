import java.util.Scanner;

public class TugasStudiKasus2Tanah_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int Panjang_Tanah, Lebar_tanah, Panjang_Persegi, Luas_Persegi;
        double Diameter_Kolam, Luas_Lingkaran, Pi = 3.14, Luas_Tanah_Tak_Digunakan, Luas_Tanah, jari_jari_r;

        System.out.print("Masukkan Panjang Tanah: ");
        Panjang_Tanah = input.nextInt();
        System.out.print("Masukkan Lebar Tanah: ");
        Lebar_tanah = input.nextInt();
        System.out.print("Masukkan Diameter Kolam: ");
        Diameter_Kolam = input.nextInt();
        jari_jari_r = Diameter_Kolam / 2;
        System.out.print("Masukkan Panjang Persegi: ");
        Panjang_Persegi = input.nextInt();
        //Hitung Luas Tanah Total
        Luas_Tanah = Panjang_Tanah * Lebar_tanah;
        Luas_Lingkaran = Pi * Math.pow(jari_jari_r, 2);
        Luas_Persegi = Panjang_Persegi * Panjang_Persegi;
        Luas_Tanah_Tak_Digunakan = Luas_Tanah - Luas_Lingkaran - Luas_Persegi;
        System.out.println("Luas Tanah Yang Tak Digunakan Adalah:  " + Luas_Tanah_Tak_Digunakan);
    }
}
