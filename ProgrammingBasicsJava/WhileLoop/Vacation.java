import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vacationMoney = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());
        int daysCounter = 0;
        int spendingCounter = 0;
        while (availableMoney < vacationMoney && spendingCounter < 5){
            String input = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());
            daysCounter++;
            if (input.equals("save")){
                availableMoney += money;
                spendingCounter = 0;
            }else if (input.equals("spend")){
                availableMoney -= money;
                spendingCounter += 1;
                if (availableMoney < 0){
                    availableMoney = 0;
                }
            }
            if (spendingCounter == 5){
                System.out.println("You can't save the money.");
                System.out.println(daysCounter);

            }
            if (availableMoney >= vacationMoney){
                System.out.printf("You saved the money for %d days.", daysCounter);
            }
        }
    }
}
