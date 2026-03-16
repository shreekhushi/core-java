class MySpace{
	public static void logIn(String email, String password){
		System.out.println("MySpace login using email and password");
		System.out.println("Email: " + email);
		System.out.println("Password: " + password);
	}
	public static void logIn(long mobileNumber, String recoveryCode){
		System.out.println("MySpace login using mobile and recoveryCode");
		System.out.println("Mobile Number: " + mobileNumber);
		System.out.println("Recovery Code: " + recoveryCode);
	}
	
	public static void main(String[] args){
	    logIn("khushi@gmail.com", "khushi@15");
		logIn(8296897154L, "9658");
	}
}