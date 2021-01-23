import java.util.Scanner;

public class EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String size = scanner.nextLine();
        int setsOrdered = Integer.parseInt(scanner.nextLine());
        double setPrice = 0;
        if (size.equals("small")){

            switch (fruit){
                case "Watermelon":
                 setPrice =56;
                    break;
                case "Mango":
                    setPrice = 2 * 36.66;
                    break;
                case "Pineapple":
                    setPrice = 2 * 42.10;
                    break;
                case "Raspberry":
                    setPrice = 2 * 20;
                    break;
            }

        }else if (size.equals("big")){
            switch (fruit){
                case "Watermelon":
                    setPrice = 5 * 28.70;
                    break;
                case "Mango":
                    setPrice = 5 * 19.60;
                    break;
                case "Pineapple":
                    setPrice = 5 * 24.80;
                    break;
                case "Raspberry":
                    setPrice = 15.20;
                    break;
            }
        }



    }
}
