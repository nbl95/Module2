import java.util.Scanner;

public class chuyendoitienteBT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rate = 23000;

        int usd;
        System.out.println("Enter mount");
        usd = scanner.nextInt();

        int vnd = usd*rate;
        System.out.println("" + vnd);
    }
}
