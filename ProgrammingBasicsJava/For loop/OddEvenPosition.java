import java.util.Scanner;

public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double oddSum = 0;
        double oddMin = 100000000000.0;
        double oddMax = -10000000000.0;
        double evenSum = 0;
        double evenMin = 10000000000.0;
        double evenMax = -1000000000000.0;
        for (int i = 1; i <=n ; i++) {
            double currentNum = Double.parseDouble(scanner.nextLine());
            if (i % 2 != 0){
              oddSum = oddSum + currentNum;
              if (currentNum < oddMin){
                  oddMin = currentNum;
              }if (currentNum > oddMax){
                  oddMax = currentNum;
                }
            }else {
                evenSum = evenSum + currentNum;
                if (currentNum < evenMin){
                    evenMin = currentNum;
                }if (currentNum > evenMax){
                    evenMax = currentNum;
                }
            }
        }
        System.out.printf("OddSum=%.2f,%n", oddSum);
        if (oddMin == 100000000000.0){
            System.out.println("OddMin=No,");
        }else {
            System.out.printf("OddMin=%.2f,%n", oddMin);
        }
        if (oddMax == -10000000000.0){
            System.out.println("OddMax=No,");
        }else {
            System.out.printf("OddMax=%.2f,%n", oddMax);
        }
        System.out.printf("EvenSum=%.2f,%n", evenSum);
        if (evenMin == 10000000000.0){
            System.out.println("EvenMin=No,");
        }else {
            System.out.printf("EvenMin=%.2f,%n", evenMin);
        }if (evenMax == -1000000000000.0){
            System.out.println("EvenMax=No");
        }else {
            System.out.printf("EvenMax=%.2f", evenMax);
        }
    }
}
