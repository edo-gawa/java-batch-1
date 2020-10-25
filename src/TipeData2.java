
public class TipeData2 {
	public static void main(String... argument) {
		/*  #VARIABEL
		 *  apaa itu variabel?
		 *  variabel adalah tempat untuk menampung sebuah value
		 *  cara penamaan variabel dalam nama depan variabel tidak boleh angka &,*(,). dan tidak boleh ada spasi
		 *  jika nama varibel panjang makan gunakan lah camel case, awal huruf variabel di sarankan huruf kecil 
		 *  contoh namaVariabelPanjangBanget.
		 *  
		 *  kapasitas dari sebuah variabel di tentukan dengan tipe valiabel nya
		 *  langkah dalam membuat sebuah variabel ada 2 langkah.
		 *  
		 *  langkah pertama trntukan tipe data nya, disini saya menggunakan tipe String yang artinya dapat menampung symbol,anfka dan huruf
		 *  langkah kedua memberikan nama variabel
		 *  
		 *  #DEKLARASI VARIABEL
		 *  apa itu deklarasi variabel
		 *  deklarasi variabel adalah membuat variabel tanpa mengisi value dari variebl tersebut
		 *  contoh nya : [TIPEDATA] [namaVariabel] ;
		 *  			  String      nama;
		 *  
		 *  secara default jika kita tidak mengisi value dari variabel tsb makan variabel tsb akan memiliki nilai null
		 *  
		 *  #INISIALISASI VARIABEL
		 *  apa itu inisialisasi variabel?
		 *  inisialisasi adalah langkah untuk memberikan bilai terhadap variabel dengan menggunakan operator =
		 *  cara mengisikan atau memberikan nilai haruslah sesuai dengan tipe dari variabel tersebut
		 *  contoh 1: String namaVariabel = "isi variabel";
		 *  
		 *  di sana saya menggunakan operator = untuk mengisi nilai varibel lalu di ikuti tanda kutip 2
		 *  kenapa memkai tanda kutip ? tentusaja karena variabel tersebut bertipe String ,jado di haruskan memakai kutip 2
		 *  
		 *  
		 *  contoh 1: int namaVariabel = 100;
		 *  di sana saya menggunakan operator = untuk mengisi nilai varibel lalu tanpa di ikuti tanda kutip 2
		 *  kenapa tanpa memkai tanda kutip 2? tentusaja karena variabel tersebut bertipe Stntring ,jadi di haruskan tidak oleh ada kutip 2
		 * 
		 */
		
		
		String exString = "tipe untuk menampung symbol,anfka dan huruf";//di wajibkan memakai kutip 2
		
		boolean exBoolean = true;// tipe data ini hanya bisa menampung value benar atau salah(true or false)
		
		int exBilanaganBulat = 1000; // tipe data ini hanya bisa menampung value bilangan bulat
		
		double bilanganDecimal = 100.00;// tipe data ini hanya bisa menampung value bilangan bulat decimal
		
		/*sekarang kita coba print isi dari variabel yang sudha kita buat
		 */
		
		System.out.println(exString);
		System.out.println(exBoolean);
		System.out.println(exBilanaganBulat);
		System.out.println(bilanganDecimal);
		
		/*kenapa saat mencetak tidak menggunakan tanpda utip 2 seperti ini
		 */
		
		
		System.out.println("exString");
		System.out.println("exBoolean");
		System.out.println("exBilanaganBulat");
		System.out.println("bilanganDecimal");
		
	/*
	 * jika kita menggunakan tanda kutip 2 ,maka stream output(System.out.println) akan membaca apa ayng ada di dalam () sebagai string bukan sebagai variabel
	 * 
	 */
		
	}
}
