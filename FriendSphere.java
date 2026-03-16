class FriendSphere{
	public static void logIn(String userName, int password){
		System.out.println("FriendSphere login through username and password");
		System.out.println("the username: " + userName);
		System.out.println("password: " + password);
	}

	public static void logIn(long number, int password){
		System.out.println("FriendSphere login through mobile number and password");
		System.out.println("the mobile number: " + number);
		System.out.println("the password: " + password);
	}

	public static void main(String[] args){
		logIn("friendSphereUser",2121);
		logIn(9000000019L,2121);
	}
}