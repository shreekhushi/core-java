class AsusCommunity{
	public static void logIn(String username, String password){
		System.out.println("AsusCommunity login using username and password");
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
	}
	public static void logIn(long mobileNumber, String authToken){
		System.out.println("AsusCommunity login using mobile and authToken");
		System.out.println("Mobile Number: " + mobileNumber);
		System.out.println("Auth Token: " + authToken);
	}

	public static void main(String[] args){
		logIn("asus_user","asus@123");
		logIn(8296897154L,"AUTH456");
	}
}