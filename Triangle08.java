import java.util.Scanner;

public class Triangle08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");

        int n = sc.nextInt();
        int i = 0;
        int j = 0;

        while (i <= n) {
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println("*");
            i++;
        }

    }
}
