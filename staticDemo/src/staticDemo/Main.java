package staticDemo;

public class Main {

	public static void main(String[] args) {
		
		ProductManager productManager = new ProductManager();
		
		Product product1 = new Product();
		product1.name = "Mouse";
		product1.price = 10;
		
		productManager.add(product1);
		
		DatabaseHelper.Crud.delete();

	}

}
