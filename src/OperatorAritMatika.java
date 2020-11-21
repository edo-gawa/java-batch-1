import java.util.Scanner;

public class OperatorAritMatika {

	public static void main(String...arg) {
		
		Scanner input = new Scanner(System.in);
		/*		operator aritmatika
		 * 
		 * 		+ penambahan
		 * 		- pengurangan
		 * 		* perkalian
		 * 		/ pembagian
		 * 		% hasil sisa bagi
		 * 
		 * 		fungsi operator aritmatika hanya bisa digunakan untuk bilangan (angka)
		 */
		
		System.out.println("=============================================================");
		System.out.println("\t\t\t\tPENJUAMLAHAN");
		System.out.print("Masukan bilangan 1 : ");
		int bilangan1=input.nextInt();
		System.out.print("Masukan Bilangan 2 : ");
		int bilangan2 = input.nextInt();
		int hasil = bilangan1+bilangan2;
		System.out.println("Haisl dari penjulahan Bilangan1 + Bilangan2 ( "+bilangan1+" + "+bilangan2+" ) = "+hasil);
		System.out.println("=============================================================");
		
		
		
		System.out.println("=============================================================");
		System.out.println("\t\t\t\tPENGURANGAN");
		System.out.print("Masukan Bilangan1 : ");
		bilangan1=input.nextInt();
		System.out.print("Masukan Bilangan2 : ");
		bilangan2=input.nextInt();
		hasil=bilangan1-bilangan2;
		System.out.println("Haisl dari Pengurangan Bilangan1 -  Bilangan2 ( "+bilangan1+" - "+bilangan2+" ) = "+hasil);
		
		
		System.out.println("=============================================================");
		System.out.println("\t\t\t\tPERKALIAN");
		System.out.print("Masukan Bilangan1 : ");
		bilangan1=input.nextInt();
		System.out.print("Masukan Bilangan2 : ");
		bilangan2=input.nextInt();
		hasil=bilangan1*bilangan2;
		System.out.println("Haisl dari Perkalian Bilangan1 x  Bilangan2 ( "+bilangan1+" x "+bilangan2+" ) = "+hasil);
		
		System.out.println("=============================================================");
		System.out.println("\t\t\t\tPEMBAGIAN");
		System.out.print("Masukan Bilangan1 : ");
		bilangan1=input.nextInt();
		System.out.print("Masukan Bilangan2 : ");
		bilangan2=input.nextInt();
		hasil=bilangan1/bilangan2;
		System.out.println("Haisl dari Pembagian Bilangan1 /  Bilangan2 ( "+bilangan1+" / "+bilangan2+" ) = "+hasil);
		
		
		System.out.println("=============================================================");
		System.out.println("\t\t\t\t SISA BAGI");
		System.out.print("Masukan Bilangan1 : ");
		bilangan1=input.nextInt();
		System.out.print("Masukan Bilangan2 : ");
		bilangan2=input.nextInt();
		hasil=bilangan1%bilangan2;
		System.out.println("Haisl dari Pembagian Bilangan1 % Bilangan2 ( "+bilangan1+" % "+bilangan2+" ) = "+hasil);
		
	}
}
