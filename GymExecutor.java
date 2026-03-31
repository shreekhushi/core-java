class GymExecutor{

    public static void main(String[] args) {

        Gym g1 = new Gym();
        g1.gymName = "Fitness Hub";
        g1.location = "Bangalore";
        g1.totalMembers = 120;
        g1.monthlyFee = 1500;
        g1.gymType = "Premium";

        Trainer t1 = new Trainer();
        t1.trainerId = 1;
        t1.name = "Rahul";
        t1.specialization = "Weight Training";
        t1.experience = 5;
        t1.salary = 30000;

        g1.trainer = t1;
        g1.getGymDetails();


        Gym g2 = new Gym();
        g2.gymName = "Power Gym";
        g2.location = "Hyderabad";
        g2.totalMembers = 90;
        g2.monthlyFee = 1200;
        g2.gymType = "Standard";

        Trainer t2 = new Trainer();
        t2.trainerId = 2;
        t2.name = "Sneha";
        t2.specialization = "Yoga";
        t2.experience = 4;
        t2.salary = 25000;

        g2.trainer = t2;
        g2.getGymDetails();

        Gym g3 = new Gym();
        g3.gymName = "Iron Paradise";
        g3.location = "Chennai";
        g3.totalMembers = 150;
        g3.monthlyFee = 1800;
        g3.gymType = "Premium";

        Trainer t3 = new Trainer();
        t3.trainerId = 3;
        t3.name = "Arjun";
        t3.specialization = "Cardio";
        t3.experience = 6;
        t3.salary = 32000;

        g3.trainer = t3;
        g3.getGymDetails();

        Gym g4 = new Gym();
        g4.gymName = "Fit Zone";
        g4.location = "Mumbai";
        g4.totalMembers = 200;
        g4.monthlyFee = 2000;
        g4.gymType = "Premium";

        Trainer t4 = new Trainer();
        t4.trainerId = 4;
        t4.name = "Priya";
        t4.specialization = "Zumba";
        t4.experience = 3;
        t4.salary = 28000;

        g4.trainer = t4;
        g4.getGymDetails();


        Gym g5 = new Gym();
        g5.gymName = "Muscle Factory";
        g5.location = "Pune";
        g5.totalMembers = 110;
        g5.monthlyFee = 1400;
        g5.gymType = "Standard";

        Trainer t5 = new Trainer();
        t5.trainerId = 5;
        t5.name = "Kiran";
        t5.specialization = "Strength Training";
        t5.experience = 5;
        t5.salary = 29000;

        g5.trainer = t5;
        g5.getGymDetails();


        Gym g6 = new Gym();
        g6.gymName = "Beast Gym";
        g6.location = "Delhi";
        g6.totalMembers = 180;
        g6.monthlyFee = 1700;
        g6.gymType = "Premium";

        Trainer t6 = new Trainer();
        t6.trainerId = 6;
        t6.name = "Ramesh";
        t6.specialization = "CrossFit";
        t6.experience = 7;
        t6.salary = 35000;

        g6.trainer = t6;
        g6.getGymDetails();


        Gym g7 = new Gym();
        g7.gymName = "Health Plus";
        g7.location = "Coimbatore";
        g7.totalMembers = 80;
        g7.monthlyFee = 1000;
        g7.gymType = "Basic";

        Trainer t7 = new Trainer();
        t7.trainerId = 7;
        t7.name = "Meena";
        t7.specialization = "Yoga";
        t7.experience = 2;
        t7.salary = 20000;

        g7.trainer = t7;
        g7.getGymDetails();


        Gym g8 = new Gym();
        g8.gymName = "Ultimate Fitness";
        g8.location = "Kolkata";
        g8.totalMembers = 140;
        g8.monthlyFee = 1600;
        g8.gymType = "Premium";

        Trainer t8 = new Trainer();
        t8.trainerId = 8;
        t8.name = "Suresh";
        t8.specialization = "Bodybuilding";
        t8.experience = 6;
        t8.salary = 33000;

        g8.trainer = t8;
        g8.getGymDetails();


        Gym g9 = new Gym();
        g9.gymName = "Fit World";
        g9.location = "Ahmedabad";
        g9.totalMembers = 95;
        g9.monthlyFee = 1300;
        g9.gymType = "Standard";

        Trainer t9 = new Trainer();
        t9.trainerId = 9;
        t9.name = "Anjali";
        t9.specialization = "Aerobics";
        t9.experience = 4;
        t9.salary = 26000;

        g9.trainer = t9;
        g9.getGymDetails();


        Gym g10 = new Gym();
        g10.gymName = "Gold Fitness";
        g10.location = "Jaipur";
        g10.totalMembers = 105;
        g10.monthlyFee = 1500;
        g10.gymType = "Premium";

        Trainer t10 = new Trainer();
        t10.trainerId = 10;
        t10.name = "Deepak";
        t10.specialization = "Weight Training";
        t10.experience = 5;
        t10.salary = 30000;

        g10.trainer = t10;
        g10.getGymDetails();


        Gym g11 = new Gym();
        g11.gymName = "Strong Nation";
        g11.location = "Nagpur";
        g11.totalMembers = 85;
        g11.monthlyFee = 1100;
        g11.gymType = "Basic";

        Trainer t11 = new Trainer();
        t11.trainerId = 11;
        t11.name = "Vikram";
        t11.specialization = "CrossFit";
        t11.experience = 6;
        t11.salary = 31000;

        g11.trainer = t11;
        g11.getGymDetails();


        Gym g12 = new Gym();
        g12.gymName = "Flex Gym";
        g12.location = "Bhopal";
        g12.totalMembers = 70;
        g12.monthlyFee = 900;
        g12.gymType = "Basic";

        Trainer t12 = new Trainer();
        t12.trainerId = 12;
        t12.name = "Pooja";
        t12.specialization = "Yoga";
        t12.experience = 3;
        t12.salary = 22000;

        g12.trainer = t12;
        g12.getGymDetails();


        Gym g13 = new Gym();
        g13.gymName = "Iron Club";
        g13.location = "Lucknow";
        g13.totalMembers = 130;
        g13.monthlyFee = 1600;
        g13.gymType = "Premium";

        Trainer t13 = new Trainer();
        t13.trainerId = 13;
        t13.name = "Manoj";
        t13.specialization = "Bodybuilding";
        t13.experience = 7;
        t13.salary = 36000;

        g13.trainer = t13;
        g13.getGymDetails();


        Gym g14 = new Gym();
        g14.gymName = "Fitness Arena";
        g14.location = "Indore";
        g14.totalMembers = 100;
        g14.monthlyFee = 1400;
        g14.gymType = "Standard";

        Trainer t14 = new Trainer();
        t14.trainerId = 14;
        t14.name = "Kavya";
        t14.specialization = "Zumba";
        t14.experience = 4;
        t14.salary = 27000;

        g14.trainer = t14;
        g14.getGymDetails();


        Gym g15 = new Gym();
        g15.gymName = "Urban Fitness";
        g15.location = "Surat";
        g15.totalMembers = 75;
        g15.monthlyFee = 1000;
        g15.gymType = "Basic";

        Trainer t15 = new Trainer();
        t15.trainerId = 15;
        t15.name = "Nithin";
        t15.specialization = "Cardio";
        t15.experience = 3;
        t15.salary = 23000;

        g15.trainer = t15;
        g15.getGymDetails();


        Gym g16 = new Gym();
        g16.gymName = "Fit Life";
        g16.location = "Trichy";
        g16.totalMembers = 60;
        g16.monthlyFee = 800;
        g16.gymType = "Basic";

        Trainer t16 = new Trainer();
        t16.trainerId = 16;
        t16.name = "Divya";
        t16.specialization = "Aerobics";
        t16.experience = 2;
        t16.salary = 20000;

        g16.trainer = t16;
        g16.getGymDetails();


        Gym g17 = new Gym();
        g17.gymName = "Muscle Mania";
        g17.location = "Vizag";
        g17.totalMembers = 140;
        g17.monthlyFee = 1700;
        g17.gymType = "Premium";

        Trainer t17 = new Trainer();
        t17.trainerId = 17;
        t17.name = "Rohit";
        t17.specialization = "Strength Training";
        t17.experience = 6;
        t17.salary = 32000;

        g17.trainer = t17;
        g17.getGymDetails();


        Gym g18 = new Gym();
        g18.gymName = "Pro Fitness";
        g18.location = "Patna";
        g18.totalMembers = 90;
        g18.monthlyFee = 1200;
        g18.gymType = "Standard";

        Trainer t18 = new Trainer();
        t18.trainerId = 18;
        t18.name = "Sunita";
        t18.specialization = "Yoga";
        t18.experience = 5;
        t18.salary = 28000;

        g18.trainer = t18;
        g18.getGymDetails();


        Gym g19 = new Gym();
        g19.gymName = "Elite Gym";
        g19.location = "Chandigarh";
        g19.totalMembers = 110;
        g19.monthlyFee = 1500;
        g19.gymType = "Premium";

        Trainer t19 = new Trainer();
        t19.trainerId = 19;
        t19.name = "Amit";
        t19.specialization = "CrossFit";
        t19.experience = 7;
        t19.salary = 35000;

        g19.trainer = t19;
        g19.getGymDetails();


        Gym g20 = new Gym();
        g20.gymName = "Active Fitness";
        g20.location = "Udupi";
        g20.totalMembers = 50;
        g20.monthlyFee = 700;
        g20.gymType = "Basic";

        Trainer t20 = new Trainer();
        t20.trainerId = 20;
        t20.name = "Neha";
        t20.specialization = "Zumba";
        t20.experience = 3;
        t20.salary = 22000;

        g20.trainer = t20;
        g20.getGymDetails();
    }
}