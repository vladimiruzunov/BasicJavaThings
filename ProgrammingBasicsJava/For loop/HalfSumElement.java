import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i <n ; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            sum = sum + currentNum;
            if (currentNum > max){
                max = currentNum;
            }

        }
        int sumWithoutMax = sum - max;
        if(max == sumWithoutMax){
            System.out.println("Yes");
            System.out.printf("Sum = %d", max);
        }else {
            System.out.println("No");
            System.out.printf("Diff = %d",Math.abs(max - sumWithoutMax));
        }
    }
}
