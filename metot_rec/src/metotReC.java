import java.util.Scanner;

public class metotReC {

    static void met(int n) {
        System.out.print(n + " ");
        if (n > 0) {
            met(n - 5);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        n = input.nextInt();
        met(n);
    }
}
