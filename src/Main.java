import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mesafeKm;
        float taksimetreTutarı;

        float kmÜcreti = 2.20f;
        int minimumTutar = 20, açılışÜcreti = 10;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Gidilen mesfaeyi giriniz (km): ");
        mesafeKm = scanner.nextInt();

        taksimetreTutarı = Math.max(minimumTutar, açılışÜcreti + kmÜcreti * mesafeKm);

        System.out.println("Taksimetre tutar: " + taksimetreTutarı + "TL.");

    }
}
