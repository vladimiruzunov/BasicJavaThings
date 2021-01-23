import java.util.Scanner;

public class SuitcaseLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double capacity = Double.parseDouble(scanner.nextLine());
        boolean isThereMoreSpace = true;
        int count = 1;
        String input = scanner.nextLine();
        while (!input.equals("End")){
            double suitcase = Double.parseDouble(input);
            if (count % 3 ==0){
             suitcase+=suitcase * 0.1;
            }
            capacity -= suitcase;
            if (capacity<0){
                isThereMoreSpace = false;
                break;
            }

            count++;

            input = scanner.nextLine();
        }
        if (isThereMoreSpace){
            System.out.println("Congratulations! All suitcases are loaded!");
        }else {
            System.out.println("No more space!");
        }
        System.out.printf("Statistic: %d suitcases loaded.",count - 1);
    }
}
