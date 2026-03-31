class RailwayStationExecutor{

    public static void main(String[] args) {

        
        RailwayStation r1 = new RailwayStation();
        r1.stationName = "KSR Bengaluru";
        r1.location = "Bangalore";
        r1.totalPlatforms = 10;
        r1.stationCode = "SBC";
        r1.contactNumber = 8023456789L;

        Platform p1 = new Platform();
        p1.platformNumber = 1;
        p1.trainName = "Shatabdi Express";
        p1.arrivalTime = "06:00 AM";
        p1.departureTime = "06:15 AM";
        p1.status = "On Time";

        r1.platform = p1;
        r1.getStationDetails();


        RailwayStation r2 = new RailwayStation();
        r2.stationName = "Mysuru Junction";
        r2.location = "Mysore";
        r2.totalPlatforms = 6;
        r2.stationCode = "MYS";
        r2.contactNumber = 8212345678L;

        Platform p2 = new Platform();
        p2.platformNumber = 2;
        p2.trainName = "Chamundi Express";
        p2.arrivalTime = "07:30 AM";
        p2.departureTime = "07:45 AM";
        p2.status = "On Time";

        r2.platform = p2;
        r2.getStationDetails();


        RailwayStation r3 = new RailwayStation();
        r3.stationName = "Chennai Central";
        r3.location = "Chennai";
        r3.totalPlatforms = 12;
        r3.stationCode = "MAS";
        r3.contactNumber = 4423456789L;

        Platform p3 = new Platform();
        p3.platformNumber = 3;
        p3.trainName = "Rajdhani Express";
        p3.arrivalTime = "08:00 AM";
        p3.departureTime = "08:20 AM";
        p3.status = "Delayed";

        r3.platform = p3;
        r3.getStationDetails();


        RailwayStation r4 = new RailwayStation();
        r4.stationName = "Hyderabad Deccan";
        r4.location = "Hyderabad";
        r4.totalPlatforms = 8;
        r4.stationCode = "HYB";
        r4.contactNumber = 4023456789L;

        Platform p4 = new Platform();
        p4.platformNumber = 4;
        p4.trainName = "Charminar Express";
        p4.arrivalTime = "09:00 AM";
        p4.departureTime = "09:10 AM";
        p4.status = "On Time";

        r4.platform = p4;
        r4.getStationDetails();

        RailwayStation r5 = new RailwayStation();
        r5.stationName = "Mumbai CST";
        r5.location = "Mumbai";
        r5.totalPlatforms = 15;
        r5.stationCode = "CST";
        r5.contactNumber = 2223456789L;

        Platform p5 = new Platform();
        p5.platformNumber = 5;
        p5.trainName = "Duronto Express";
        p5.arrivalTime = "10:00 AM";
        p5.departureTime = "10:30 AM";
        p5.status = "On Time";

        r5.platform = p5;
        r5.getStationDetails();


        RailwayStation r6 = new RailwayStation();
        r6.stationName = "Delhi Junction";
        r6.location = "Delhi";
        r6.totalPlatforms = 16;
        r6.stationCode = "DLI";
        r6.contactNumber = 1123456789L;

        Platform p6 = new Platform();
        p6.platformNumber = 6;
        p6.trainName = "Punjab Mail";
        p6.arrivalTime = "11:00 AM";
        p6.departureTime = "11:20 AM";
        p6.status = "Delayed";

        r6.platform = p6;
        r6.getStationDetails();


        RailwayStation r7 = new RailwayStation();
        r7.stationName = "Pune Junction";
        r7.location = "Pune";
        r7.totalPlatforms = 7;
        r7.stationCode = "PUNE";
        r7.contactNumber = 2023456789L;

        Platform p7 = new Platform();
        p7.platformNumber = 2;
        p7.trainName = "Deccan Express";
        p7.arrivalTime = "12:00 PM";
        p7.departureTime = "12:15 PM";
        p7.status = "On Time";

        r7.platform = p7;
        r7.getStationDetails();


        RailwayStation r8 = new RailwayStation();
        r8.stationName = "Coimbatore";
        r8.location = "Coimbatore";
        r8.totalPlatforms = 5;
        r8.stationCode = "CBE";
        r8.contactNumber = 4223456789L;

        Platform p8 = new Platform();
        p8.platformNumber = 1;
        p8.trainName = "Intercity Express";
        p8.arrivalTime = "01:00 PM";
        p8.departureTime = "01:10 PM";
        p8.status = "On Time";

        r8.platform = p8;
        r8.getStationDetails();

        RailwayStation r9 = new RailwayStation();
        r9.stationName = "Ahmedabad";
        r9.location = "Ahmedabad";
        r9.totalPlatforms = 10;
        r9.stationCode = "ADI";
        r9.contactNumber = 7923456789L;

        Platform p9 = new Platform();
        p9.platformNumber = 3;
        p9.trainName = "Gujarat Express";
        p9.arrivalTime = "02:00 PM";
        p9.departureTime = "02:20 PM";
        p9.status = "Delayed";

        r9.platform = p9;
        r9.getStationDetails();


        RailwayStation r10 = new RailwayStation();
        r10.stationName = "Jaipur";
        r10.location = "Jaipur";
        r10.totalPlatforms = 6;
        r10.stationCode = "JP";
        r10.contactNumber = 1412345678L;

        Platform p10 = new Platform();
        p10.platformNumber = 4;
        p10.trainName = "Pink City Express";
        p10.arrivalTime = "03:00 PM";
        p10.departureTime = "03:15 PM";
        p10.status = "On Time";

        r10.platform = p10;
        r10.getStationDetails();


        RailwayStation r11 = new RailwayStation();
        r11.stationName = "Kochi";
        r11.location = "Kochi";
        r11.totalPlatforms = 4;
        r11.stationCode = "ERS";
        r11.contactNumber = 4842345678L;

        Platform p11 = new Platform();
        p11.platformNumber = 2;
        p11.trainName = "Kerala Express";
        p11.arrivalTime = "04:00 PM";
        p11.departureTime = "04:30 PM";
        p11.status = "On Time";

        r11.platform = p11;
        r11.getStationDetails();


        RailwayStation r12 = new RailwayStation();
        r12.stationName = "Patna";
        r12.location = "Patna";
        r12.totalPlatforms = 10;
        r12.stationCode = "PNBE";
        r12.contactNumber = 6122345678L;

        Platform p12 = new Platform();
        p12.platformNumber = 5;
        p12.trainName = "Magadh Express";
        p12.arrivalTime = "05:00 PM";
        p12.departureTime = "05:20 PM";
        p12.status = "Delayed";

        r12.platform = p12;
        r12.getStationDetails();


        RailwayStation r13 = new RailwayStation();
        r13.stationName = "Nagpur";
        r13.location = "Nagpur";
        r13.totalPlatforms = 8;
        r13.stationCode = "NGP";
        r13.contactNumber = 7122345678L;

        Platform p13 = new Platform();
        p13.platformNumber = 3;
        p13.trainName = "Vidarbha Express";
        p13.arrivalTime = "06:00 PM";
        p13.departureTime = "06:10 PM";
        p13.status = "On Time";

        r13.platform = p13;
        r13.getStationDetails();


        RailwayStation r14 = new RailwayStation();
        r14.stationName = "Bhopal";
        r14.location = "Bhopal";
        r14.totalPlatforms = 6;
        r14.stationCode = "BPL";
        r14.contactNumber = 7552345678L;

        Platform p14 = new Platform();
        p14.platformNumber = 2;
        p14.trainName = "Shan-e-Bhopal";
        p14.arrivalTime = "07:00 PM";
        p14.departureTime = "07:15 PM";
        p14.status = "On Time";

        r14.platform = p14;
        r14.getStationDetails();


        RailwayStation r15 = new RailwayStation();
        r15.stationName = "Indore";
        r15.location = "Indore";
        r15.totalPlatforms = 5;
        r15.stationCode = "INDB";
        r15.contactNumber = 7312345678L;

        Platform p15 = new Platform();
        p15.platformNumber = 1;
        p15.trainName = "Malwa Express";
        p15.arrivalTime = "08:00 PM";
        p15.departureTime = "08:20 PM";
        p15.status = "Delayed";

        r15.platform = p15;
        r15.getStationDetails();


        RailwayStation r16 = new RailwayStation();
        r16.stationName = "Lucknow";
        r16.location = "Lucknow";
        r16.totalPlatforms = 9;
        r16.stationCode = "LKO";
        r16.contactNumber = 5222345678L;

        Platform p16 = new Platform();
        p16.platformNumber = 6;
        p16.trainName = "Lucknow Mail";
        p16.arrivalTime = "09:00 PM";
        p16.departureTime = "09:25 PM";
        p16.status = "On Time";

        r16.platform = p16;
        r16.getStationDetails();


        RailwayStation r17 = new RailwayStation();
        r17.stationName = "Kanpur";
        r17.location = "Kanpur";
        r17.totalPlatforms = 7;
        r17.stationCode = "CNB";
        r17.contactNumber = 5122345678L;

        Platform p17 = new Platform();
        p17.platformNumber = 3;
        p17.trainName = "Kanpur Express";
        p17.arrivalTime = "10:00 PM";
        p17.departureTime = "10:15 PM";
        p17.status = "On Time";

        r17.platform = p17;
        r17.getStationDetails();


        RailwayStation r18 = new RailwayStation();
        r18.stationName = "Varanasi";
        r18.location = "Varanasi";
        r18.totalPlatforms = 6;
        r18.stationCode = "BSB";
        r18.contactNumber = 5422345678L;

        Platform p18 = new Platform();
        p18.platformNumber = 4;
        p18.trainName = "Kashi Express";
        p18.arrivalTime = "11:00 PM";
        p18.departureTime = "11:20 PM";
        p18.status = "Delayed";

        r18.platform = p18;
        r18.getStationDetails();


        RailwayStation r19 = new RailwayStation();
        r19.stationName = "Surat";
        r19.location = "Surat";
        r19.totalPlatforms = 5;
        r19.stationCode = "ST";
        r19.contactNumber = 2612345678L;

        Platform p19 = new Platform();
        p19.platformNumber = 2;
        p19.trainName = "Surat Express";
        p19.arrivalTime = "12:00 AM";
        p19.departureTime = "12:15 AM";
        p19.status = "On Time";

        r19.platform = p19;
        r19.getStationDetails();


        RailwayStation r20 = new RailwayStation();
        r20.stationName = "Trivandrum";
        r20.location = "Trivandrum";
        r20.totalPlatforms = 4;
        r20.stationCode = "TVC";
        r20.contactNumber = 4712345678L;

        Platform p20 = new Platform();
        p20.platformNumber = 1;
        p20.trainName = "Ananthapuri Express";
        p20.arrivalTime = "01:00 AM";
        p20.departureTime = "01:20 AM";
        p20.status = "On Time";

        r20.platform = p20;
        r20.getStationDetails();
    }
}