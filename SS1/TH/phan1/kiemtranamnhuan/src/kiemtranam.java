import java.util.Scanner;
public class kiemtranam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year ;
        System.out.println("Enter a year ");
        year = scanner.nextInt();
        boolean isLearYear = false;
        boolean isDivisibleBy4 = year % 4 ==0;
        if (isDivisibleBy4) {
            boolean isDisvibleBy100 = year % 100 ==0;
            if(isDisvibleBy100) {
                boolean isDisvibleBy400 = year % 400 == 0;
                if (isDisvibleBy400) {
                    isDisvibleBy400 = true;
                }
            } else {
                isLearYear = true;
            }
        }
        if (isLearYear){
            System.out.printf("%d is lear year ", year);

        } else {
            System.out.printf("%d not is lear year", year);
        }
    }
}
