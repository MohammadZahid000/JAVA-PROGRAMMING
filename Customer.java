package module6;

public class Customer {
	private int customerId;
	private String name;
	private int mobileNumber;
	private String address;
	public Customer() {
	System.out.println(" this is default constructor");
			customerId=0;
			name="Null";
			mobileNumber=0;
			address="Null";
		
		}
	public Customer(int customerId, String name, int mobileNumber, String address) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.address = address;
	}
	
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void markAsDone() {
		System.out.println("Done the project");
		
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", mobileNumber=" + mobileNumber + ", address="
				+ address + "]";
	}
	

}


