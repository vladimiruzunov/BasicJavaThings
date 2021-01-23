import java.util.Scanner;

public class PcStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double cpuPriceInDollars = Double.parseDouble(scanner.nextLine());
        double videoPriceInDollars = Double.parseDouble(scanner.nextLine());
        double ramPriceInDollars = Double.parseDouble(scanner.nextLine());
        int ramCount = Integer.parseInt(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());

        double cpuInLeva = cpuPriceInDollars * 1.57;
        double videoInLeva = videoPriceInDollars * 1.57;
        double ramInLeva = ramPriceInDollars * 1.57;
        double totalRamPriceInLeva = ramInLeva * ramCount;
        double totalCpu = cpuInLeva - (cpuInLeva*discount);
        double totalVideo = videoInLeva - (videoInLeva*discount);
        double sum = totalRamPriceInLeva + totalCpu + totalVideo;
        System.out.printf("Money needed - %.2f leva.", sum);
    }
}
