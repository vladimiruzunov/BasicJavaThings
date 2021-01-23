import java.util.Scanner;

public class Everest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startCamp = 5364;
        int maxHeight = 8848;
        int daysCounter = 1;
        int maxDays = 5;

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("END")){
                if (startCamp >= maxHeight){
                    System.out.printf("Goal reached for %d days!", daysCounter);
                    break;
                }
                if (startCamp < maxHeight){
                    System.out.println("Failed!");
                    System.out.printf("%d", startCamp);
                    break;
                }
                break;
            }
            int metersToClimb = Integer.parseInt(scanner.nextLine());
            if (input.equals("Yes")){
                daysCounter++;
                startCamp = startCamp + metersToClimb;
            }else {
                startCamp = startCamp + metersToClimb;
            }
            if (startCamp >= maxHeight){
                System.out.printf("Goal reached for %d days!", daysCounter);
                break;
            }
            if (daysCounter==maxDays && startCamp < maxHeight){
                System.out.println("Failed!");
                System.out.printf("%d", startCamp);
                break;
            }

        }

    }
}