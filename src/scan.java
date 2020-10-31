import java.util.Scanner;

public class scan{

	public static void main(String[] args) {
	Scanner streamInput = new Scanner(System.in);
	
	System.out.println("Biodata");
	
	System.out.print("Masukan nama : ");
		String nama=streamInput.nextLine();
	
	System.out.print("Masukan status : ");
		String status=streamInput.nextLine();
	
	System.out.print("Masukan umur : ");
		String umur=streamInput.nextLine();
               System.out.println("-----------");
	System.out.println("~|Nama :  |~ "+nama);
	System.out.println("-----------");
	  System.out.println("~|Status :|~ "+status);
	System.out.println("-----------");
 	   System.out.println("~|Umur :  |~  "+umur);
	    System.out.println("-----------");
	     streamInput.close();
	
	}
}