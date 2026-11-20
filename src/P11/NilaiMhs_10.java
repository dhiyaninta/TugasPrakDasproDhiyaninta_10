package P11;

import java.util.Scanner;

public class NilaiMhs_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String namaMhs;
        double ratatTugasAkhir = 0, n = 0, nkuis = 0,  nuts = 0, nuas = 0, totalTugas = 0;
        boolean TambahMhs =true;
        double rataseluruh = 0;
        System.out.print("Nama Mahasiswa: ");
        namaMhs = input.nextLine();
        
        do {
            System.out.print("Nilai Kuis: ");
            nkuis = input.nextInt();
            System.out.print("Nilai UTS: ");
            nuts= input.nextInt();
            System.out.print("Nilai UAS: ");
            nuas= input.nextInt();
            for (int i = 1; i <= n; i++) {
                int nilaiTugas;
                System.out.print("Nilai Tugas " + i + " (0-100): ");
                nilaiTugas = input.nextInt();
                if (nilaiTugas < 0 || nilaiTugas > 100) {
    System.out.println("Nilai tidak valid input ulang");
do {
                
                    
                    nkuis = nkuis * 0.3;
                    nuts = nuts * 0.15;
                    nuas = nuas * 0.3;
                    
                } while (nilaiTugas < 0 || nilaiTugas > 100);
                   
                    if (nilaiTugas >= 50) {
                    System.out.println("LULUS");
                    } else{
                    System.out.println("TIDAK LULUS");
                    }

                totalTugas += nilaiTugas;
                    
            }
        }
            ratatTugasAkhir = totalTugas/2;
            rataseluruh = (totalTugas + nkuis + nuts+ nuas)/4;
               
        System.out.println("Rata rata tugas: " + ratatTugasAkhir);
        System.out.println("Nilai Akhir: "+ rataseluruh);
        System.out.print("Tambah Mahasiswa: ");
        TambahMhs = input.nextBoolean();
         } while (TambahMhs);
         
        }
    }