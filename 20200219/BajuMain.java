class BajuMain{
	public static void main(String [] args){
	
		Kelas bm1 = new Kelas("kemeja", 4, "ojan");
		Kelas bm2 = new Kelas("daster", 4, "nanag");
		Kelas bm3 = new Kelas("singlet" ,5, "indra");
		
		System.out.println(bm1.nama+" memakai baju ukuran "+ bm1.ukuran + "dan memakai model " + bm1.model);
		System.out.println(bm2.nama+" memakai baju ukuran "+ bm2.ukuran + "dan memakai model " + bm2.model);
		System.out.println(bm3.nama+" memakai baju ukuran "+ bm3.ukuran + "dan memakai model " + bm3.model);
	
	}
}
