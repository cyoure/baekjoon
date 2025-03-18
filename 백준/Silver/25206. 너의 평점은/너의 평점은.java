import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        double totalGrade = 0;
        for (int i = 0; i < 20; i++) {
            String term = sc.nextLine();
            String[] score = term.split(" ");
            double num = Double.parseDouble(score[1]);
            if (score[2].equals("A+")) {
                total = total + num * 4.5;
                totalGrade += num;
            } else if (score[2].equals("A0")) {
                total = total + num * 4.0;
                totalGrade += num;
            } else if (score[2].equals("B+")) {
                total = total + num * 3.5;
                totalGrade += num;
            } else if (score[2].equals("B0")) {
                total = total + num * 3.0;
                totalGrade += num;
            } else if (score[2].equals("C+")) {
                total = total + num * 2.5;
                totalGrade += num;
            } else if (score[2].equals("C0")) {
                total = total + num * 2.0;
                totalGrade += num;
            } else if (score[2].equals("D+")) {
                total = total + num * 1.5;
                totalGrade += num;
            } else if (score[2].equals("D0")) {
                total = total + num;
                totalGrade += num;
            } else if (score[2].equals("F")) {
                total = total + num * 0;
                totalGrade += num;
            }
        }
        System.out.println(total / totalGrade);
    }
}
