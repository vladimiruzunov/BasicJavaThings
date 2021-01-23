import java.util.Scanner;

public class Rate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double s = Double.parseDouble(scanner.nextLine());
        int monthsCount = Integer.parseInt(scanner.nextLine());
        double simple = s;
        double currentRateSimple = simple * 0.03;

        for (int i = 1; i <= monthsCount ; i++) {
          simple+=currentRateSimple;

        }
        System.out.printf("Simple interest rate: %.2f lv.%n", simple);
        //complex
        for (int i = 1; i <=monthsCount ; i++) {
            double currentRateComplex = s * 0.027;
            s+=currentRateComplex;

        }
        System.out.printf("Complex interest rate: %.2f lv.%n",s);
        if (simple > s){
            System.out.printf("Choose a simple interest rate. You will win %.2f lv.", simple-s);
        }else {
            System.out.printf("Choose a complex interest rate. You will win %.2f lv.", s-simple);
        }
    }
}
