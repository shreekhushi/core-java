class FreeBusTravelThreeExecutor{
	public static void main(String[] f){
		Aadhaar aadhaar = new Aadhaar();
		FreeBusTravel travel = new FreeBusTravel(2101,"Women","City Bus",aadhaar);
		travel.getFreeBusTravelDetails();
	}
}