import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String projection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;
        switch (projection){
            case "Premiere":
            totalPrice = rows * columns * 12;
                break;
            case "Normal":
                totalPrice = rows * columns * 7.50;
                break;
            case "Discount":
                totalPrice = rows * columns * 5;
                break;
        }
        System.out.printf("%.2f leva", totalPrice);

    }
}
