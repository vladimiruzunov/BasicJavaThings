import java.util.Scanner;

public class TradeCommisions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        double sells = Double.parseDouble(scanner.nextLine());
        if ((!city.equals("Sofia") && !city.equals("Varna") && !city.equals("Plovdiv")) || sells < 0)  {

                System.out.println("error");

        }
        if (sells >= 0 && sells <= 500) {
            switch (city) {
                case "Sofia":
                    System.out.printf("%.2f", sells * 0.05);
                    break;
                case "Varna":
                    System.out.printf("%.2f", sells * 0.045);
                    break;
                case "Plovdiv":
                    System.out.printf("%.2f", sells * 0.055);
                    break;
            }
        }
        if (sells > 500 && sells <= 1000) {
            switch (city) {
                case "Sofia":
                    System.out.printf("%.2f", sells * 0.07);
                    break;
                case "Varna":
                    System.out.printf("%.2f", sells * 0.075);
                    break;
                case "Plovdiv":
                    System.out.printf("%.2f", sells * 0.08);
                    break;
            }
        }
        if (sells > 1000 && sells <= 10000) {
            switch (city) {
                case "Sofia":
                    System.out.printf("%.2f", sells * 0.08);
                    break;
                case "Varna":
                    System.out.printf("%.2f", sells * 0.1);
                    break;
                case "Plovdiv":
                    System.out.printf("%.2f", sells * 0.12);
                    break;
            }
        }
        if (sells > 10000) {
            switch (city) {
                case "Sofia":
                    System.out.printf("%.2f", sells * 0.12);
                    break;
                case "Varna":
                    System.out.printf("%.2f", sells * 0.13);
                    break;
                case "Plovdiv":
                    System.out.printf("%.2f", sells * 0.145);
                    break;

            }
        }

    }
}
