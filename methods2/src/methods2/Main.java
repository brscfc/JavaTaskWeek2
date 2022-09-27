package methods2;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		String yeniMesaj = şehirVer();
		System.out.println(yeniMesaj);
		int sayi = topla(3, 2);
		System.out.println(sayi);
		int toplam = topla2(1, 8, 3, 5);
		System.out.println(toplam);
	}

	public static void ekle() {
		System.out.println("Eklendi");
	}

	public static void sil() {
		System.out.println("Silindi");
	}

	public void guncelle() {
		System.out.println("Güncellendi");
	}

	public static int topla2(int... sayilar) {	//int ... variable argument şeklindedir birden fazla integer göndermek için kullanılr.
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam = toplam + sayi;
		}
		return toplam;

	}

	public static String şehirVer() {
		return "Ankara";

	}

	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
}
