package P12;

import java.util.Arrays;

/*
Percobaan 4 Bagian B (uji wajib
tambahan)
elemen dasar array (B) 20 + (10 mod 60) = 30
array mnjadi : 30, 45, 22, 60, 10, 35*/

public class SortNilai10 {
    public static void main(String[] args) {
        int[] nilai = {30, 45, 22, 60, 10, 35};

        for (int i = 0; i < nilai.length - 1; i++){
            for (int j = 0; j < nilai.length -1 -i; j++) {
                if (nilai[j] > nilai[j + 1]) {
                    int temp = nilai[j];
                    nilai[j] = nilai [j+1];
                    nilai[j + 1] = temp;   
                }
            }
        }
        System.out.println(Arrays.toString(nilai));
    }
}
