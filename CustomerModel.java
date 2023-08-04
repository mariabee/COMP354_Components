import java.util.ArrayList; 



public class CustomerModel {
	public customerModel customer;
  public string username;
  public string email;
  public string password;
  public string address;
  public int userId;
  public BasketModel customerBasket;
  public int numberOfCoupons;

	
  CustomerModel(){
		username = "new user"; 
    email = "new email";
    password = "new password";
    address = "new address";
    userId = -1;
    customerBasket = new BasketModel();
    numberOfCoupons = 0;

	}
	
  void updateUserDetails() {
		items.add(item); 
		count.add(1); 
		double price = item.getPrice(); 
		subtotal += price; 
		tax = (0.15 * subtotal); 
		total = subtotal + tax; 
		System.out.println(item.getName() + " added to basket.");
		//Adds a product to the Basket and updates the Subtotal, Tax, and Total attributes.  
	}
  
	int useCoupon(int numberOfCoupons) {
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
  
	int addCoupon(int priceOfOrder) {
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
  
	int addtem(int productID) {
		items.clear();
		count.clear();
		subtotal = 0; 
		tax = 0; 
		total = 0; 
	}
  
	int removetem(ind productID) {
		if (items.isEmpty()) {
			return true;
		}
		return false; 
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
