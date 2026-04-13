class MortuaryThreeExecutor{
	public static void main(String[] m){
		DeadBody body = new DeadBody();
		Mortuary mortuary = new Mortuary(2201,"City Hospital",50,body);
		mortuary.getMortuaryDetails();
	}
}