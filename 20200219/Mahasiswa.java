class Mahasiswa{
	int nim;
	int ipk;
	String nama;
	
	//Constructor
	public Mahasiswa(int nim, int ipk, String nama){
		this.nim = nim;
		this.ipk = ipk;
		this.nama = nama;
	}
	
	public String toString(){
		return	nama + " pemilik nim " + nim + " dan mendapatkan ipk sebesar " + ipk;
	
	}	
}
