import java.util.Scanner;

public class Biodata {
        public static void main(String[] args) {
           	   Scanner input = new Scanner(System.in);
                   System.out.print("Masukan Nama : ");
                   
                   String nama =input.nextLine();
                   System.out.print("Asal sekolah : ");
                  
                   String asal=input.nextLine();
                   System.out.print("Usia : ");
                   int usia = input.nextInt();
                 
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("Nama Anda : "+nama);
        System.out.println("Asal Sekolah : "+asal);
        System.out.println("Usia : "+usia);
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        input.close();
		}
}