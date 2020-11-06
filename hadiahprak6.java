import java.util.Scanner;
class pln{
	String nama;
	String alamat;
	int tipe;
	int blok1;
	int blok2;
	int bayar;
	
	public String getNama(){
		return nama;
	}
	public void setNama(String nama){
		this.nama = nama;
	}
	public String getAlamat(){
		return alamat;
	}
	public void setAlamat(String alamat){
		this.alamat = alamat;
	}
	public int getTipe(){
		return tipe;
	}
	public void setTipe(int tipe){
		this.tipe = tipe;
	}
	public int getBlok1(){
		return blok1;
	}
	public void setBlok1(int blok1){
		this.blok1 = blok1;
	}
	public int getBlok2(){
		return blok2;
	}
	public void setBlok2(int blok2){
		this.blok2 = blok2;
	}
	public int getBayar(){
		return bayar;
	}
	public void setBayar(int bayar){
		this.bayar = bayar;
	}
	
}

public class hadiahprak6{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		pln a = new pln();
		int kembalian;
		boolean loop = true;
		
		System.out.print("Masukkan Nama = ");
		a.nama = input.nextLine();
		System.out.print("Masukkan Alamat = ");
		a.alamat = input.nextLine();
		System.out.println();
		System.out.println("Tipe: ");
		System.out.println("1. Tipe 36");
		System.out.println("2. Tipe 37");
		System.out.print("Tipe Yang Dipilih = ");
		a.tipe = input.nextInt();
		System.out.println();
		
		while(loop){
			switch(a.tipe){
				case 1:	System.out.println("Blok: ");
						System.out.println("1. Blok A = Rp. 500.000");
						System.out.println("2. Blok B = Rp. 300.000");
						System.out.print("Blok Yang Dipilih = ");
						a.blok1 = input.nextInt();
						System.out.println();
						
						switch (a.blok1){
							case 1:	System.out.print("Bayar = ");
									a.bayar = input.nextInt();
									kembalian = a.bayar - 500000;
									System.out.println();
									System.out.println("Nama = "+a.getNama());
									System.out.println("Alamat = "+a.getAlamat());
									System.out.println("Harga Bayar = Rp. 500.000");
									System.out.println("Bayar = "+a.getBayar());
									System.out.println("Kembalian = "+kembalian);
									loop = false;
									break;
									
							case 2:	System.out.print("Bayar = ");
									a.bayar = input.nextInt();
									kembalian = a.bayar - 300000;
									System.out.println();
									System.out.println("Nama = "+a.getNama());
									System.out.println("Alamat = "+a.getAlamat());
									System.out.println("Harga Bayar = Rp. 300.000");
									System.out.println("Bayar = "+a.getBayar());
									System.out.println("Kembalian = "+kembalian);
									loop = false;
									break;
							default:System.out.println("Masukkan Blok Dengan Benar!!!");
						}
						loop = false;
						break;
						
				case 2:	System.out.println("Blok: ");
						System.out.println("1. Blok A = Rp. 800.000");
						System.out.println("2. Blok B = Rp. 600.000");
						System.out.print("Blok Yang Dipilih = ");
						a.blok2 = input.nextInt();
						System.out.println();
						
						switch (a.blok2){
							case 1:	System.out.print("Bayar = ");
									a.bayar = input.nextInt();
									kembalian = a.bayar - 800000;
									System.out.println();
									System.out.println("Nama = "+a.getNama());
									System.out.println("Alamat = "+a.getAlamat());
									System.out.println("Harga Bayar = Rp. 800.000");
									System.out.println("Bayar = "+a.getBayar());
									System.out.println("Kembalian = "+kembalian);
									loop = false;
									break;
									
							case 2:	System.out.print("Bayar = ");
									a.bayar = input.nextInt();
									kembalian = a.bayar - 600000;
									System.out.println();
									System.out.println("Nama = "+a.getNama());
									System.out.println("Alamat = "+a.getAlamat());
									System.out.println("Harga Bayar = Rp. 600.000");
									System.out.println("Bayar = "+a.getBayar());
									System.out.println("Kembalian = "+kembalian);
									loop = false;
									break;
							default:System.out.println("Masukkan Blok Dengan Benar!!!");
						}
						loop = false;
						break;
				default:System.out.println("Tipe Yang Anda Masukkan Salah");
			}
			break;
		}
	}
}