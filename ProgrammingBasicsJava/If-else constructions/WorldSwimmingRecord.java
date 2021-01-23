import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double secRecord = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double secsFor1m = Double.parseDouble(scanner.nextLine());

    double smoothSwim = distance * secsFor1m;
    double resistantSwim = Math.floor( distance  / 15) * 12.5;
    double swimmingTime = smoothSwim + resistantSwim;
    double difference = swimmingTime - secRecord;
    if (swimmingTime < secRecord){
        System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", swimmingTime);
    }
    else{
        System.out.printf("No, he failed! He was %.2f seconds slower.", difference);
    }

    }
}
