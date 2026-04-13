class MortuaryTwoExecutor{
	public static void main(String[] m){
		Mortuary mortuary = new Mortuary();
		mortuary.mortuaryId = 2201;
		mortuary.location = "City Hospital";
		mortuary.capacity = 50;
		
		DeadBody body = new DeadBody();
		body.bodyId = 2301;
		body.name = "Unknown";
		body.causeOfDeath = "Accident";
		
		boolean create = mortuary.createDeadBody(body);
		System.out.println(create);
		
		mortuary.getMortuaryDetails();
	}
}