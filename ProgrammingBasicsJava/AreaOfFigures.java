import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();
        if (figure.equals("triangle")){
            double a = Double.parseDouble(scanner.nextLine());
            double c = Double.parseDouble(scanner.nextLine());
            double sTriangle = a * c / 2;
            System.out.printf("%.3f", sTriangle);

        }
        else if (figure.equals("square")){
            double a = Double.parseDouble(scanner.nextLine());
            double sSquare = a * a;
            System.out.printf("%.3f", sSquare);
        }
        else if (figure.equals("rectangle")){
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            double sRectangle = a * b;
            System.out.printf("%.3f", sRectangle);
        }
        else if (figure.equals("circle")){
            double r = Double.parseDouble(scanner.nextLine());
            double sCircle = Math.PI * r * r;
            System.out.printf("%.3f", sCircle);
        }
    }
}
