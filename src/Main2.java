import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int time = scanner.nextInt();

        if (time >= 0 && time < 5) {
            System.out.println("Доброй ночи");
        }
        else if (time >= 5 & time < 11) {
            System.out.println("Доброго утра");

        }
        else if(time >= 11 & time < 17) {
            System.out.println("Добрый день");

        }
        else if(time >= 17 & time < 24) {
            System.out.println("Добрый вечер");

        }

    }
}