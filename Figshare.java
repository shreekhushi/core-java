class Figshare{
	public static void logIn(String username, String password){
		System.out.println("Figshare login using username and password");
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
	}
	public static void logIn(long mobileNumber, String verificationToken){
		System.out.println("Figshare login using mobile and verificationToken");
		System.out.println("Mobile Number: " + mobileNumber);
		System.out.println("Verification Token: " + verificationToken);
	}

	public static void main(String[] args){
		logIn("figshare_user","figshare@123");
		logIn(8296897154L,"TOKEN888");
	}
}