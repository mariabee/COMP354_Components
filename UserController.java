import java.util.ArrayList; 



public class UserController {
	public customerModel customer;
	
  UserController(){
		customer = new customerModel(); 
	}

  void setCustomer(customerModel customer) {
		this.customer = customer; 
	}

	customerModel getCustomer() {
		return customer; 
	}
	
	//Adds a product to the Basket
  void addItemToBasket(int ProductModel.id) {
		BasketModel.addProduct(ProductModel.id.getName());
		System.out.println(item.getName() + " added to basket.");
	}
  
	void removeItemFromBasket(int ProductModel.id) {
		BasketModel.removeProduct(ProductModel.id.getName());
		System.out.println(item.getName() + " removed to basket."); 
	}
  
	void startWithEmptyBasket() {
		CustomerModel.setCustomerBasket(new BasketModel());
	}
  
	void startWithExistingBasket() {
		CustomerModel.getCustomerBasket();
	}
  
	void checkout() {
		if (!BasketModel.isEmpty()) {
			int i = 0; 
			for (ProductModel item : items) {
				result += item.getName() + ", " + count.get(i) + "\n"; 
				i++; 
			}
			BasketModel.clear();
			System.out.println("Checkout is complete.");
		} else
		System.out.println("Basket is empty! There is nothing to buy.");
	}

	// Updates the user information in the SQL database by either creating a new entry or changing an existing entry
	customerModel updateUserDetails(String username, String email, String password, String address, int userID, BasketModel customerBasket, int numberOfCoupons)  {
		CustomerModel.username = username;
    CustomerModel.email = email;
    CustomerModel.password = password;
    CustomerModel.address = address;
    CustomerModel.userId = userId;
    CustomerModel.customerBasket = customerBasket;
    CustomerModel.numberOfCoupons = numberOfCoupons;
    System.out.println(username + " updated user information.");
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
