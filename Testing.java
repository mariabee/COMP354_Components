import java.util.ArrayList;  
public class Testing {
	public static void main(String[] args) {
		//PRODUCT MODEL TESTING 
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
		
		for (ProductModel product : products) {
			System.out.println("Product: " + product.getName() + "; quantity: " + product.getQuantity());
		}
		//Testing for isInStock() 
		for (ProductModel product : products) {
			product.isInStock(); 
		}
		
		int i = 0;
		for (ProductModel product : products) {
			if (i%2 == 0) {
				product.setQuantity(0);
			}
			i++; 
		}
		
		for (ProductModel product : products) {
			System.out.println("Product: " + product.getName() + "; quantity: " + product.getQuantity());
		}
		
		for (ProductModel product : products) {
			product.isInStock(); 
		}
		
		System.out.println();
		System.out.println();
		//TESTING FOR calculateSuggestion() 
		
		orange.calculateSuggestion(); 
		
		orange.purchaseHistory.add(Cereal); 
		orange.counts.add(1);
		orange.purchaseHistory.add(crackers); 
		orange.counts.add(1);
		orange.purchaseHistory.add(lettuce); 
		orange.counts.add(1);
		orange.totalPurchases = 10; 
		
		System.out.println();
		i = 0; 
		System.out.println("Total purchases containing orange : 10");
		ProductModel suggestion = null; 
		while(suggestion == null) {
			orange.counts.add(0, i);
			System.out.println("Total purchases containing Cereal : " + (i));
			suggestion = orange.calculateSuggestion(); 
			i++;
			System.out.println();
		}
		
		orange.addSuggestedItem(); 
		System.out.println();
		//BASKET MODEL TESTING 
		
		BasketModel basket = new BasketModel(); 
		basket.addProduct(orange);
		System.out.println(basket);
		
		basket.addProduct(avocado);
		basket.addProduct(Cereal);
		basket.addProduct(crackers);
		
		basket.updateQuantity(avocado, 3);
		basket.updateQuantity(Cereal, 2);
		
		System.out.println(basket);
		
		basket.removeProduct(avocado); 
		System.out.println(basket);
		
		basket.clear();
		System.out.println(basket);
		
	}
	
}
