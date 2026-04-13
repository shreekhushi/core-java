class DeadBody{
	int bodyId;
	String name;
	String causeOfDeath;
	
	public void getDeadBodyDetails(){
		System.out.println("getDeadBodyDetails invoked");
		System.out.println("the body id is: " +bodyId);
		System.out.println("the name is: " +name);
		System.out.println("the cause of death is: " +causeOfDeath);
		System.out.println("getDeadBodyDetails ended");
	}
}