import java.util.ArrayList; 
public class ProductModel {
	
	 
	int id; 
	static int totalProducts = 0; 
	private String name; 
	private Double weight;  
	private String description; 
	private Double price;  
	private int quantity;  
	private String previewImage; 
	private ProductModel suggestedItem; 
	
	//This is replacing the DB temporarily for testing purposes. 
	ArrayList<ProductModel> purchaseHistory; 
	ArrayList<Integer> counts; 
	int totalPurchases;  
	
	ProductModel(String name, double weight, String description, Double price, int quantity, String previewImage) {
		totalProducts++; 
		id = totalProducts; 
		this.name = name; 
		this.weight = weight; 
		this.description = description; 
		this.price = price; 
		this.quantity = quantity; 
		this.previewImage = previewImage; 
		purchaseHistory = new ArrayList<ProductModel>(); 
		counts = new ArrayList<Integer>(); 
	}
	
	void setName(String name) {
		this.name = name; 
	}
	boolean setWeight(double weight) {
		if (weight > 0) { 
		this.weight = weight;
		return true; 
		}
		System.out.println("Weight must be positive");
		return false; 
	}
	void setDescription(String description) {
		this.description = description; 
	}
	boolean setPrice(double price) {
		if (price > 0) {
			this.price = price; 
			return true; 
		}
		System.out.println("Price must be positive");
		return false; 
	}
	boolean setQuantity(int quantity) {
		if (quantity >= 0) {
			this.quantity = quantity; 
			return true; 
		}
		System.out.println("Quantity cannot be negative");
		return false; 
	}
	void setPreviewImage(String src) {
		this.previewImage = src; 
	}
	
	String getName() {
		return name; 
	}
	double getWeight() {
		return weight;  
	}
	String getDescription() {
		return description; 
	}
	double getPrice() {
		return price;
	}
	int getQuantity() {
		return quantity; 
	}
	String getPreviewImage() {
		return previewImage; 
	}
	ProductModel getSuggestedItem() {
		return suggestedItem; 
	}
	
	void updateProduct(ArrayList<ProductModel> products) {
		for (ProductModel product : products) {
			if (product.name == this.name) {  
				System.out.println("Updating existing product");
				product.setDescription(description);
				product.setName(name);
				product.setPrice(price); 
				product.setQuantity(quantity); 
				product.setWeight(weight); 
				product.setPreviewImage(previewImage);
				product.addSuggestedItem();
				return; 
			}
		}
		products.add(this); 
		System.out.println("Added new product");
	}
	void addSuggestedItem(ProductModel Product) {
		suggestedItem = Product; 
	}
	Boolean addSuggestedItem() {
		ProductModel item = calculateSuggestion(); 
		suggestedItem = item; 
		if (suggestedItem == null) return false; 
		return true; 
	}
	void removeSuggestedItem() {
		suggestedItem = null; 
	}
	boolean isInStock() {
		if (quantity <= 0) {
			System.out.println(name + " is not in stock.");
			return false;
		}
		System.out.println("There are " + quantity + " " + name + "(s) in stock.");
		return true; 
	}
	ProductModel calculateSuggestion() {
		int i = 0; 
		if (purchaseHistory.isEmpty()) {
			System.out.println("No purchase history recorded for " + name);
			return null; 
		}
		for (ProductModel item : purchaseHistory) {
			double count = counts.get(i); 
			if (count/totalPurchases >= 0.8) {
				System.out.println(item.name + " is suggested for " + name);
				return item; 
			}
		}
		System.out.println(name + " has no suggested item.");
		return null; 
	}
	

}
