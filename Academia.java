class Academia{
	public static void logIn(String username, String password){
		System.out.println("Academia login using username and password");
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
	}
	public static void logIn(long mobileNumber, String securityKey){
		System.out.println("Academia login using mobile and securityKey");
		System.out.println("Mobile Number: " + mobileNumber);
		System.out.println("Security Key: " + securityKey);
	}

	public static void main(String[] args){
		logIn("academia_user","academia@123");
		logIn(8296897154L,"SEC555");
	}
}