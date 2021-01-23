import java.util.Scanner;

public class ChristmassTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        double totalMoneyEarned = 0;

        int daysWin = 0;
        int daysLoose = 0;
        for (int i = 1; i <= days ; i++) {
            double moneyPerDay = 0;
            int wins = 0;
            int loses = 0;
            String game = scanner.nextLine();
            while (!game.equals("Finish")){
                String result = scanner.nextLine();
                if (result.equals("win")){
                    moneyPerDay+= 20;
                    wins++;
                }else if (result.equals("lose")){
                    loses++;
                }
                game = scanner.nextLine();
            }
            if (wins>loses){
                moneyPerDay*=1.1;
                daysWin++;
            }else {
                daysLoose++;
            }
            totalMoneyEarned+=moneyPerDay;
        }
        if (daysWin> daysLoose){
        totalMoneyEarned*=1.2;
            System.out.printf("You won the tournament! Total raised money: %.2f", totalMoneyEarned);
        }else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", totalMoneyEarned);
        }
    }
}
