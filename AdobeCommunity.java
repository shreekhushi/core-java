class AdobeCommunity{
	public static void logIn(String email, String password){
		System.out.println("AdobeCommunity login using email and password");
		System.out.println("Email: " + email);
		System.out.println("Password: " + password);
	}
	public static void logIn(long mobileNumber, String authToken){
		System.out.println("AdobeCommunity login using mobile and authToken");
		System.out.println("Mobile Number: " + mobileNumber);
		System.out.println("Auth Token: " + authToken);
	}

	public static void main(String[] args){
		logIn("adobe@gmail.com","adobe@123");
		logIn(8296897154L,"AUTH123");
	}
}