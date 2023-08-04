import java.util.ArrayList; 



public class UserController {
	public customerModel customer;
	
  UserController(){
		customer = new customerModel(); 
	}
	
  void addItemToBasket(productModel id) {
		items.add(item); 
		count.add(1); 
		double price = item.getPrice(); 
		subtotal += price; 
		tax = (0.15 * subtotal); 
		total = subtotal + tax; 
		System.out.println(item.getName() + " added to basket.");
		//Adds a product to the Basket and updates the Subtotal, Tax, and Total attributes.  
	}
  
	void removeItemFromBasket(productModel id) {
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
  
	void startWithEmptyBasket() {
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
  
	void startWithExistingBasket() {
		items.clear();
		count.clear();
		subtotal = 0; 
		tax = 0; 
		total = 0; 
	}
  
	void checkout() {
		if (items.isEmpty()) {
			return true;
		}
		return false; 
	}

	customerModel updateUserDetails(username, email, password, address)  {
		return tax;
	}
  
	customerModel getCustomer() {
		return customer; 
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
