
public class Main {

	public static void main(String[] args) {
		Product product = new Product(1, "Laptop", "Asus Laptop", 5000, 3, "siyah"); //bu şekilde de yazabiliriz.
		
		
		/*product.setName("Laptop"); 						// claslar'da single responsibility metodunu uygula.
		 product.setId(1);
		 product.setDescription("Asus Laptop");
		 product.setPrice(5000);							//her iki şekilde'de veri çağırabiliriz.
		 product.setStockAmount(3);
		 product.setRenk("siyah");*/

		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod());

	}

}

// Daha hızlı bir yöntem olan parametreli constructor'ı kullanbiliriz.