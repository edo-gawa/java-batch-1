import java.util.Scanner;

public class form1 {

	public static void main (String[] args){


		Scanner input = new Scanner(System.in);
		System.out.print("Masukan Nama : ");
		String nama = input.next();
		

		input.skip("\r");
		System.out.print("Masukan Umur : ");
		int umur = input.nextInt();
	

		
		System.out.print("Alamat : ");
		String alamat = input.next();
		

		
		System.out.print("Status : ");
		String status = input.next();
		

	System.out.print("|==========================|");
	System.out.println("\n| Nama Saya : " +nama);
	System.out.println("|--------------------------|");
	System.out.println("| Umur Saya : " +umur);
	System.out.println("|--------------------------|");
	System.out.println("| Alamat Saya : " +alamat);
	System.out.println("|--------------------------|");
	System.out.println("| Status Saya : " +status);
	System.out.println("|==========================|");
	input.close();

	}
}