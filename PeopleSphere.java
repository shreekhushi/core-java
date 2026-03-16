class PeopleSphere{
	public static void logIn(String userName, int password){
		System.out.println("PeopleSphere login through username and password");
		System.out.println("the username: " + userName);
		System.out.println("password: " + password);
	}

	public static void logIn(long number, int password){
		System.out.println("PeopleSphere login through mobile number and password");
		System.out.println("the mobile number: " + number);
		System.out.println("the password: " + password);
	}

	public static void main(String[] args){
		logIn("peopleUser",7777);
		logIn(9000000007L,7777);
	}
}