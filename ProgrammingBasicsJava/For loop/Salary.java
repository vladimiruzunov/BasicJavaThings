import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double salary = Double.parseDouble(scanner.nextLine());

        for (int i = 0; i <n ; i++) {
            String sites = scanner.nextLine();
            if (sites.equals ("Facebook")){
                salary = salary - 150;
            }else if (sites.equals ("Instagram")){
                salary = salary - 100;
            }else if (sites.equals ("Reddit")){
                salary = salary - 50;
            }if (salary <= 0){

                break;
            }

        }
        if (salary <= 0){
            System.out.println("You have lost your salary.");
        }else {
            System.out.printf("%.0f",salary);
        }
    }
}
