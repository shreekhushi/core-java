class IPLOneExecutor{
	public static void main(String[] i){
		IPL ipl = new IPL();
		ipl.tournamentId = 2401;
		ipl.year = 2026;
		ipl.sponsor = "TATA";
		
		RCB rcb = new RCB();
		rcb.teamId = 2501;
		rcb.captain = "Patidar";
		rcb.homeGround = "Chinnaswamy Stadium";
		
		ipl.rcb = rcb;
		
		ipl.getIPLDetails();
	}
}