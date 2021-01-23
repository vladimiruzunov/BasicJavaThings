import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int examHour = Integer.parseInt(scanner.nextLine());
        int examMin = Integer.parseInt(scanner.nextLine());
        int arriveHour = Integer.parseInt(scanner.nextLine());
        int arriveMin = Integer.parseInt(scanner.nextLine());
        int totalMins = examHour * 60 + examMin;
        int totalArriveMins = arriveHour * 60 + arriveMin;
        int min = 0;
        int hour = 0;

        if (totalMins == totalArriveMins) {
            System.out.println("On time");
        }else if (totalArriveMins < totalMins) {
                min = totalMins - totalArriveMins;
                if (totalMins - totalArriveMins <= 30) {
                    System.out.println("On time");
                    System.out.printf("%d minutes before the start", min);
                } else if (totalMins - totalArriveMins < 60) {
                    System.out.println("Early");
                    System.out.printf("%d minutes before the start", min);
                }
             else {
                hour = min / 60;
                min %= 60;
                System.out.println("Early");
                System.out.printf("%d:%02d hours before the start", hour, min);
            }
        }
        else {
            System.out.println("Late");
            min = totalArriveMins - totalMins;
            if (min < 60){
                System.out.printf("%d minutes after the start", min);
            }else {
                hour = min / 60;
                min %= 60;
                System.out.printf("%d:%02d hours after the start", hour, min);

            }

        }
    }
}
