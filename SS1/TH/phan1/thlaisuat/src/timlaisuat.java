import java.util.Scanner;
public class timlaisuat {
    public static void main(String[] args) {
        double sotiengui;
        int thang;
        double tilelai;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so tien dau tu");
        sotiengui = scanner.nextDouble();
        System.out.println("nhap so thang");
        thang = scanner.nextInt();
        System.out.println("nhap ti le lai suat");
        tilelai = scanner.nextDouble();
        double sotienlai = 0;
        for(int i = 0 ; i < thang ; i++ ) {
            sotienlai = sotiengui * (tilelai/100)/12*3;
        }
        System.out.println("Tong so tien gui" + sotiengui);

    }
}
