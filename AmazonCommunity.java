class AmazonCommunity{
	public static void logIn(String email, String password){
		System.out.println("AmazonCommunity login using email and password");
		System.out.println("Email: " + email);
		System.out.println("Password: " + password);
	}
	public static void logIn(long mobileNumber, String deviceId){
		System.out.println("AmazonCommunity login using mobile and deviceId");
		System.out.println("Mobile Number: " + mobileNumber);
		System.out.println("Device Id: " + deviceId);
	}

	public static void main(String[] args){
		logIn("amazon@gmail.com","amazon@123");
		logIn(8296897154L,"DEV123");
	}
}