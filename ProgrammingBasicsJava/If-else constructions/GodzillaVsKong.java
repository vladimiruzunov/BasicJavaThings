import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double movieBudget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double statistClothes = Double.parseDouble(scanner.nextLine());
        double decor = movieBudget * 0.1;
        double clothesMoney = statists * statistClothes;
        double moviePrice = decor + clothesMoney;
        double moneyLeft = moviePrice - movieBudget;

        if (statists > 150){
            clothesMoney = clothesMoney * 0.9;
        }

        if (moviePrice <= movieBudget){
            double moneyPlus = movieBudget - moviePrice;
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", moneyPlus);
        }
        else{
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", moneyLeft);

        }



    }
}
