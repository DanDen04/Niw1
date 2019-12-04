import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("x : ");
        int x = in.nextInt();
        System.out.print("y : ");
        int y = in.nextInt();

        if (y <= 1.5 && y >= -2) System.out.println("Доступ открыт!");
        else System.out.println("Доступ закрыт");
    }
}
