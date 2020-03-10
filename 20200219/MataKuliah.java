class MataKuliah{
	String matkul;
	String dosen;
	int nip;
	
	//Constructor
	public MataKuliah(String matkul, String dosen, int nip){
		this.matkul = matkul;
		this.dosen = dosen;
		this.nip = nip;
	}
	
	public String toString(){
		return "mata kuliah " + matkul + " diampu oleh pak " + dosen + "yang memiliki nip" + nip;
	}	
}
