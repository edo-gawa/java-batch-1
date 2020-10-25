
public class ImplementasiTipedata3 {

	
	public static void main(String... argument) {
		String nama = "Ahmad Ridhwan";
		String jabatan = "Application Integratioin Development";
		int umur = 29;
		int saldoRekA = 100_000_000;
		int saldoRekB = 100_000_000;
		int totalSaldo=saldoRekA+saldoRekB;
		
		
		/* tanda + adalah tanda penghubung hanya berlaku jika string bertemu string, String bertemu int atau int bertemu String dan String
		 * 
		 * jika int bertemu int maka akan menjadi operasi artikmatika yaitu penjumlahan
		 * 
		 */
		
		//contoh String betemu dengan String
				String hasil=nama+jabatan;
				System.out.println("contoh String bertemu String : "+hasil);
				
				//contoh String betemu dengan int 
				 hasil=nama+umur;
				System.out.println("contoh String bertemu int : "+hasil);
				
				//contoh int betemu dengan String
				 hasil=umur+nama;
				System.out.println("contoh int bertemu String : "+hasil);
				
				//contoh int betemu dengan int
				System.out.println("contoh int bertemu int : "+totalSaldo);
		
		
		
		//cara 1 contoh String betemu dengan String
		String biodata= "nama : "+nama+" - posisi : "+jabatan+" - umur : "+umur+" : "+umur+"(tahun) - "+" tabungan : Rp."+totalSaldo;
		System.out.println("cara 1 ->: "+biodata);
		
		
		//cara 2 
		System.out.println("Cara 2  -> nama : "+nama+" - jabatan : "+jabatan+" - umur : "+umur+"(tahun) -  tabungan Rp."+(saldoRekA+saldoRekB));
	
		//cara bar bar
		System.out.println("Cara Barbar -> nama : Ahmad Ridhwan  - jabatan : Application Integratioin Development - umur : 29(tahun) -  tabungan Rp.290.000.000");
		
	
	}
}
