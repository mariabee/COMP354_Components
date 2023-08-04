import java.util.ArrayList; 


public class CustomerModel {
  public customerModel customer;
  public String username;
  public String email;
  public String password;
  public String address;
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

	void setCustomer(customerModel customer) {
		this.customer = customer; 
	}
	
	boolean setUsername(String username) {
		this.username = username;
	}
	
	void setEmail(String email) {
		this.email = email; 
	}
	
	void setPassword (String password) {
		this.password = password; 
	}
	
	void setAddress(String address) {
		this.address = address; 
	}
	
	void setUserId(int userId) {
		this.userId = userId; 
	}

	void setCustomerBasket(BasketModel customerBasket) {
		this.customerBasket = customerBasket; 
	}
	
	void setNumberOfCoupons(int numberOfCoupons) {
		this.numberOfCoupons = numberOfCoupons; 
	}
	
	customerModel getCustomer() {
		return customer; 
	}
		
	String getUsername() {
		return username; 
	}
	
	String getEmail() {
		return setEmail; 
	}
	
	String getPassword() {
		return password; 
	}
	
	String getAddress() {
		return address; 
	}
	
	int getUserId() {
		return userId; 
	}
	
	BasketModel getCustomerBasket() {
		return customerBasket; 
	}
	
	int getNumberOfCoupons() {
		return numberOfCoupons; 
	}

  void updateUserDetails(String username, String email, String password, String address, int userID, BasketModel customerBasket, int numberOfCoupons) {
    this.username = username;
    this.email = email;
    this.password = password;
    this.address = address;
    this.userId = userId;
    this.customerBasket = customerBasket;
    this.numberOfCoupons = numberOfCoupons;
    System.out.println(username + " updated as a user.");
    // Updates the user information in the SQL database by changing an existing entry
	}
  
	int useCoupon(int numberOfCoupons) {
		int i = getNumberOfCoupons();
		if (i > numberOfCoupons) {
			return numberOfCoupons; 
		} else {
			System.out.println("Number of available coupons has been excided! No coupons were used.");
			return 0;
		}
	}
  
	int addCoupon(int priceOfOrder) {
		int i = priceOfOrder/100;
		if (i > 0) {
			setNumberOfCoupons = getNumberOfCoupons + i;
			System.out.println( i + " coupon(s) have been added.");
			return i;
		}
	}
  
	int addtem(int ProductModel.id) {
		BasketModel.addProduct(ProductModel.id.getName());
		return 1;
	}
  
	int removetem(int ProductModel.id) {
		BasketModel.removeProduct(ProductModel.id.getName());
		return 1; 
	}

	@Override
    public String toString() {
		String result = "Customers in the database : \n"; 
		int i = 0; 
		for (CustomerModel customer : customers) {
			result += item.getUsername() + ", " + count.get(i) + "\n"; 
			i++; 
		}
    return result; 
    }

}
