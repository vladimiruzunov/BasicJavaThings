import java.util.Scanner;

public class AccBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double total = 0;
        while (!input.equals("NoMoreMoney")){
         double current = Double.parseDouble(input);
         if (current <0){
             System.out.println("Invalid operation!");
             break;
         }
         total+=current;
            System.out.printf("Increase: %.2f%n",current);
            input = scanner.nextLine();

        }
        System.out.printf("Total: %.2f", total);
    }
}
