class Meetup{
	public static void logIn(String username, String password){
		System.out.println("Meetup login using username and password");
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
	}
	public static void logIn(long mobileNumber, String captcha){
		System.out.println("Meetup login using mobile and captcha");
		System.out.println("Mobile Number: " + mobileNumber);
		System.out.println("Captcha: " + captcha);
	}
	
	public static void main(String[] args){
	    logIn("khushi@gmail.com", "khushi@15");
		logIn(8296897154L, "Wekm");
	}
}