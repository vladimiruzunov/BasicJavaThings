import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String city = scanner.nextLine();
        Double quantity = Double.parseDouble(scanner.nextLine());
        double totalPrice = 0;
        if (product.equals("coffee")) {
            switch (city) {
                case "Sofia":
                    totalPrice = quantity * 0.5;
                    break;
                case "Plovdiv":
                    totalPrice = quantity * 0.4;
                    break;
                case "Varna":
                    totalPrice = quantity * 0.45;
                    break;

            }
        } else if (product.equals("water")) {
            switch (city) {
                case "Sofia":
                    totalPrice = quantity * 0.80;
                    break;
                case "Plovdiv":
                    totalPrice = quantity * 0.70;
                    break;
                case "Varna":
                    totalPrice = quantity * 0.70;
                    break;
            }
            }
        else if (product.equals("beer")) {
                switch (city) {
                    case "Sofia":
                        totalPrice = quantity * 1.20;
                        break;
                    case "Plovdiv":
                        totalPrice = quantity * 1.15;
                        break;
                    case "Varna":
                        totalPrice = quantity * 1.10;
                        break;
                }

            } else if (product.equals("peanuts")) {
                switch (city) {
                    case "Sofia":
                        totalPrice = quantity * 1.60;
                        break;
                    case "Plovdiv":
                        totalPrice = quantity * 1.50;
                        break;
                    case "Varna":
                        totalPrice = quantity * 1.55;
                        break;
                }

            } else if (product.equals("sweets")) {
                switch (city) {
                    case "Sofia":
                        totalPrice = quantity * 1.45;
                        break;
                    case "Plovdiv":
                        totalPrice = quantity * 1.30;
                        break;
                    case "Varna":
                        totalPrice = quantity * 1.35;
                        break;
                }

            }
            System.out.printf("%.2f",totalPrice);
        }
    }


