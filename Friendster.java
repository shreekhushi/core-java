class Friendster{
	public static void logIn(String username, String password){
		System.out.println("Friendster login using username and password");
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
	}

	public static void logIn(long mobileNumber, String backupCode){
		System.out.println("Friendster login using mobile and backupCode");
		System.out.println("Mobile Number: " + mobileNumber);
		System.out.println("Backup Code: " + backupCode);
	}

	public static void main(String[] args){
		logIn("friendster_user","friend@123");
		logIn(8296897154L,"BACK111");
	}
}