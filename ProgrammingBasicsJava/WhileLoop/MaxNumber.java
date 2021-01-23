import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        String input = scanner.nextLine();
        while (!input.equals("Stop")){
        int current = Integer.parseInt(input);
        if (current < min){
            min = current;

        }
            input = scanner.nextLine();
        }
        System.out.println(min);
    }
}
