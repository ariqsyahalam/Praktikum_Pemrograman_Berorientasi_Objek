class KelasMain{
	public static void main(String [] args){
	
		Kelas km1 = new Kelas(2,2, "merah");
		Kelas km2 = new Kelas(4, 4, "biru");
		Kelas km3 = new Kelas(5,5, "kuning");
		
		Mahasiswa mh1 = new Mahasiswa(22452,3, "bejo");
		Mahasiswa mh2 = new Mahasiswa(23454, 4, "agung");
		Mahasiswa mh3 = new Mahasiswa(52315,3, "agus");
		
		MataKuliah mk1 = new MataKuliah("mengambar","herman", 23452);
		MataKuliah mk2 = new MataKuliah("menari", "hendra", 35632);
		MataKuliah mk3 = new MataKuliah("menulis","hendri", 63563);
		
		System.out.println(km1);
		System.out.println(km2);
		System.out.println(km3);
		
		System.out.println(mh1);
		System.out.println(mh2);
		System.out.println(mh3);
		
		System.out.println(mk1);
		System.out.println(mk2);
		System.out.println(mk3);
	
	}
}
