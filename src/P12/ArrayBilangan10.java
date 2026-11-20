package P12;
import java.util.Arrays;
/*Percobaan 1 (uji wajib tambahan)
bil[0], bil[1], bil[2], bil[3] 10 ; 10+8 = 18; −(1+(10 mod 7)) = -4 ; 20+(10 mod 15) = 30
 */

public class ArrayBilangan10 {
  public static void main(String[] args) {
    int bil [] = {10, 18, -4, 30};

    for (int i = 0; i <= 4; i++) {
        System.out.println("bill [" + i + " ] = " + bil[i] + ", double = " + (bil[i] * 2));
    }
    for(int nilai : bil) { 
        System.out.println(nilai);
    }
    System.out.println(Arrays.toString(bil));
  }  
}
