import java.util.ArrayList; 



public class BasketModel {
	private ArrayList<ProductModel> items;
	private ArrayList<Integer> count;
	private double subtotal; 
	private double tax;  
	private double total;  
	
	BasketModel(){
		subtotal = 0; 
		tax = 0; 
		total = 0; 
		items = new ArrayList<ProductModel>(); 
		count = new ArrayList<Integer>(); 
	}
	

	void addProduct(ProductModel item) {
		items.add(item); 
		count.add(1); 
		double price = item.getPrice(); 
		subtotal += price; 
		tax = (0.15 * subtotal); 
		total = subtotal + tax; 
		System.out.println(item.getName() + " added to basket.");
		//Adds a product to the Basket and updates the Subtotal, Tax, and Total attributes.  
	}
	boolean removeProduct(ProductModel product) {
		int i = 0; 
		for (ProductModel item : items) {
			if (item.id == product.id) {
				double price = item.getPrice() * count.get(i);
				items.remove(i);
				count.remove(i); 
				subtotal -= price; 
				tax = (0.15 * subtotal); 
				total = subtotal + tax; 
				return true; 
			}
			i++;
		}
		return false; 
	}
	void updateQuantity(ProductModel product, int quantity) {
		int i = 0; 
		for (ProductModel item : items) {
			if (item.id == product.id) {
				double price = item.getPrice() * quantity; 
				count.set(i, quantity);  
				subtotal += price; 
				tax = (0.15 * subtotal); 
				total = subtotal + tax; 
				return; 
			}
			i++;
		}
	}
	void clear() {
		items.clear();
		count.clear();
		subtotal = 0; 
		tax = 0; 
		total = 0; 
		
	}
	Boolean isEmpty() {
		if (items.isEmpty()) {
			return true;
		}
		return false; 
	}

	
	double getTax() {
		return tax;
	}
	double getTotal() {
		return total; 
	}
	double getSubtotal() {
		return subtotal; 
	}
	ArrayList<ProductModel>  getItems() {
		return (ArrayList<ProductModel>) items.clone(); 
	}
	BasketModel(BasketModel o) {
		this.items = o.getItems(); 
		this.tax = o.getTax(); 
		this.subtotal = o.getSubtotal(); 
		this.total = o.getTotal(); 
	}
	
	@Override
    public String toString() {
		String result = "Items in basket : \n"; 
		int i = 0; 
		for (ProductModel item : items) {
			result += item.getName() + ", " + count.get(i) + "\n"; 
			i++; 
		}
		result += "Subtotal : " + (Math.round(subtotal * 1000)/1000.00) + "\n"; 
		result += "Taxes : " + (Math.round(tax * 1000)/1000.00) + "\n";
		result += "Total : " + (Math.round(total * 100)/100.00) + "\n"; 
		
        return result; 
    }

}
