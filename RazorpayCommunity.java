class RazorpayCommunity{
	public static void logIn(String username, String password){
		System.out.println("RazorpayCommunity login using username and password");
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
	}

	public static void logIn(long mobileNumber, String authToken){
		System.out.println("RazorpayCommunity login using mobile and authToken");
		System.out.println("Mobile Number: " + mobileNumber);
		System.out.println("Auth Token: " + authToken);
	}

	public static void main(String[] args){
		logIn("razor_user","razor@123");
		logIn(8296897154L,"AUTH9087");
	}
}