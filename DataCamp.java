class DataCamp{
	public static void logIn(String email, String password){
		System.out.println("DataCamp login using email and password");
		System.out.println("Email: " + email);
		System.out.println("Password: " + password);
	}

	public static void logIn(long mobileNumber, String securityKey){
		System.out.println("DataCamp login using mobile and securityKey");
		System.out.println("Mobile Number: " + mobileNumber);
		System.out.println("Security Key: " + securityKey);
	}

	public static void main(String[] args){
		logIn("datacamp@gmail.com","data@123");
		logIn(8296897154L,"SEC999");
	}
}