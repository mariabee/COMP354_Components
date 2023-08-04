import java.util.ArrayList;  
public class CustomerTesting {
	public static void main(String[] args) {
		//PRODUCTS 
		ProductModel apple = new ProductModel("Apple", 2.4, "A description of the product", 1.25, 5, "imagesrc"); 
		ProductModel pear = new ProductModel("Pear", 2.4, "A description of the product", 2.25, 5, "imagesrc"); 
		ProductModel orange = new ProductModel("Orange", 2.4, "A description of the product", 0.25, 5, "imagesrc");
		ProductModel brocolli = new ProductModel("Brocoli", 2.4, "A description of the product", 3.25, 5, "imagesrc");
		ProductModel lettuce = new ProductModel("Lettuce", 2.4, "A description of the product", 5.25, 5, "imagesrc"); 
		ProductModel juice = new ProductModel("Orange Juice", 2.4, "A description of the product", 8.25, 5, "imagesrc");
		ProductModel crackers = new ProductModel("Cracker", 2.4, "A description of the product", 1.05, 5, "imagesrc"); 
		ProductModel Milk = new ProductModel("Milk", 2.4, "A description of the product", 1.75, 5, "imagesrc"); 
		ProductModel Cereal = new ProductModel("Cereal", 2.4, "A description of the product", 5.85, 5, "imagesrc"); 
		ProductModel avocado = new ProductModel("Avocado", 2.4, "A description of the product", 1.95, 5, "imagesrc"); 
		
		ArrayList<ProductModel> products = new ArrayList<ProductModel>(); 
		
		products.add(Cereal);
		products.add(crackers);
		products.add(juice); 
		products.add(lettuce); 
		products.add(orange);
		products.add(apple); 
		products.add(pear); 
		products.add(brocolli); 
		products.add(Milk); 
		products.add(avocado); 
		 
		
		BasketModel basket = new BasketModel(); 
		basket.addProduct(avocado);
		basket.addProduct(Cereal);
		basket.addProduct(crackers);
		basket.updateQuantity(avocado, 3);
		basket.updateQuantity(Cereal, 2);
		
		//CUSTOMER MODEL TESTING 
		
		//CHECKOUT TESTING 
		for (ProductModel item : basket.getItems()) {
			System.out.println("Total purchases of " + item.getName() + ": " + item.getTotalPurchases());
		}
		System.out.println();
		
		CustomerModel customer = new CustomerModel(); 
		customer.setCustomerBasket(basket);
		customer.checkout();
		
		customer.getCustomerBasket().isEmpty(); 
		
		System.out.println("Total purchases of " + avocado.getName() + ": " + avocado.getTotalPurchases());
		System.out.println("Total purchases of " + Cereal.getName() + ": " + Cereal.getTotalPurchases());
		System.out.println("Total purchases of " + crackers.getName() + ": " + crackers.getTotalPurchases());
		
	}
	
}
