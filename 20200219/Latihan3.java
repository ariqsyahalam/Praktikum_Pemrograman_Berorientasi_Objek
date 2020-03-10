class Latihan3{
	public static void main(String args[]){
		//int panjang1 = 16;
		//int lebar1 = 8;
		//String warna1 = "putih";
		
		PapanTulis pp1 = new PapanTulis(16,8);
		
		//int panjang2 = 9;
		//int lebar2 = 7;
		//String warna2 = "biru";
		PapanTulis pp2 = new PapanTulis(9, 7);
		
		//int panjang3 = 6;
		//int lebar3 = 3;
		//String warna3 = "merah";
		PapanTulis pp3 = new PapanTulis(6,3);

		System.out.println("papan tulis warna:" + pp1.warna + " dengan panjang:" + pp1.panjang +" dan lebar:"+ pp1.lebar);
		System.out.println("papan tulis warna:" + pp2.warna + " dengan panjang:" + pp2.panjang +" dan lebar:"+ pp2.lebar);
		System.out.println("papan tulis warna:" +pp3.warna + " dengan panjang:" + pp3.panjang +" dan lebar:"+ pp3.lebar);
	
	}
}