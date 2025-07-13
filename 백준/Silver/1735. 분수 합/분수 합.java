import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int moleculeA = sc.nextInt();
        int denominatorA = sc.nextInt();
        int moleculeB = sc.nextInt();
        int denominatorB = sc.nextInt();
        int moleculeSum = (moleculeA * denominatorB) + (moleculeB * denominatorA);
        int denominatorSum = (denominatorA * denominatorB);
        int moleculeSumCopy = moleculeSum;
        int denominatorSumCopy = denominatorSum;
        int rad = 1;
        if (moleculeSum > denominatorSum) {
            if (moleculeSum % denominatorSum != 0) {
                while (moleculeSum % denominatorSum != 0) {
                    rad = moleculeSum % denominatorSum;
                    moleculeSum = denominatorSum;
                    denominatorSum = rad;
                }
                if (rad == 1) {
                    System.out.println(moleculeSumCopy + " " + denominatorSumCopy);
                } else {
                    moleculeSumCopy /= rad;
                    denominatorSumCopy /= rad;
                    System.out.println(moleculeSumCopy + " " + denominatorSumCopy);
                }
            } else {
                System.out.println(moleculeSum / denominatorSum + " " + 1);
            }
        } else {
            if (denominatorSum % moleculeSum != 0) {
                while (denominatorSum % moleculeSum != 0) {
                    rad = denominatorSum % moleculeSum;
                    denominatorSum = moleculeSum;
                    moleculeSum = rad;
                }
                if (rad == 1) {
                    System.out.println(moleculeSumCopy + " " + denominatorSumCopy);
                } else {
                    moleculeSumCopy /= rad;
                    denominatorSumCopy /= rad;
                    System.out.println(moleculeSumCopy + " " + denominatorSumCopy);
                }
            } else {
                System.out.println(1 + " " + denominatorSum / moleculeSum);
            }
        }
    }
}