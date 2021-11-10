import java.util.Scanner;

public class Divided {
    public static void main(String[] args) {
        System.out.print("Lütfen bir sayı girin: ");
        Scanner scn = new Scanner(System.in);
        int data = scn.nextInt();
        int i, k = 0, l = 0;
        for (i = 0; i <= data; i++) {
            if ((i % 3 == 0) && (i % 4 == 0) && i > 0) {
                k += i;
                l += 1;
               
            }
        }
        System.out.println("3'e ve 4'e tam bölünen sayıların ortalaması: " + k / l);
    }
}
