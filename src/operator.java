import java.util.Scanner;

public class Operator {

	public static void main (String args[]){

		Scanner angka = new Scanner(System.in);
		System.out.print("Masukan Angka ke-1 : ");
		int a = angka.nextInt();


		System.out.print("Masukan Angka ke-2 : ");
		int b = angka.nextInt();

		boolean hasil = (a > b) || (a < b) || (a != b);
		boolean hasil1 = (a >= b) && (b <= a) && (a == b);
		System.out.println("");
		System.out.println("Hasil 1 :" +hasil);
		System.out.println("Hasil 2 :" +hasil1);
	}
}