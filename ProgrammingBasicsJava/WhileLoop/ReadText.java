import java.util.Scanner;

public class ReadText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("Stop")){
            System.out.printf("%s%n", input);
            input = scanner.nextLine();
        }
    }
}
