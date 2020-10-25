import java.util.Scanner;

public class StreamInput {
	 public static void main(String[] args) {
		    Scanner streamInput = new Scanner(System.in);  // membuat variabel stream input bertipe Scanner
		    System.out.print("masukan Nama :  ");
		    String nama=streamInput.nextLine(); 
		    /*
		     * membuat variabel nama bertipe string dan mengisi nya dengan value yang di ketikan keyboard 
		     * sampa di tekan enter
		     */
		    
		    System.out.print("(masukan bilangan bulat tanpa kutip dua)Umur Kamu : ");
		    int umur = streamInput.nextInt();
		    
		    
		    System.out.println("Nama Kamu :  "+nama);
		    System.out.println("Umur Kamu :  "+umur);
		    streamInput.close();//menutup stream input,agak tidak terbuka dalam memory
		    
		    
		    /*
		     * yang perlu di perhatikan adalah 
		     * penggunakan fungi read dari stream input sesuai dengan yang di ketikan keyboard
		     * dan juga membuat variabel untuk menampung isi dari hasil read stream input harus sesuai tipe data nya
		     * 
		     * di atas saya membuat variabel umur bertipe int, kenapa saya membuat nya dengn tipe int?
		     * karena streamInputsata menggunakan metode nextInt() yang artinya stream streamNextInt() hanya dapat membaca inputan keyboard bertipe bilangan bulat
		     * 
		     */
		    
		    
		  }
}
