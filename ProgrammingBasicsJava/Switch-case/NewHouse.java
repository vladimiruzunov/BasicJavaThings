import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowerType = scanner.nextLine();
        int flowerCount = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        double price = 0;
        double totalPrice = 0;
        switch (flowerType){
            case "Roses":
                price = 5;
                totalPrice = price * flowerCount;
                if (flowerCount>80){
                    totalPrice*=0.9;
                }
                break;
            case "Dahlias":
                price = 3.80;
                totalPrice = price * flowerCount;
                if (flowerCount>90){
                    totalPrice*=0.85;
                }
                break;
            case "Tulips":
                price = 2.80;
                totalPrice = price * flowerCount;
                if (flowerCount>80){
                    totalPrice*=0.85;
                }
                break;
            case "Narcissus":
                price = 3;
                totalPrice = price * flowerCount;
                if (flowerCount<120){
                    totalPrice*=1.15;
                }
                break;
            case "Gladiolus":
                price = 2.50; totalPrice = price * flowerCount;
                if (flowerCount<80){
                    totalPrice*=1.20;
                }
                break;
        }
        if (budget>=totalPrice){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerCount, flowerType,Math.abs(totalPrice-budget ));
        }else{
            System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(totalPrice-budget));
        }

    }
}
