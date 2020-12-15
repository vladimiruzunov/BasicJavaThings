import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        String metric = scanner.nextLine();
        String resultMetric = scanner.nextLine();
        if (metric.equals("mm")){
            number = number / 1000;
        }
        else if (metric.equals("cm")){
            number = number / 100;
        }
        if (resultMetric.equals("mm")){
            number = number * 1000;
        }else if (resultMetric.equals("cm")){
            number = number * 100;
        }
        System.out.printf("%.3f", number);
    }
}
