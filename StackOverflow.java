class StackOverflow{
	public static void logIn(String email, String password){
		System.out.println("StackOverflow login using email and password");
		System.out.println("Email: " + email);
		System.out.println("Password: " + password);
	}
	public static void logIn(long mobileNumber, String captcha){
		System.out.println("StackOverflow login using mobile and captcha");
		System.out.println("Mobile Number: " + mobileNumber);
		System.out.println("Captcha: " + captcha);
	}
	
	public static void main(String[] args){
	    logIn("khushi@gmail.com", "khushi@15");
		logIn(8296897154L, "PyBfe");
	}
}