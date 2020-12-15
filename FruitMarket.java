import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double strawberriesPrice = Double.parseDouble(scanner.nextLine());
        double bananasQuantity = Double.parseDouble(scanner.nextLine());
        double orangesQuantity = Double.parseDouble(scanner.nextLine());
        double raspberriesQuantity = Double.parseDouble(scanner.nextLine());
        double strawberriesQuantity = Double.parseDouble(scanner.nextLine());

        double raspberriesPrice = strawberriesPrice - (strawberriesPrice * 0.5);
        double orangesPrice = raspberriesPrice - (raspberriesPrice * 0.4);
        double bananasPrice = raspberriesPrice - (raspberriesPrice * 0.8);

        double strawberriesTotal = strawberriesPrice * strawberriesQuantity;
        double bananasTotal = bananasPrice * bananasQuantity;
        double orangesTotal = orangesPrice * orangesQuantity;
        double raspberriesTotal = raspberriesPrice * raspberriesQuantity;
        double total = strawberriesTotal + bananasTotal + orangesTotal + raspberriesTotal;
        System.out.printf("%.2f", total);

    }
}
