package classes;

public class Main { // claslar referans tiptir. reference type.

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2; // bu eşitlikle customerManager'in referans numarası customerManager2'nin
											// referansna eşitlendi. 
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update(); 			// Bir classı kullanabilmemiz için onu new'lememiz gerekir yukarıdaki örnekte
											// olduğu gibi.
	 										// iki tür bellek var Stack ve Heap olmak üzere.
	//value değer okuma.	
	int sayi1 = 10;
	int sayi2 = 20;
	sayi2=sayi1;
	sayi1=30;
	System.out.println(sayi2);
	
	int sayilar1[] = new int[] {7,3,4};
	int sayilar2[] = new int[] {2,9,6};
	sayilar2=sayilar1;
	sayilar1[2]=35;
	System.out.println(sayilar2[2]);
	
	}
}
