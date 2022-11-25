package staticDemo;

public class ProductManager {
	
	public void add(Product product) {

		if (ProductValidator.isValid(product)) {
			System.out.println("Ürün Eklendi: " + product.name);
		} else {
			System.out.println("Ürün Bilgileri Geçersiz.");
		}

		ProductValidator productValidator = new ProductValidator();
		productValidator.bisey();

	}

}
