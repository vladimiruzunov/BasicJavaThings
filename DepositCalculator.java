import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double depositValue = Double.parseDouble(scanner.nextLine());
        int depositTime = Integer.parseInt(scanner.nextLine());
        double lihvenProcentYearly = Double.parseDouble(scanner.nextLine());
        double monthlyInterest = (depositValue * lihvenProcentYearly) / 12 / 100;
        double suma = depositValue + depositTime * monthlyInterest;
        System.out.println(suma);
    }
}
