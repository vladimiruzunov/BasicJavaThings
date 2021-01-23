import java.util.Scanner;

public class dogs {
    public static void main(String[] args) {
        Scanner scanner=  new Scanner(System.in);
        int dogs=Integer.parseInt(scanner.nextLine());
        int cats=Integer.parseInt(scanner.nextLine());
        double doggymoney = dogs * 2.5;
        double catsmoney = cats * 4;
        double summ = doggymoney + catsmoney;
        System.out.printf("%s lv.",summ);

    }
}
