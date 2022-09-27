package inhertianceDemo;

public class Main {

	public static void main(String[] args) {
		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(new OgretmenKrediManager());	//krediUI'dan BaseKrediManageri referans ettiğimiz için iki örneği de 
		krediUI.KrediHesapla(new TarimKrediManager());		//kullanabiliyoruz bu şekilde.
		krediUI.KrediHesapla(new AskerKrediManager());															
	}												//AskerKredi sonradan eklendi fakat direkt basekrediye extend ettiğimizde
												 //Direkt olarak eklenmiş olacaktır. if'lerle değil referans vermeyi çok iyi öğren
}
 