
public class Product {		//product clasını ancak ve ancak aşağıdaki bilgileri kullanmak kaydıyla kullanabiliriz.
	
	public Product (int id, String name, String description, double price, int stockAmount, String renk) {					
		System.out.println("Yapıcı blok çalıştı");
		this.id=id;
		this.name=name;
		this.description=description;
		this.price=price;
		this.stockAmount=stockAmount;
		this.renk=renk;											//Construction default olarak new'lenen alanda bulunur zaten. 
	}											  // Main, clasında Product product = new Product ()'a referans olur.
	
	public Product () {
		
	}
	
	// attribute / field
	private int id; 				// this, içerisinde bulduğum class'ı ifade eder.
	private String name; 			// değişkenlerin başına "_" çekerek başka dizilerdeki değişkenlerle karışmasını önlemek gerek.									
	private String description;
	private double price;
	private int stockAmount;
	private String renk;
	private String kod;

		//getter
	public int getId() {
		return id;
	}

		// setter
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public String getKod() { 						// önreğin "kod"un düzenlenmesine izin vermeyeceksek set kısmını silip sadece
													// okunmasını sağlayabiliriz ve ne olarak okunacağını da yazmamız gerekir.
		return this.name.substring(0 , 1) +id;		//örnekteki gibi.
	}

}
