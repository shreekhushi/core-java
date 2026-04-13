class Mortuary{
	int mortuaryId;
	String location;
	int capacity;
	DeadBody deadBody;
	
	public void getMortuaryDetails(){
		System.out.println("getMortuaryDetails invoked");
		System.out.println("the mortuary id is: " +mortuaryId);
		System.out.println("the location is: " +location);
		System.out.println("the capacity is: " +capacity);
		deadBody.getDeadBodyDetails();
		System.out.println("getMortuaryDetails ended");
	}
	
	Mortuary(int mortuaryId, String location, int capacity, DeadBody deadBody){
		this.mortuaryId = mortuaryId;
		this.location = location;
		this.capacity = capacity;
		this.deadBody = deadBody;
	}
	
	Mortuary(){
		
	}
	
	public boolean createDeadBody(DeadBody deadBody){
		this.deadBody = deadBody;
		return true;
	}
}