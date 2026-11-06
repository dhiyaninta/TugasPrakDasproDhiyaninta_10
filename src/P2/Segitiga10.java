import java.util.Scanner;

    public class Segitiga10 {
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int alas, tinggi;
            float luas;
            //Perintah Input Alas
            System.out.print("Masukkan Alas: ");
            alas = sc.nextInt();
            System.out.print("Masukkan Tinggi: ");
            tinggi = sc.nextInt();
            //Hitung Luas Segitiga
            luas = alas * tinggi / 2;
            // Tampilkan variabel luas
            System.out.println("Luas Segitiga: " + luas);
        }

    }
