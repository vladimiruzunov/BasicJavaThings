import javax.swing.*;
import java.util.Scanner;

public class CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int walkingMinutesPerDay = Integer.parseInt(scanner.nextLine());
        int walkingNumbersPerDay = Integer.parseInt(scanner.nextLine());
        int caloriesPerDay = Integer.parseInt(scanner.nextLine());

        int totalMinsWalking = walkingMinutesPerDay * walkingNumbersPerDay;
        int totalCaloriesBurned = totalMinsWalking * 5;
        if ((caloriesPerDay * 0.5) <= totalCaloriesBurned){
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", totalCaloriesBurned);
        }else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", totalCaloriesBurned);
        }



    }
}
