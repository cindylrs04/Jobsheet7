import java.util.Scanner;
public class WhileKelipatan08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int kelipatan, Ratarata = 0, total = 0, counter = 0;

        System.out.print("Masukkan bilangan kelipatan (1-9) : ");
        kelipatan = scan.nextInt();

        int i = 1;
        while (i <= 50) {
            if (i % kelipatan == 0) {
                total += 1;
                counter++;
                Ratarata = total / counter;
            }
            i++;
        }
        System.out.printf("Banyaknya %d dari 1 sampai 50 adalah %dn", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adlah %d\n", kelipatan, total);
        System.out.printf("Rata rata adalah " + Ratarata);
    }
}
