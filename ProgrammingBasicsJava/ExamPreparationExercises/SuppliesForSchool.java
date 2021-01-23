import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int penPackets = Integer.parseInt(scanner.nextLine());
        int markerPackets = Integer.parseInt(scanner.nextLine());
        double cleanerLiter = Double.parseDouble(scanner.nextLine());
        double discountPercent = Double.parseDouble(scanner.nextLine());

        double totalPens = penPackets * 5.80;
        double totalMarkers = markerPackets * 7.20;
        double totalCleaner = cleanerLiter * 1.20;
        double totalSum = totalPens + totalCleaner + totalMarkers;
        double discount = (totalSum * discountPercent) / 100;
        double endSum = totalSum - discount;
        System.out.printf("%.3f", endSum);
    }
}
