import java.util.Scanner;
public class uochung {
    public static void main(String[]args) {
    int a,b;
    Scanner scanner = new Scanner(System.in);
    System.out.print("nhap so a");
    a = scanner.nextInt();
    System.out.print("nhap so b");
    b = scanner.nextInt();
    a = Math.abs(a);
    b = Math.abs(b);
    if(a==0 || b==0)
        System.out.println("khong co uoc chung lon nhat");
    while(a != b) {
        if(a > b)
            a = a - b;
        else
            b = b - a;
        }
    System.out.println(" uoc chung lon nhat " + a );

    }


    }

