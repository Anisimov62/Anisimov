import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        System.out.println(Integer.toBinaryString(n));
        int mask = 1;
        mask = mask << x;
        n = n ^ mask;
        System.out.println(Integer.toBinaryString(n));
    }
}
