class CellPhone{
	
	static long contacts[] = {9845803407L , 7760289815L, 8951505885L, 8296897154L, 8217216186L, 9110818086L,
    8618487480L ,8088561194L , 8951344162L, 9036315166L, 9380174013L,8431630905L, 9036883136L,
	9606304228L, 8660565422L, 9611207429L, 9008412533L,990119187L , 9113549202L, 7892777170L};
	 
   public static void main(String[] args){
   
    getcontacts();
   
   // System.out.println(contacts[0]+"\n"+contacts[1]+"\n"+contacts[2]+"\n"+contacts[3]+"\n"+contacts[4]+"\n"+contacts[5]+"\n"+
   // contacts[6]+"\n"+contacts[7]+"\n"+contacts[8]+"\n"+contacts[9]+"\n"+contacts[10]+"\n"+contacts[11]+"\n"+contacts[12]+
   // "\n"+contacts[13]+"\n"+contacts[14]+"\n"+contacts[15]+"\n"+contacts[16]+"\n"+contacts[17]+"\n"+contacts[18]+"\n"+contacts[19]);
  
   }
   
   static void getcontacts(){
	   System.out.println("The contacts are:");
	   for(long contact : contacts){
		   System.out.println(contact);
	   }
   }
}