import java.util.Scanner;

public class Travel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destination = scanner.nextLine();


        while (!destination.equals("End")){
            double minBudget = Double.parseDouble(scanner.nextLine());
            double sumSavedMoney = 0;
            while (sumSavedMoney < minBudget){
                sumSavedMoney+= Double.parseDouble(scanner.nextLine());
            }
            System.out.println("Going to " + destination + "!");
            destination = scanner.nextLine();

        }
    }
}
