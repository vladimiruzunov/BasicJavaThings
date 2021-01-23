import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peopleCount = Integer.parseInt(scanner.nextLine());

        double sumAllGrades = 0;
        int countPresentations = 0;

        String presentation = scanner.nextLine();
        while (!presentation.equals("Finish")){
            double sumGrades = 0;
            countPresentations++;
            for (int i = 0; i < peopleCount; i++) {
                double currentGrade = Double.parseDouble(scanner.nextLine());
                sumGrades += currentGrade;
            }
            double averageGrade = sumGrades / peopleCount;
            System.out.printf("%s - %.2f.%n", presentation, averageGrade);
            sumAllGrades +=  averageGrade;

            presentation = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", sumAllGrades / countPresentations);
    }
}
