import java.util.Scanner;

public class Aritmatika {

public static void main (String args[]) {

	Scanner input = new Scanner(System.in);

	System.out.println("");
	System.out.println("PENAMBAHAN");
	System.out.println("---------------------------");
	System.out.print("Masukan Bilangan 1 :");
	int cd1 = input.nextInt();
	System.out.print("Masukan Bilangan 2 :");
	int cd2 = input.nextInt();
	int hasil = cd1 + cd2;
	System.out.println("Hasil Tambah = " +hasil);
	System.out.println("");
	System.out.println("---------------------------");

	System.out.println("");
	System.out.println("PENGURANGAN");
	System.out.println("---------------------------");
	System.out.print("Masukan Bilangan 1 :");
	cd1 = input.nextInt();
	System.out.print("Masukan Bilangan 2 :");
	cd2 = input.nextInt();
	hasil = cd1 - cd2;
	System.out.println("Hasil Kurang = " +hasil);
	System.out.println("");
	System.out.println("---------------------------");

	System.out.println("");
	System.out.println("PERKALIAN");
	System.out.println("---------------------------");
	System.out.print("Masukan Bilangan 1 :");
	cd1 = input.nextInt();
	System.out.print("Masukan Bilangan 2 :");
	cd2 = input.nextInt();
	hasil = cd1 * cd2;
	System.out.println("Hasil Kali = " +hasil);
	System.out.println("");
	System.out.println("---------------------------");

	System.out.println("");
	System.out.println("PEMBAGIAN");
	System.out.println("---------------------------");
	System.out.print("Masukan Bilangan 1 :");
	cd1 = input.nextInt();
	System.out.print("Masukan Bilangan 2 :");
	cd2 = input.nextInt();
	hasil = cd1 / cd2;
	System.out.println("Hasil Bagi = " +hasil);
	System.out.println("");
	System.out.println("---------------------------");
	
	System.out.println("");
	System.out.println("MODULUS");
	System.out.println("---------------------------");
	System.out.print("Masukan Bilangan 1 :");
	cd1 = input.nextInt();
	System.out.print("Masukan Bilangan 2 :");
	cd2 = input.nextInt();
	hasil = cd1 % cd2;
	System.out.println("Hasil Modulus = " +hasil);
	System.out.println("");
	System.out.println("---------------------------");
	
	
	
	}

}