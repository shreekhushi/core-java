class OTTExecutor{

    public static void main(String[] args) {

        OTTPlatform o1 = new OTTPlatform();
        o1.platformName = "Netflix";
        o1.owner = "Netflix Inc";
        o1.totalUsers = 200000000;
        o1.contentType = "Movies & Series";
        o1.region = "Global";

        Subscription s1 = new Subscription();
        s1.subscriptionId = 1;
        s1.planType = "Basic";
        s1.price = 199;
        s1.validityDays = 30;
        s1.status = "Active";

        o1.subscription = s1;
        o1.getPlatformDetails();


        OTTPlatform o2 = new OTTPlatform();
        o2.platformName = "Amazon Prime";
        o2.owner = "Amazon";
        o2.totalUsers = 150000000;
        o2.contentType = "Movies";
        o2.region = "Global";

        Subscription s2 = new Subscription();
        s2.subscriptionId = 2;
        s2.planType = "Prime";
        s2.price = 1499;
        s2.validityDays = 365;
        s2.status = "Active";

        o2.subscription = s2;
        o2.getPlatformDetails();

        OTTPlatform o3 = new OTTPlatform();
        o3.platformName = "Disney+ Hotstar";
        o3.owner = "Disney";
        o3.totalUsers = 100000000;
        o3.contentType = "Sports & Movies";
        o3.region = "India";

        Subscription s3 = new Subscription();
        s3.subscriptionId = 3;
        s3.planType = "Premium";
        s3.price = 899;
        s3.validityDays = 365;
        s3.status = "Active";

        o3.subscription = s3;
        o3.getPlatformDetails();


        OTTPlatform o4 = new OTTPlatform();
        o4.platformName = "Zee5";
        o4.owner = "Zee";
        o4.totalUsers = 50000000;
        o4.contentType = "Series";
        o4.region = "India";

        Subscription s4 = new Subscription();
        s4.subscriptionId = 4;
        s4.planType = "Standard";
        s4.price = 499;
        s4.validityDays = 180;
        s4.status = "Active";

        o4.subscription = s4;
        o4.getPlatformDetails();


        OTTPlatform o5 = new OTTPlatform();
        o5.platformName = "SonyLIV";
        o5.owner = "Sony";
        o5.totalUsers = 40000000;
        o5.contentType = "Sports";
        o5.region = "India";

        Subscription s5 = new Subscription();
        s5.subscriptionId = 5;
        s5.planType = "Premium";
        s5.price = 999;
        s5.validityDays = 365;
        s5.status = "Active";

        o5.subscription = s5;
        o5.getPlatformDetails();


        OTTPlatform o6 = new OTTPlatform();
        o6.platformName = "JioCinema";
        o6.owner = "Reliance";
        o6.totalUsers = 80000000;
        o6.contentType = "Sports";
        o6.region = "India";

        Subscription s6 = new Subscription();
        s6.subscriptionId = 6;
        s6.planType = "Free";
        s6.price = 0;
        s6.validityDays = 0;
        s6.status = "Active";

        o6.subscription = s6;
        o6.getPlatformDetails();


        OTTPlatform o7 = new OTTPlatform();
        o7.platformName = "Apple TV+";
        o7.owner = "Apple";
        o7.totalUsers = 30000000;
        o7.contentType = "Originals";
        o7.region = "Global";

        Subscription s7 = new Subscription();
        s7.subscriptionId = 7;
        s7.planType = "Monthly";
        s7.price = 99;
        s7.validityDays = 30;
        s7.status = "Active";

        o7.subscription = s7;
        o7.getPlatformDetails();


        OTTPlatform o8 = new OTTPlatform();
        o8.platformName = "MX Player";
        o8.owner = "Times Internet";
        o8.totalUsers = 60000000;
        o8.contentType = "Free Content";
        o8.region = "India";

        Subscription s8 = new Subscription();
        s8.subscriptionId = 8;
        s8.planType = "Free";
        s8.price = 0;
        s8.validityDays = 0;
        s8.status = "Active";

        o8.subscription = s8;
        o8.getPlatformDetails();


        OTTPlatform o9 = new OTTPlatform();
        o9.platformName = "Alt Balaji";
        o9.owner = "Balaji";
        o9.totalUsers = 20000000;
        o9.contentType = "Drama";
        o9.region = "India";

        Subscription s9 = new Subscription();
        s9.subscriptionId = 9;
        s9.planType = "Basic";
        s9.price = 300;
        s9.validityDays = 90;
        s9.status = "Active";

        o9.subscription = s9;
        o9.getPlatformDetails();


        OTTPlatform o10 = new OTTPlatform();
        o10.platformName = "Voot";
        o10.owner = "Viacom18";
        o10.totalUsers = 35000000;
        o10.contentType = "Reality Shows";
        o10.region = "India";

        Subscription s10 = new Subscription();
        s10.subscriptionId = 10;
        s10.planType = "Premium";
        s10.price = 599;
        s10.validityDays = 365;
        s10.status = "Active";

        o10.subscription = s10;
        o10.getPlatformDetails();


        // 11–20 similar pattern

        OTTPlatform o11 = new OTTPlatform();
        o11.platformName = "Netflix India";
        o11.owner = "Netflix";
        o11.totalUsers = 50000000;
        o11.contentType = "Series";
        o11.region = "India";

        Subscription s11 = new Subscription();
        s11.subscriptionId = 11;
        s11.planType = "Mobile";
        s11.price = 149;
        s11.validityDays = 30;
        s11.status = "Active";

        o11.subscription = s11;
        o11.getPlatformDetails();


        OTTPlatform o12 = new OTTPlatform();
        o12.platformName = "Prime Video India";
        o12.owner = "Amazon";
        o12.totalUsers = 70000000;
        o12.contentType = "Movies";
        o12.region = "India";

        Subscription s12 = new Subscription();
        s12.subscriptionId = 12;
        s12.planType = "Annual";
        s12.price = 1499;
        s12.validityDays = 365;
        s12.status = "Active";

        o12.subscription = s12;
        o12.getPlatformDetails();


        OTTPlatform o13 = new OTTPlatform();
        o13.platformName = "Hotstar VIP";
        o13.owner = "Disney";
        o13.totalUsers = 60000000;
        o13.contentType = "Sports";
        o13.region = "India";

        Subscription s13 = new Subscription();
        s13.subscriptionId = 13;
        s13.planType = "VIP";
        s13.price = 499;
        s13.validityDays = 365;
        s13.status = "Active";

        o13.subscription = s13;
        o13.getPlatformDetails();


        OTTPlatform o14 = new OTTPlatform();
        o14.platformName = "Sun NXT";
        o14.owner = "Sun TV";
        o14.totalUsers = 15000000;
        o14.contentType = "Regional";
        o14.region = "India";

        Subscription s14 = new Subscription();
        s14.subscriptionId = 14;
        s14.planType = "Standard";
        s14.price = 299;
        s14.validityDays = 90;
        s14.status = "Active";

        o14.subscription = s14;
        o14.getPlatformDetails();


        OTTPlatform o15 = new OTTPlatform();
        o15.platformName = "Aha";
        o15.owner = "Arha Media";
        o15.totalUsers = 10000000;
        o15.contentType = "Telugu";
        o15.region = "India";

        Subscription s15 = new Subscription();
        s15.subscriptionId = 15;
        s15.planType = "Premium";
        s15.price = 699;
        s15.validityDays = 365;
        s15.status = "Active";

        o15.subscription = s15;
        o15.getPlatformDetails();


        OTTPlatform o16 = new OTTPlatform();
        o16.platformName = "Hoichoi";
        o16.owner = "SVF";
        o16.totalUsers = 8000000;
        o16.contentType = "Bengali";
        o16.region = "India";

        Subscription s16 = new Subscription();
        s16.subscriptionId = 16;
        s16.planType = "Monthly";
        s16.price = 99;
        s16.validityDays = 30;
        s16.status = "Active";

        o16.subscription = s16;
        o16.getPlatformDetails();


        OTTPlatform o17 = new OTTPlatform();
        o17.platformName = "Eros Now";
        o17.owner = "Eros";
        o17.totalUsers = 12000000;
        o17.contentType = "Movies";
        o17.region = "India";

        Subscription s17 = new Subscription();
        s17.subscriptionId = 17;
        s17.planType = "Basic";
        s17.price = 399;
        s17.validityDays = 180;
        s17.status = "Active";

        o17.subscription = s17;
        o17.getPlatformDetails();


        OTTPlatform o18 = new OTTPlatform();
        o18.platformName = "Discovery+";
        o18.owner = "Discovery";
        o18.totalUsers = 9000000;
        o18.contentType = "Documentaries";
        o18.region = "Global";

        Subscription s18 = new Subscription();
        s18.subscriptionId = 18;
        s18.planType = "Premium";
        s18.price = 299;
        s18.validityDays = 90;
        s18.status = "Active";

        o18.subscription = s18;
        o18.getPlatformDetails();


        OTTPlatform o19 = new OTTPlatform();
        o19.platformName = "Peacock";
        o19.owner = "NBC";
        o19.totalUsers = 20000000;
        o19.contentType = "TV Shows";
        o19.region = "US";

        Subscription s19 = new Subscription();
        s19.subscriptionId = 19;
        s19.planType = "Standard";
        s19.price = 499;
        s19.validityDays = 180;
        s19.status = "Active";

        o19.subscription = s19;
        o19.getPlatformDetails();


        OTTPlatform o20 = new OTTPlatform();
        o20.platformName = "HBO Max";
        o20.owner = "Warner Bros";
        o20.totalUsers = 75000000;
        o20.contentType = "Movies & Series";
        o20.region = "Global";

        Subscription s20 = new Subscription();
        s20.subscriptionId = 20;
        s20.planType = "Premium";
        s20.price = 799;
        s20.validityDays = 365;
        s20.status = "Active";

        o20.subscription = s20;
        o20.getPlatformDetails();
    }
}