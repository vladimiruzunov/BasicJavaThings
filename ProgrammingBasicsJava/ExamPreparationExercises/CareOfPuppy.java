import java.util.Scanner;

public class CareOfPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int boughtFoodInKG = Integer.parseInt(scanner.nextLine());
        int kgToGrams = boughtFoodInKG * 1000;
        String input = scanner.nextLine();
        int sumGrams = 0;
        while (!input.equals("Adopted")){
            int foodPerDay = Integer.parseInt(input);
            sumGrams +=foodPerDay;
            input = scanner.nextLine();

        }
        if (sumGrams <= kgToGrams){
            System.out.printf("Food is enough! Leftovers: %d grams.", kgToGrams - sumGrams);
        }else {
            System.out.printf("Food is not enough. You need %d grams more.",sumGrams - kgToGrams);
        }

    }
}
