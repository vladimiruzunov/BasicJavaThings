import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pagesCount = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int daysCount = Integer.parseInt(scanner.nextLine());
        int timePerBook = pagesCount / pagesPerHour;
        int summ = timePerBook / daysCount;
        System.out.println(summ);
    }
}
