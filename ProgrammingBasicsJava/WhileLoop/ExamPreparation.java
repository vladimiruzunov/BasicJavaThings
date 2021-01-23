import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countLowGrades = Integer.parseInt(scanner.nextLine());
        int sumAllGrades = 0;
        int countProblems = 0;
        String lastProblem = "";
        int currentCountLowGrades = 0;
        String input = scanner.nextLine();
        while (!input.equals("Enough")){
            lastProblem = input;
            int currentGrade = Integer.parseInt(scanner.nextLine());
            sumAllGrades += currentGrade;
            countProblems++;
            if (currentGrade <= 4){
                currentCountLowGrades++;
                if (currentCountLowGrades >= countLowGrades){
                    System.out.printf("You need a break, %d poor grades.", countLowGrades);
                    return;
                }
            }


            input = scanner.nextLine();
        }
        double averageGrade = sumAllGrades * 1.0 / countProblems;
        System.out.printf("Average score: %.2f%n", averageGrade);
        System.out.printf("Number of problems: %d%n", countProblems);
        System.out.printf("Last problem: %s", lastProblem);
    }
}
