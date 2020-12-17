import java.util.Scanner;

public class SaldoAkhirTabungan{
    static int saldoAkhir;
    static void hitung(int a, int b){
        saldoAkhir = (a + (a*b/100));
    }

    public static void main(String[] args) {

        int SaldoAwal;
        int Bunga;
        int LamaMenabung;
        int Tahunan;


        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan saldo awal= ");
        SaldoAwal = in.nextInt();
        System.out.print("Masukkan bunga (dalam %)= ");
        Bunga = in.nextInt();
        System.out.print("Masukkan lama menabung (dalam tahun)= ");
        Tahunan = in.nextInt();
        System.out.println("------------------------------------------------------------------------");



        for (LamaMenabung=1; LamaMenabung<=Tahunan; LamaMenabung++) {
            hitung(SaldoAwal,Bunga);


            System.out.println("Bulan ke "+LamaMenabung);
            System.out.println("Saldo awal= "+SaldoAwal);
            System.out.println("Bunga= "+Bunga+"% per tahun, jadi bunga yang anda dapat= "+SaldoAwal*Bunga/100);
            System.out.println("Saldo akhir anda adalah= "+saldoAkhir);
            System.out.println("------------------------------------------------------------------------");
            SaldoAwal = saldoAkhir;
        }

    }

}