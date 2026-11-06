import java.util.Scanner;

    public class Bank10 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int jml_Tabungan_Awal, lama_menabung;
            double prosentase_Bunga = 0.02, bunga, jml_Tabunngan_Akhir;

            System.out.println("Masukkan Jumlah Tabungan Awal Anda: ");
            jml_Tabungan_Awal = input.nextInt();
            System.out.println("Masukkan Lama Menabung Anda: ");
            lama_menabung = input.nextInt();

            bunga = lama_menabung * prosentase_Bunga * jml_Tabungan_Awal;
            jml_Tabunngan_Akhir = bunga + jml_Tabungan_Awal;
            System.out.println("Bunga Adalah: " + bunga);
            System.out.println("Jumlah Tabungan Akhir Anda Adalah: " + jml_Tabunngan_Akhir);


        }
    
    }
