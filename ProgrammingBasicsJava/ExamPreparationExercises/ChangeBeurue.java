import java.util.Scanner;

public class ChangeBeurue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bitCoinNumber = Integer.parseInt(scanner.nextLine());
        double joansNumber = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine());
        double bitCoinToLeva = bitCoinNumber * 1168;
        double joanToDolars = joansNumber * 0.15;
        double dollarsToLeva = joanToDolars * 1.76;
        double levaToEuro = (dollarsToLeva + bitCoinToLeva) / 1.95;
        double currentCommision = (levaToEuro * commission) / 100;
        double totalMoney = levaToEuro - currentCommision;
        System.out.printf("%.2f", totalMoney);
    }
}
