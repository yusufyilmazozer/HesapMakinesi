import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int a, b, select;
        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz : ");
        a = input.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        b = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz : ");
        select = input.nextInt();

        switch(select) {
            case 1: System.out.print("İşlemin sonucu : " + (a+b));
                break;
            case 2: System.out.print("İşlemin sonucu : " + (a-b));
                break;
            case 3: System.out.print("İşlemin sonucu : " + (a*b));
                break;
            case 4: if (b==0) System.out.print("Herhangi bir sayı 0`a bölünemez");
                    else
                System.out.print("İşlemin sonucu : " + (a/b));
                break;
            default: System.out.print("Yanlış işlem yaptınız");
        }
    }
}
