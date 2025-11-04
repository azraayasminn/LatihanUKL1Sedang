import java.math.BigInteger;
import java.util.Scanner;

public class UKLSoal1SD {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan bilangan bulat positif: ");
    if (!input.hasNextInt()) {
            System.out.println("Input bukan bilangan bulat.");
            input.close();
            return;
        }

        int n = input.nextInt();
        if (n < 0) {
            System.out.println("Masukkan bilangan bulat POSITIF (>= 0).");
            input.close();
            return;
        }

        BigInteger faktorial = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            faktorial = faktorial.multiply(BigInteger.valueOf(i));
        }

        System.out.println(n + "! = " + faktorial);
        input.close();
    }
   

    
}
