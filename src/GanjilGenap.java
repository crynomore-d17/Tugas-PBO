import java.util.Scanner;

public class GanjilGenap {
    public static void main(String[] args) {
            int angka;

            System.out.println("------");
            System.out.print("Masukkan angka : ");
            Scanner scanner = new Scanner(System.in);
            angka = scanner.nextInt();
            System.out.println("------");

            if (angka % 2 == 0)
                System.out.print("angka" + " adalah Bilangan Genap.\n");
            else
                System.out.println("angka" + " adalah Bilangan Ganjil.\n");
        }
    }
