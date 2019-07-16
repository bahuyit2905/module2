import java.util.Scanner;
public class chuyendoitiente {
    public static void main(String[] args) {
        double vnd = 230000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.print("moi ban nhap tien usd");
        usd = scanner.nextDouble();
        double quydoi = usd * 23000;
        System.out.print("Gia tien viet nam dong la:" + quydoi );

    }
}
