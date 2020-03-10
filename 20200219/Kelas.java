class Kelas{
	int panjang;
	int lebar;
	String warna;
	
	//Constructor
	public Kelas(int panjang, int lebar, String warna){
		this.panjang = panjang;
		this.lebar = lebar;
		this.warna = warna;
	}
	
	public String toString(){
		return "kelas " + warna + " memliki panjang " + panjang +" dan lebar " + lebar;
	}	
}
