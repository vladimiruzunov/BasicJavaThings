import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rent = Integer.parseInt(scanner.nextLine());
        double cake = rent * 0.2;
        double drinks = cake - (0.45 * cake);
        double animator = rent / 3;
        double summ = rent + cake + drinks + animator;
        System.out.println(summ);
    }
}
