class FreelancerExecutor{

    public static void main(String[] args) {

        Freelancer f1 = new Freelancer();
        f1.freelancerName = "Rahul";
        f1.skill = "Web Development";
        f1.experience = 5;
        f1.hourlyRate = 500;
        f1.platform = "Upwork";

        Client c1 = new Client();
        c1.clientId = 1;
        c1.name = "Amit";
        c1.company = "TechSoft";
        c1.projectBudget = 20000;
        c1.projectType = "Website";

        f1.client = c1;
        f1.getFreelancerDetails();


        Freelancer f2 = new Freelancer();
        f2.freelancerName = "Sneha";
        f2.skill = "Graphic Design";
        f2.experience = 4;
        f2.hourlyRate = 400;
        f2.platform = "Fiverr";

        Client c2 = new Client();
        c2.clientId = 2;
        c2.name = "Kiran";
        c2.company = "DesignPro";
        c2.projectBudget = 15000;
        c2.projectType = "Logo Design";

        f2.client = c2;
        f2.getFreelancerDetails();

        Freelancer f3 = new Freelancer();
        f3.freelancerName = "Arjun";
        f3.skill = "App Development";
        f3.experience = 6;
        f3.hourlyRate = 700;
        f3.platform = "Freelancer";

        Client c3 = new Client();
        c3.clientId = 3;
        c3.name = "Priya";
        c3.company = "MobileHub";
        c3.projectBudget = 50000;
        c3.projectType = "Android App";

        f3.client = c3;
        f3.getFreelancerDetails();


        Freelancer f4 = new Freelancer();
        f4.freelancerName = "Priya";
        f4.skill = "Content Writing";
        f4.experience = 3;
        f4.hourlyRate = 300;
        f4.platform = "Upwork";

        Client c4 = new Client();
        c4.clientId = 4;
        c4.name = "Rohit";
        c4.company = "BlogWorld";
        c4.projectBudget = 10000;
        c4.projectType = "Articles";

        f4.client = c4;
        f4.getFreelancerDetails();

        Freelancer f5 = new Freelancer();
        f5.freelancerName = "Kiran";
        f5.skill = "SEO";
        f5.experience = 5;
        f5.hourlyRate = 450;
        f5.platform = "Fiverr";

        Client c5 = new Client();
        c5.clientId = 5;
        c5.name = "Meena";
        c5.company = "RankBoost";
        c5.projectBudget = 18000;
        c5.projectType = "SEO Optimization";

        f5.client = c5;
        f5.getFreelancerDetails();


        Freelancer f6 = new Freelancer();
        f6.freelancerName = "Ramesh";
        f6.skill = "Video Editing";
        f6.experience = 4;
        f6.hourlyRate = 350;
        f6.platform = "Freelancer";

        Client c6 = new Client();
        c6.clientId = 6;
        c6.name = "Anil";
        c6.company = "MediaHouse";
        c6.projectBudget = 22000;
        c6.projectType = "Video Ads";

        f6.client = c6;
        f6.getFreelancerDetails();

        Freelancer f7 = new Freelancer();
        f7.freelancerName = "Divya";
        f7.skill = "UI/UX Design";
        f7.experience = 5;
        f7.hourlyRate = 600;
        f7.platform = "Upwork";

        Client c7 = new Client();
        c7.clientId = 7;
        c7.name = "Neha";
        c7.company = "DesignStudio";
        c7.projectBudget = 30000;
        c7.projectType = "App Design";

        f7.client = c7;
        f7.getFreelancerDetails();


        Freelancer f8 = new Freelancer();
        f8.freelancerName = "Suresh";
        f8.skill = "Data Analysis";
        f8.experience = 7;
        f8.hourlyRate = 800;
        f8.platform = "Freelancer";

        Client c8 = new Client();
        c8.clientId = 8;
        c8.name = "Sunita";
        c8.company = "DataCorp";
        c8.projectBudget = 40000;
        c8.projectType = "Analytics";

        f8.client = c8;
        f8.getFreelancerDetails();


        Freelancer f9 = new Freelancer();
        f9.freelancerName = "Anjali";
        f9.skill = "Digital Marketing";
        f9.experience = 6;
        f9.hourlyRate = 550;
        f9.platform = "Fiverr";

        Client c9 = new Client();
        c9.clientId = 9;
        c9.name = "Amit";
        c9.company = "MarketPro";
        c9.projectBudget = 25000;
        c9.projectType = "Campaign";

        f9.client = c9;
        f9.getFreelancerDetails();

        Freelancer f10 = new Freelancer();
        f10.freelancerName = "Deepak";
        f10.skill = "Cyber Security";
        f10.experience = 8;
        f10.hourlyRate = 900;
        f10.platform = "Upwork";

        Client c10 = new Client();
        c10.clientId = 10;
        c10.name = "Raj";
        c10.company = "SecureTech";
        c10.projectBudget = 60000;
        c10.projectType = "Security Audit";

        f10.client = c10;
        f10.getFreelancerDetails();

        Freelancer f11 = new Freelancer();
        f11.freelancerName = "Vikram";
        f11.skill = "Cloud Computing";
        f11.experience = 7;
        f11.hourlyRate = 850;
        f11.platform = "Freelancer";

        Client c11 = new Client();
        c11.clientId = 11;
        c11.name = "Pooja";
        c11.company = "CloudNet";
        c11.projectBudget = 45000;
        c11.projectType = "Cloud Setup";

        f11.client = c11;
        f11.getFreelancerDetails();


        Freelancer f12 = new Freelancer();
        f12.freelancerName = "Pooja";
        f12.skill = "Testing";
        f12.experience = 4;
        f12.hourlyRate = 400;
        f12.platform = "Fiverr";

        Client c12 = new Client();
        c12.clientId = 12;
        c12.name = "Manoj";
        c12.company = "TestLab";
        c12.projectBudget = 15000;
        c12.projectType = "Software Testing";

        f12.client = c12;
        f12.getFreelancerDetails();


        Freelancer f13 = new Freelancer();
        f13.freelancerName = "Manoj";
        f13.skill = "DevOps";
        f13.experience = 6;
        f13.hourlyRate = 750;
        f13.platform = "Upwork";

        Client c13 = new Client();
        c13.clientId = 13;
        c13.name = "Kavya";
        c13.company = "DeployNow";
        c13.projectBudget = 35000;
        c13.projectType = "CI/CD Setup";

        f13.client = c13;
        f13.getFreelancerDetails();


        Freelancer f14 = new Freelancer();
        f14.freelancerName = "Kavya";
        f14.skill = "Animation";
        f14.experience = 5;
        f14.hourlyRate = 500;
        f14.platform = "Freelancer";

        Client c14 = new Client();
        c14.clientId = 14;
        c14.name = "Nithin";
        c14.company = "Animex";
        c14.projectBudget = 20000;
        c14.projectType = "Animation Video";

        f14.client = c14;
        f14.getFreelancerDetails();


        Freelancer f15 = new Freelancer();
        f15.freelancerName = "Nithin";
        f15.skill = "Blockchain";
        f15.experience = 7;
        f15.hourlyRate = 900;
        f15.platform = "Upwork";

        Client c15 = new Client();
        c15.clientId = 15;
        c15.name = "Divya";
        c15.company = "CryptoTech";
        c15.projectBudget = 70000;
        c15.projectType = "Smart Contract";

        f15.client = c15;
        f15.getFreelancerDetails();


        Freelancer f16 = new Freelancer();
        f16.freelancerName = "Divakar";
        f16.skill = "Machine Learning";
        f16.experience = 8;
        f16.hourlyRate = 1000;
        f16.platform = "Freelancer";

        Client c16 = new Client();
        c16.clientId = 16;
        c16.name = "Rohit";
        c16.company = "AI Labs";
        c16.projectBudget = 80000;
        c16.projectType = "ML Model";

        f16.client = c16;
        f16.getFreelancerDetails();


        Freelancer f17 = new Freelancer();
        f17.freelancerName = "Rohit";
        f17.skill = "Game Development";
        f17.experience = 6;
        f17.hourlyRate = 700;
        f17.platform = "Fiverr";

        Client c17 = new Client();
        c17.clientId = 17;
        c17.name = "Sunil";
        c17.company = "GameZone";
        c17.projectBudget = 50000;
        c17.projectType = "Mobile Game";

        f17.client = c17;
        f17.getFreelancerDetails();


        Freelancer f18 = new Freelancer();
        f18.freelancerName = "Sunita";
        f18.skill = "HR Consulting";
        f18.experience = 9;
        f18.hourlyRate = 600;
        f18.platform = "Upwork";

        Client c18 = new Client();
        c18.clientId = 18;
        c18.name = "Amit";
        c18.company = "HirePro";
        c18.projectBudget = 30000;
        c18.projectType = "Recruitment";

        f18.client = c18;
        f18.getFreelancerDetails();


        Freelancer f19 = new Freelancer();
        f19.freelancerName = "Amit";
        f19.skill = "Networking";
        f19.experience = 7;
        f19.hourlyRate = 650;
        f19.platform = "Freelancer";

        Client c19 = new Client();
        c19.clientId = 19;
        c19.name = "Neha";
        c19.company = "NetSolutions";
        c19.projectBudget = 35000;
        c19.projectType = "Network Setup";

        f19.client = c19;
        f19.getFreelancerDetails();


        Freelancer f20 = new Freelancer();
        f20.freelancerName = "Neha";
        f20.skill = "Photography";
        f20.experience = 5;
        f20.hourlyRate = 500;
        f20.platform = "Fiverr";

        Client c20 = new Client();
        c20.clientId = 20;
        c20.name = "Rajesh";
        c20.company = "PhotoStudio";
        c20.projectBudget = 20000;
        c20.projectType = "Photoshoot";

        f20.client = c20;
        f20.getFreelancerDetails();
    }
}