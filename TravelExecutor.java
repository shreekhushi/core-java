class TravelExecutor{
    
    public static void main(String[] args){
        
        Travel t1 = new Travel();
        t1.travelId = 1;
        t1.travelerName = "Rahul";
        t1.source = "Bangalore";
        t1.destination = "Goa";
        t1.ticketPrice = 1500;

        Travel t2 = new Travel();
        t2.travelId = 2;
        t2.travelerName = "Amit";
        t2.source = "Chennai";
        t2.destination = "Kerala";
        t2.ticketPrice = 1800;

        Travel t3 = new Travel();
        t3.travelId = 3;
        t3.travelerName = "Sneha";
        t3.source = "Mumbai";
        t3.destination = "Delhi";
        t3.ticketPrice = 2500;

        Travel t4 = new Travel();
        t4.travelId = 4;
        t4.travelerName = "Kiran";
        t4.source = "Hyderabad";
        t4.destination = "Vizag";
        t4.ticketPrice = 1200;

        Travel t5 = new Travel();
        t5.travelId = 5;
        t5.travelerName = "Anjali";
        t5.source = "Pune";
        t5.destination = "Nashik";
        t5.ticketPrice = 900;

        Travel t6 = new Travel();
        t6.travelId = 6;
        t6.travelerName = "Ravi";
        t6.source = "Kolkata";
        t6.destination = "Darjeeling";
        t6.ticketPrice = 2000;

        Travel t7 = new Travel();
        t7.travelId = 7;
        t7.travelerName = "Priya";
        t7.source = "Mysore";
        t7.destination = "Coorg";
        t7.ticketPrice = 800;

        Travel t8 = new Travel();
        t8.travelId = 8;
        t8.travelerName = "Arjun";
        t8.source = "Jaipur";
        t8.destination = "Udaipur";
        t8.ticketPrice = 1400;

        Travel t9 = new Travel();
        t9.travelId = 9;
        t9.travelerName = "Meena";
        t9.source = "Lucknow";
        t9.destination = "Varanasi";
        t9.ticketPrice = 1100;

        Travel t10 = new Travel();
        t10.travelId = 10;
        t10.travelerName = "Sanjay";
        t10.source = "Ahmedabad";
        t10.destination = "Surat";
        t10.ticketPrice = 1000;

        Travel t11 = new Travel();
        t11.travelId = 11;
        t11.travelerName = "Kavya";
        t11.source = "Indore";
        t11.destination = "Bhopal";
        t11.ticketPrice = 950;

        Travel t12 = new Travel();
        t12.travelId = 12;
        t12.travelerName = "Ramesh";
        t12.source = "Patna";
        t12.destination = "Gaya";
        t12.ticketPrice = 700;

        Travel t13 = new Travel();
        t13.travelId = 13;
        t13.travelerName = "Pooja";
        t13.source = "Chandigarh";
        t13.destination = "Shimla";
        t13.ticketPrice = 1300;

        Travel t14 = new Travel();
        t14.travelId = 14;
        t14.travelerName = "Vikram";
        t14.source = "Bhopal";
        t14.destination = "Nagpur";
        t14.ticketPrice = 1600;

        Travel t15 = new Travel();
        t15.travelId = 15;
        t15.travelerName = "Neha";
        t15.source = "Delhi";
        t15.destination = "Agra";
        t15.ticketPrice = 1200;


        Travel travels[] = new Travel[15];

        travels[0] = t1;
        travels[1] = t2;
        travels[2] = t3;
        travels[3] = t4;
        travels[4] = t5;
        travels[5] = t6;
        travels[6] = t7;
        travels[7] = t8;
        travels[8] = t9;
        travels[9] = t10;
        travels[10] = t11;
        travels[11] = t12;
        travels[12] = t13;
        travels[13] = t14;
        travels[14] = t15;

       
        for (Travel t : travels) {
            System.out.println("Travel ID: " + t.travelId);
            System.out.println("Traveler Name: " + t.travelerName);
            System.out.println("Source: " + t.source);
            System.out.println("Destination: " + t.destination);
            System.out.println("Ticket Price: " + t.ticketPrice);
            System.out.println("----------------------");
        }
    }
}