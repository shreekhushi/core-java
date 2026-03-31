class MobileExecutor{

    public static void main(String[] args) {

        Mobile m1 = new Mobile();
        m1.brand = "Samsung";
        m1.model = "Galaxy A50";
        m1.price = 20000;
        m1.storage = 128;
        m1.color = "Black";

        Sim s1 = new Sim();
        s1.simId = 1;
        s1.provider = "Jio";
        s1.networkType = "4G";
        s1.mobileNumber = 9876543210L;
        s1.plan = "299/month";

        m1.sim = s1;
        m1.getMobileDetails();

        Mobile m2 = new Mobile();
        m2.brand = "Apple";
        m2.model = "iPhone 13";
        m2.price = 70000;
        m2.storage = 256;
        m2.color = "White";

        Sim s2 = new Sim();
        s2.simId = 2;
        s2.provider = "Airtel";
        s2.networkType = "5G";
        s2.mobileNumber = 9123456780L;
        s2.plan = "499/month";

        m2.sim = s2;
        m2.getMobileDetails();


        Mobile m3 = new Mobile();
        m3.brand = "OnePlus";
        m3.model = "Nord";
        m3.price = 30000;
        m3.storage = 128;
        m3.color = "Blue";

        Sim s3 = new Sim();
        s3.simId = 3;
        s3.provider = "Vi";
        s3.networkType = "4G";
        s3.mobileNumber = 9988776655L;
        s3.plan = "399/month";

        m3.sim = s3;
        m3.getMobileDetails();


        Mobile m4 = new Mobile();
        m4.brand = "Vivo";
        m4.model = "V21";
        m4.price = 25000;
        m4.storage = 128;
        m4.color = "Green";

        Sim s4 = new Sim();
        s4.simId = 4;
        s4.provider = "BSNL";
        s4.networkType = "4G";
        s4.mobileNumber = 9001122334L;
        s4.plan = "199/month";

        m4.sim = s4;
        m4.getMobileDetails();


        Mobile m5 = new Mobile();
        m5.brand = "Oppo";
        m5.model = "F19";
        m5.price = 22000;
        m5.storage = 128;
        m5.color = "Purple";

        Sim s5 = new Sim();
        s5.simId = 5;
        s5.provider = "Jio";
        s5.networkType = "5G";
        s5.mobileNumber = 8899776655L;
        s5.plan = "599/month";

        m5.sim = s5;
        m5.getMobileDetails();


        Mobile m6 = new Mobile();
        m6.brand = "Realme";
        m6.model = "Narzo";
        m6.price = 15000;
        m6.storage = 64;
        m6.color = "Black";

        Sim s6 = new Sim();
        s6.simId = 6;
        s6.provider = "Airtel";
        s6.networkType = "4G";
        s6.mobileNumber = 7766554433L;
        s6.plan = "249/month";

        m6.sim = s6;
        m6.getMobileDetails();


        Mobile m7 = new Mobile();
        m7.brand = "Redmi";
        m7.model = "Note 10";
        m7.price = 18000;
        m7.storage = 128;
        m7.color = "Grey";

        Sim s7 = new Sim();
        s7.simId = 7;
        s7.provider = "Vi";
        s7.networkType = "4G";
        s7.mobileNumber = 6677889900L;
        s7.plan = "299/month";

        m7.sim = s7;
        m7.getMobileDetails();


        Mobile m8 = new Mobile();
        m8.brand = "Samsung";
        m8.model = "Galaxy S21";
        m8.price = 65000;
        m8.storage = 256;
        m8.color = "Silver";

        Sim s8 = new Sim();
        s8.simId = 8;
        s8.provider = "Jio";
        s8.networkType = "5G";
        s8.mobileNumber = 9988007766L;
        s8.plan = "699/month";

        m8.sim = s8;
        m8.getMobileDetails();


        Mobile m9 = new Mobile();
        m9.brand = "Apple";
        m9.model = "iPhone 12";
        m9.price = 60000;
        m9.storage = 128;
        m9.color = "Black";

        Sim s9 = new Sim();
        s9.simId = 9;
        s9.provider = "Airtel";
        s9.networkType = "5G";
        s9.mobileNumber = 8877665544L;
        s9.plan = "549/month";

        m9.sim = s9;
        m9.getMobileDetails();


        Mobile m10 = new Mobile();
        m10.brand = "OnePlus";
        m10.model = "9R";
        m10.price = 40000;
        m10.storage = 256;
        m10.color = "Blue";

        Sim s10 = new Sim();
        s10.simId = 10;
        s10.provider = "Vi";
        s10.networkType = "4G";
        s10.mobileNumber = 7766552211L;
        s10.plan = "399/month";

        m10.sim = s10;
        m10.getMobileDetails();


        Mobile m11 = new Mobile();
        m11.brand = "Vivo";
        m11.model = "Y20";
        m11.price = 14000;
        m11.storage = 64;
        m11.color = "Blue";

        Sim s11 = new Sim();
        s11.simId = 11;
        s11.provider = "BSNL";
        s11.networkType = "4G";
        s11.mobileNumber = 9000090000L;
        s11.plan = "199/month";

        m11.sim = s11;
        m11.getMobileDetails();


        Mobile m12 = new Mobile();
        m12.brand = "Oppo";
        m12.model = "A53";
        m12.price = 16000;
        m12.storage = 128;
        m12.color = "Green";

        Sim s12 = new Sim();
        s12.simId = 12;
        s12.provider = "Jio";
        s12.networkType = "5G";
        s12.mobileNumber = 8111223344L;
        s12.plan = "599/month";

        m12.sim = s12;
        m12.getMobileDetails();


        Mobile m13 = new Mobile();
        m13.brand = "Realme";
        m13.model = "GT";
        m13.price = 35000;
        m13.storage = 256;
        m13.color = "Black";

        Sim s13 = new Sim();
        s13.simId = 13;
        s13.provider = "Airtel";
        s13.networkType = "5G";
        s13.mobileNumber = 8222334455L;
        s13.plan = "699/month";

        m13.sim = s13;
        m13.getMobileDetails();


        Mobile m14 = new Mobile();
        m14.brand = "Redmi";
        m14.model = "Note 11";
        m14.price = 20000;
        m14.storage = 128;
        m14.color = "White";

        Sim s14 = new Sim();
        s14.simId = 14;
        s14.provider = "Vi";
        s14.networkType = "4G";
        s14.mobileNumber = 8333445566L;
        s14.plan = "349/month";

        m14.sim = s14;
        m14.getMobileDetails();


        Mobile m15 = new Mobile();
        m15.brand = "Samsung";
        m15.model = "M31";
        m15.price = 22000;
        m15.storage = 128;
        m15.color = "Black";

        Sim s15 = new Sim();
        s15.simId = 15;
        s15.provider = "Jio";
        s15.networkType = "4G";
        s15.mobileNumber = 8444556677L;
        s15.plan = "299/month";

        m15.sim = s15;
        m15.getMobileDetails();


        Mobile m16 = new Mobile();
        m16.brand = "Apple";
        m16.model = "iPhone 14";
        m16.price = 80000;
        m16.storage = 256;
        m16.color = "Purple";

        Sim s16 = new Sim();
        s16.simId = 16;
        s16.provider = "Airtel";
        s16.networkType = "5G";
        s16.mobileNumber = 8555667788L;
        s16.plan = "799/month";

        m16.sim = s16;
        m16.getMobileDetails();


        Mobile m17 = new Mobile();
        m17.brand = "OnePlus";
        m17.model = "11R";
        m17.price = 45000;
        m17.storage = 256;
        m17.color = "Grey";

        Sim s17 = new Sim();
        s17.simId = 17;
        s17.provider = "Vi";
        s17.networkType = "5G";
        s17.mobileNumber = 8666778899L;
        s17.plan = "599/month";

        m17.sim = s17;
        m17.getMobileDetails();


        Mobile m18 = new Mobile();
        m18.brand = "Vivo";
        m18.model = "X80";
        m18.price = 50000;
        m18.storage = 256;
        m18.color = "Blue";

        Sim s18 = new Sim();
        s18.simId = 18;
        s18.provider = "BSNL";
        s18.networkType = "4G";
        s18.mobileNumber = 8777889900L;
        s18.plan = "249/month";

        m18.sim = s18;
        m18.getMobileDetails();


        Mobile m19 = new Mobile();
        m19.brand = "Oppo";
        m19.model = "Reno";
        m19.price = 30000;
        m19.storage = 128;
        m19.color = "Black";

        Sim s19 = new Sim();
        s19.simId = 19;
        s19.provider = "Jio";
        s19.networkType = "5G";
        s19.mobileNumber = 8888999900L;
        s19.plan = "699/month";

        m19.sim = s19;
        m19.getMobileDetails();


        Mobile m20 = new Mobile();
        m20.brand = "Realme";
        m20.model = "C55";
        m20.price = 14000;
        m20.storage = 64;
        m20.color = "Yellow";

        Sim s20 = new Sim();
        s20.simId = 20;
        s20.provider = "Airtel";
        s20.networkType = "4G";
        s20.mobileNumber = 8999000011L;
        s20.plan = "299/month";

        m20.sim = s20;
        m20.getMobileDetails();
    }
}