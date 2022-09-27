package methodOverloading;

public class DortIslem {
	public int topla(int sayi1, int sayi2) {
		return sayi1+sayi2;
	}													//ikinci bir işlem için işlem  adı diğer işlemlerle aynı olabilir çünkü
														// metodlar parametre imzalıdır.
	public int topla(int sayi1, int sayi2, int sayi3) {
		return sayi1+sayi2+sayi3;
	}
}
