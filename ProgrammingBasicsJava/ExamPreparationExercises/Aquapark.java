import java.util.Scanner;

public class Aquapark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int hoursSpend = Integer.parseInt(scanner.nextLine());
        int peopleCount = Integer.parseInt(scanner.nextLine());
        String partOfTheDay = scanner.nextLine();
        double total = 0;
       double price = 0;
        if (month.equals("march") || month.equals("april") || month.equals("may")){
            if (partOfTheDay.equals("day")) {
                price = 10.50;
                total = (price * hoursSpend) * peopleCount;
            }else if (partOfTheDay.equals("night")){
                    price = 8.40;
                    total = (price * hoursSpend) * peopleCount;
            }
        }
        if (month.equals("june") || month.equals("july") || month.equals("august")){
            if (partOfTheDay.equals("day")) {
                price = 12.60;
                total = (price * hoursSpend) * peopleCount;
            }else if (partOfTheDay.equals("night")){
                    price = 10.20;
                    total = (price * hoursSpend) * peopleCount;
            }
        }
        if (peopleCount >= 4){
            price*=0.9;
            total = (price * hoursSpend) * peopleCount;
        }
        if (hoursSpend >=5){
            price*=0.5;
            total = (price * hoursSpend) * peopleCount;
        }
        System.out.printf("Price per person for one hour: %.2f%n", price);
        System.out.printf("Total cost of the visit: %.2f", total);

    }
}
