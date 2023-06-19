import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int x=scanner.nextInt();
        System.out.println(Integer.toBinaryString(n));
        n=n>>x<<x;
        System.out.println(Integer.toBinaryString(n));
    }
}
