import java.util.Scanner;

public class StreamInput1 {


public static void main(String[] args) {

	String nama,alamat,usia;
	int batch;

//Scaner
 Scanner keyboard = new Scanner(System.in);
//tampilkanoutput
System.out.println("Data training java");


//Menyimpanhasilscaner/ketikan
System.out.print("Nama: ");
nama = keyboard.nextLine();

        System.out.print("Alamat: ");
       
        alamat = keyboard.nextLine();

        System.out.print("Usia: ");
        usia = keyboard.nextLine();

        System.out.print("batch: ");
        batch = keyboard.nextInt();

 // Menampilkan apa yang sudah simpan di variabel
        System.out.println("--------------------");

        System.out.println("Nama Siswa: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("Batch:  " + batch);	
	System.out.println("--------------------");
	}

}