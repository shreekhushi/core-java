class Josh{
	public static void logIn(String username, String password){
		System.out.println("Josh login using username and password");
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
	}

	public static void logIn(long mobileNumber, String authCode){
		System.out.println("Josh login using mobile and authCode");
		System.out.println("Mobile Number: " + mobileNumber);
		System.out.println("Auth Code: " + authCode);
	}

	public static void main(String[] args){
		logIn("josh_user","josh@123");
		logIn(8296897154L,"AUTH321");
	}
}