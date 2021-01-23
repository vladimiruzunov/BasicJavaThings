import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groups = Integer.parseInt(scanner.nextLine());

        int countMusala = 0;
        int countMonblan = 0;
        int countKilimandjaro = 0;
        int countK2 = 0;
        int countEverest = 0;
        int countPeople = 0;
        for (int i = 1; i <= groups ; i++) {
            int peopleInCurrentGroup = Integer.parseInt(scanner.nextLine());
            countPeople+= peopleInCurrentGroup;
            if (peopleInCurrentGroup <= 5){
                countMusala+=peopleInCurrentGroup;

            }else if (peopleInCurrentGroup <= 12){
                countMonblan+=peopleInCurrentGroup;
            }else if (peopleInCurrentGroup<= 25){
                countKilimandjaro+=peopleInCurrentGroup;

            }else if (peopleInCurrentGroup<=40){
                countK2+=peopleInCurrentGroup;
            }else {
                countEverest+=peopleInCurrentGroup;
            }

        }
        double percentMusala = countMusala * 1.0 / countPeople * 100;
        double percentMonblan = countMonblan * 1.0 / countPeople * 100;
        double percentKili = countKilimandjaro * 1.0 / countPeople * 100;
        double percentK2 = countK2 * 1.0 / countPeople * 100;
        double percentEverest = countEverest * 1.0 / countPeople * 100;
        System.out.printf("%.2f%%%n", percentMusala);
        System.out.printf("%.2f%%%n", percentMonblan);
        System.out.printf("%.2f%%%n", percentKili);
        System.out.printf("%.2f%%%n", percentK2);
        System.out.printf("%.2f%%", percentEverest);

    }
}
