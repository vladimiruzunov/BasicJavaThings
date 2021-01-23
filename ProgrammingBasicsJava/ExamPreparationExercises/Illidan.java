import java.util.Scanner;

public class Illidan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int powerPerPerson = Integer.parseInt(scanner.nextLine());
        int illidansHealth = Integer.parseInt(scanner.nextLine());
        int totalPower = people * powerPerPerson;
        if (totalPower < illidansHealth){
            System.out.printf("You are not prepared! You need %d more points.", illidansHealth - totalPower);
        }else {
            System.out.printf("Illidan has been slain! You defeated him with %d points.", totalPower - illidansHealth);
        }
    }
}
