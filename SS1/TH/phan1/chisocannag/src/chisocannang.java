import java.util.Scanner;

public class chisocannang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("your weight");
        weight = scanner.nextDouble();
        System.out.println("you height");
        height = scanner.nextDouble();
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");
        bmi = scanner.nextDouble();
        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");
        }

}