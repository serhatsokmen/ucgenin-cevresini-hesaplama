import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int kenar1,kenar2,kenar3;

        System.out.print("1. kenar uzunlugunu giriniz : ");
        kenar1 = scan.nextInt();

        System.out.print("2. kenar uzunlugunu giriniz : ");
        kenar2 = scan.nextInt();

        System.out.print("3. kenar uzunlugunu giriniz : ");
        kenar3 = scan.nextInt();

        if(kenar1 == kenar2 && kenar2 == kenar3)
            System.out.println("girdiginiz ucgen eskenar bir ucgendir ve cevresi : "+(kenar1+kenar2+kenar3));
        else if(kenar1 == kenar2 && kenar2 != kenar3 || kenar1 == kenar3 && kenar3!= kenar2 || kenar2 == kenar3 && kenar3 != kenar1)
            System.out.println("girdiginiz ucgen ikizkenardir ve cevresi : "+(kenar1+kenar2+kenar3));
        else
            System.out.println("girdiginiz ucgenin cevresi : "+(kenar1+kenar2+kenar3));

    }
}