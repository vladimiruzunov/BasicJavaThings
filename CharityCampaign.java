import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int campaignDays = Integer.parseInt(scanner.nextLine());
        int cakers = Integer.parseInt(scanner.nextLine());
        int cakes = Integer.parseInt(scanner.nextLine());
        int gofretes = Integer.parseInt(scanner.nextLine());
        int pancakes = Integer.parseInt(scanner.nextLine());
        double cake = 45;
        double gofrete = 5.80;
        double pancake = 3.20;
        double cakeMoneyPerDay = cakes * cake;
        double gofreteMoneyPerDay = gofretes * gofrete;
        double pancakesMoneyPerDay = pancakes * pancake;
        double summPerDayByAll = cakers * (cakeMoneyPerDay + gofreteMoneyPerDay + pancakesMoneyPerDay);
        double campaignSum = campaignDays * summPerDayByAll;
        double sumAfterBills = campaignSum - (campaignSum / 8);
        System.out.printf("%.2f", sumAfterBills);

    }
}
