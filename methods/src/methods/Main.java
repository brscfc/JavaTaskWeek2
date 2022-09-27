package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();							//fonksiyon kullanarak sayibulmacayı projemizde istediğimiz yerde kullanabiliriz.
		sayiBulmaca();						 	//Bu şekilde kendimizi tekrar etmekten ve kodu tekrar yazmaktan kurtulmuş oluruz.
		sayiBulmaca();							//metod isimleri camelCase şeklinde yazılır.
		sayiBulmaca();	
	}
	public static void sayiBulmaca () {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 6;

		boolean varMi = false;
		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}
		if (varMi) {												//direkt true'ya eşitliyor. if ile kullanınca..
			mesajVer("Sayi Mevcuttur:"+aranacak);
			
		} else {
			mesajVer("Sayı Mevcut Değildir:"+aranacak);
		}
	}
	public static void mesajVer(String mesaj ) {				//sys kodunda aranacak sayıyı gösterdiğimizde diğer metodun içinde 
		System.out.println(mesaj);							  //olduğu için sayıyı göremiyor. Bu yüzden parametreli metod kullanırız.
															//int aranacak atatdık bu yüzden.
	}
}
