import java.util.Scanner;

public class MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordInSecs = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double timeInSecsFor1M = Double.parseDouble(scanner.nextLine());
        double secsForClimbing = distanceInMeters * timeInSecsFor1M;
        double slowingTime = Math.floor(distanceInMeters / 50) * 30;
        double totalTime = secsForClimbing + slowingTime;

        if (totalTime < recordInSecs){
            System.out.printf("Yes! The new record is %.2f seconds.", totalTime);
        }else {
            System.out.printf("No! He was %.2f seconds slower.", Math.abs(totalTime - recordInSecs));
        }
    }
}
